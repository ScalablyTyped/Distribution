package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypesDefaultValueBoolean extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Boolean
}
object ArgumentTypeArgumentTypesDefaultValueBoolean {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Boolean): ArgumentTypeArgumentTypesDefaultValueBoolean = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypesDefaultValueBoolean]
  }
  
  extension [Self <: ArgumentTypeArgumentTypesDefaultValueBoolean](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
