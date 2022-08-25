package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		System.out.println((12 > 8) && (5 > 4));  
	    System.out.println((12 > 8) && (5 < 4));  

	    System.out.println((12 < 8) || (5 > 4)); 
	    System.out.println((12 > 8) || (5 < 4));  
	    System.out.println((12 < 8) || (5 < 4));  

	    System.out.println(!(12 == 8));  
	    System.out.println(!(12 > 8)); 
	}

}
