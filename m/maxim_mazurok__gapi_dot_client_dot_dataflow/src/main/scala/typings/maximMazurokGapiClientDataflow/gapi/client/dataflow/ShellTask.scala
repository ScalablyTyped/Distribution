package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellTask extends StObject {
  
  /** The shell command to run. */
  var command: js.UndefOr[String] = js.undefined
  
  /** Exit code for the task. */
  var exitCode: js.UndefOr[Double] = js.undefined
}
object ShellTask {
  
  inline def apply(): ShellTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellTask]
  }
  
  extension [Self <: ShellTask](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
  }
}
