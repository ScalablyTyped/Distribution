package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShellTask extends StObject {
  
  /**
    * The shell command to run.
    */
  var command: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Exit code for the task.
    */
  var exitCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaShellTask {
  
  inline def apply(): SchemaShellTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShellTask]
  }
  
  extension [Self <: SchemaShellTask](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeNull: Self = StObject.set(x, "exitCode", null)
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
  }
}
