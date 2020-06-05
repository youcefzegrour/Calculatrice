package TestCalcul;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainCalcul.CalculatriceService;



public class TestCalculatrice {
	private CalculatriceService Calculatrice;
	private int a,b;
	@BeforeEach
	public void setup() {
		System.out.println("Avant la méthode de test");
		 Calculatrice=new CalculatriceService();
		 int b=0;
	}
	@Test
	public void additionnerTest()
	{
		assertEquals( Calculatrice.additionner(9, 9) , 18);
	}
	 @Test
	    void divisionTest() {
	        System.out.println("inside divisionTest");
	        assertThrows(ArithmeticException.class, () -> Calculatrice.devision(a,b));
	    }
	@Test
	  void verifierTimeout() {
	    Assertions.assertTimeout(Duration.ofMillis(200), () -> {
	    	 CalculatriceService.additionner(9, 9) ;
	    });
	   
	  }
		
	
	
	@AfterEach
	public void teardown() {
		System.out.println("apres la méthode de test");
		Calculatrice=null;
	}

}
