package typings.ionic.definitionsMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitCodeException
  extends StObject
     with Error {
  
  var exitCode: Double
}
object ExitCodeException {
  
  inline def apply(exitCode: Double, message: String, name: String): ExitCodeException = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitCodeException]
  }
  
  extension [Self <: ExitCodeException](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
