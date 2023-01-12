package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypes extends StObject {
  
  var argumentType: ArgumentTypes
  
  var passSubtype: Boolean
}
object ArgumentTypeArgumentTypes {
  
  inline def apply(argumentType: ArgumentTypes, passSubtype: Boolean): ArgumentTypeArgumentTypes = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentTypeArgumentTypes] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Boolean): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
