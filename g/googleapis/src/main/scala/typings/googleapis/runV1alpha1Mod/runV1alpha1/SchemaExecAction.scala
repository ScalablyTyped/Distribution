package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaExecAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecAction]
  }
  
  @scala.inline
  implicit class SchemaExecActionOps[Self <: SchemaExecAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
  }
}
