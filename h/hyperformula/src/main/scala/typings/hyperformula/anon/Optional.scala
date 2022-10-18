package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optional extends StObject {
  
  var argumentType: ArgumentTypes
  
  var optional: Boolean
}
object Optional {
  
  inline def apply(argumentType: ArgumentTypes, optional: Boolean): Optional = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional]
  }
  
  extension [Self <: Optional](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
