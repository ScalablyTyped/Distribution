package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxValueNumber extends StObject {
  
  var argumentType: ArgumentTypes
  
  var maxValue: Double
  
  var minValue: Double
  
  var optionalArg: Unit
}
object MaxValueNumber {
  
  inline def apply(argumentType: ArgumentTypes, maxValue: Double, minValue: Double, optionalArg: Unit): MaxValueNumber = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxValueNumber]
  }
  
  extension [Self <: MaxValueNumber](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Unit): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
