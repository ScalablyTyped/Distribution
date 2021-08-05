package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExecAction describes a &quot;run in container&quot; action.
  */
trait SchemaExecAction extends StObject {
  
  /**
    * Command is the command line to execute inside the container, the working
    * directory for the command  is root (&#39;/&#39;) in the container&#39;s
    * filesystem. The command is simply exec&#39;d, it is not run inside a
    * shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t
    * work. To use a shell, you need to explicitly call out to that shell. Exit
    * status of 0 is treated as live/healthy and non-zero is unhealthy.
    * +optional
    */
  var command: js.UndefOr[String] = js.undefined
}
object SchemaExecAction {
  
  inline def apply(): SchemaExecAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecAction]
  }
  
  extension [Self <: SchemaExecAction](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
