package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeDefaultValueGreaterThanMaxValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var greaterThan: Double
  
  var maxValue: Unit
}
object ArgumentTypeDefaultValueGreaterThanMaxValue {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, greaterThan: Double, maxValue: Unit): ArgumentTypeDefaultValueGreaterThanMaxValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeDefaultValueGreaterThanMaxValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentTypeDefaultValueGreaterThanMaxValue] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Unit): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
  }
}
