package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueNumber extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Double
}
object DefaultValueNumber {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Double): DefaultValueNumber = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValueNumber] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
