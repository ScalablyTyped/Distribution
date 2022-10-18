package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LessThanMinValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Double
  
  var lessThan: Unit
  
  var minValue: Unit
  
  var optionalArg: Boolean
}
object LessThanMinValue {
  
  inline def apply(
    argumentType: ArgumentTypes,
    defaultValue: Double,
    lessThan: Unit,
    minValue: Unit,
    optionalArg: Boolean
  ): LessThanMinValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LessThanMinValue]
  }
  
  extension [Self <: LessThanMinValue](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Unit): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
