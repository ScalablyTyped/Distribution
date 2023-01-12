package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueBoolean extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Boolean
  
  var minValue: Unit
}
object DefaultValueBoolean {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Boolean, minValue: Unit): DefaultValueBoolean = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValueBoolean] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
