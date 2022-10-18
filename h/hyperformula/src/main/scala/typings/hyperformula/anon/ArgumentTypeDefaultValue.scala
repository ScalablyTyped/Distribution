package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeDefaultValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Boolean
  
  var passSubtype: Boolean
}
object ArgumentTypeDefaultValue {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Boolean, passSubtype: Boolean): ArgumentTypeDefaultValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeDefaultValue]
  }
  
  extension [Self <: ArgumentTypeDefaultValue](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Boolean): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
