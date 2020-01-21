package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecAction describes a &quot;run in container&quot; action.
  */
@js.native
trait SchemaExecAction extends js.Object {
  /**
    * Command is the command line to execute inside the container, the working
    * directory for the command  is root (&#39;/&#39;) in the container&#39;s
    * filesystem. The command is simply exec&#39;d, it is not run inside a
    * shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t
    * work. To use a shell, you need to explicitly call out to that shell. Exit
    * status of 0 is treated as live/healthy and non-zero is unhealthy.
    * +optional
    */
  var command: js.UndefOr[String] = js.native
}

object SchemaExecAction {
  @scala.inline
  def apply(command: String = null): SchemaExecAction = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExecAction]
  }
}

