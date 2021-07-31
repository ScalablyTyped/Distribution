package typings.joiPasswordComplexity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("joi-password-complexity", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with PasswordComplexity {
    def this(options: ComplexityOptions) = this()
  }
  
  trait ComplexityOptions extends StObject {
    
    var lowerCase: Double
    
    var max: Double
    
    var min: Double
    
    var numeric: Double
    
    var requirementCount: Double
    
    var symbol: Double
    
    var upperCase: Double
  }
  object ComplexityOptions {
    
    @scala.inline
    def apply(
      lowerCase: Double,
      max: Double,
      min: Double,
      numeric: Double,
      requirementCount: Double,
      symbol: Double,
      upperCase: Double
    ): ComplexityOptions = {
      val __obj = js.Dynamic.literal(lowerCase = lowerCase.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], requirementCount = requirementCount.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], upperCase = upperCase.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComplexityOptions]
    }
    
    @scala.inline
    implicit class ComplexityOptionsMutableBuilder[Self <: ComplexityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowerCase(value: Double): Self = StObject.set(x, "lowerCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: Double): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementCount(value: Double): Self = StObject.set(x, "requirementCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: Double): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpperCase(value: Double): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
    }
  }
  
  trait PasswordComplexity extends StObject
}
