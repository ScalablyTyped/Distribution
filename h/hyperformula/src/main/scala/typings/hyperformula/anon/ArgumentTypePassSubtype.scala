package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypePassSubtype extends StObject {
  
  var argumentType: ArgumentTypes
  
  var passSubtype: Unit
}
object ArgumentTypePassSubtype {
  
  inline def apply(argumentType: ArgumentTypes, passSubtype: Unit): ArgumentTypePassSubtype = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], passSubtype = passSubtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypePassSubtype]
  }
  
  extension [Self <: ArgumentTypePassSubtype](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setPassSubtype(value: Unit): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
  }
}
