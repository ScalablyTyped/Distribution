package typings.hyperformula.anon

import typings.hyperformula.functionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalArg extends StObject {
  
  var argumentType: ArgumentTypes
  
  var optionalArg: Unit
}
object OptionalArg {
  
  inline def apply(argumentType: ArgumentTypes, optionalArg: Unit): OptionalArg = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalArg]
  }
  
  extension [Self <: OptionalArg](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Unit): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
