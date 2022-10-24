package typings.joiPasswordComplexity

import typings.joi.mod.StringSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("joi-password-complexity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): JoiPasswordComplexity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[JoiPasswordComplexity]
  inline def default(param0: Unit, label: String): JoiPasswordComplexity = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[JoiPasswordComplexity]
  inline def default(param0: ComplexityOptions): JoiPasswordComplexity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[JoiPasswordComplexity]
  inline def default(param0: ComplexityOptions, label: String): JoiPasswordComplexity = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[JoiPasswordComplexity]
  
  trait ComplexityOptions extends StObject {
    
    var lowerCase: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var numeric: js.UndefOr[Double] = js.undefined
    
    var requirementCount: js.UndefOr[Double] = js.undefined
    
    var symbol: js.UndefOr[Double] = js.undefined
    
    var upperCase: js.UndefOr[Double] = js.undefined
  }
  object ComplexityOptions {
    
    inline def apply(): ComplexityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComplexityOptions]
    }
    
    extension [Self <: ComplexityOptions](x: Self) {
      
      inline def setLowerCase(value: Double): Self = StObject.set(x, "lowerCase", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseUndefined: Self = StObject.set(x, "lowerCase", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNumeric(value: Double): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setRequirementCount(value: Double): Self = StObject.set(x, "requirementCount", value.asInstanceOf[js.Any])
      
      inline def setRequirementCountUndefined: Self = StObject.set(x, "requirementCount", js.undefined)
      
      inline def setSymbol(value: Double): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setUpperCase(value: Double): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    }
  }
  
  @js.native
  trait JoiPasswordComplexity
    extends StObject
       with StringSchema[String] {
    
    def passwordComplexity(): this.type = js.native
  }
}
