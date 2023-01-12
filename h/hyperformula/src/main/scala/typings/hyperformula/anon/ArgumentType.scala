package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentType extends StObject {
  
  var argumentType: ArgumentTypes
}
object ArgumentType {
  
  inline def apply(argumentType: ArgumentTypes): ArgumentType = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentType] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
  }
}
