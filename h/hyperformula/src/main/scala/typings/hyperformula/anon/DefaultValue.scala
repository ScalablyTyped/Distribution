package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var passSubtype: Unit
}
object DefaultValue {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit, passSubtype: Unit): DefaultValue = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Unit): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
