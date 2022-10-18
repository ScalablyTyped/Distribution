package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeDefaultValueMaxValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var maxValue: Unit
  
  var minValue: Double
}
object ArgumentTypeDefaultValueMaxValue {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, maxValue: Unit, minValue: Double): ArgumentTypeDefaultValueMaxValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeDefaultValueMaxValue]
  }
  
  extension [Self <: ArgumentTypeDefaultValueMaxValue](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Unit): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
