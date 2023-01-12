package typings.hyperformula.anon

import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeOptionalArg extends StObject {
  
  var argumentType: ArgumentTypes
  
  var optionalArg: Boolean
}
object ArgumentTypeOptionalArg {
  
  inline def apply(argumentType: ArgumentTypes, optionalArg: Boolean): ArgumentTypeOptionalArg = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeOptionalArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentTypeOptionalArg] (val x: Self) extends AnyVal {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
