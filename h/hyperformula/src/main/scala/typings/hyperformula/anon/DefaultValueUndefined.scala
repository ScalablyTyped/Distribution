package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueUndefined extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
}
object DefaultValueUndefined {
  
  inline def apply(argumentType: ArgumentTypes, defaultValue: Unit): DefaultValueUndefined = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueUndefined]
  }
  
  extension [Self <: DefaultValueUndefined](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
