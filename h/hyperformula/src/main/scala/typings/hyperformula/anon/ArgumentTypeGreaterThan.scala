package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeGreaterThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Unit
  
  var maxValue: Unit
  
  var minValue: Double
}
object ArgumentTypeGreaterThan {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Unit, maxValue: Unit, minValue: Double): ArgumentTypeGreaterThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeGreaterThan]
  }
  
  extension [Self <: ArgumentTypeGreaterThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Unit): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Unit): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
