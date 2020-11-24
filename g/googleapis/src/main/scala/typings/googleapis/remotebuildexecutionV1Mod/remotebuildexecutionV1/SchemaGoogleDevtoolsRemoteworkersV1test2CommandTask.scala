package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a shell-style task to execute, suitable for providing as the Bots
  * interface&#39;s `Lease.payload` field.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask extends js.Object {
  
  /**
    * The expected outputs from the task.
    */
  var expectedOutputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] = js.native
  
  /**
    * The inputs to the task.
    */
  var inputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] = js.native
  
  /**
    * The timeouts of this task.
    */
  var timeouts: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] = js.native
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask] (val x: Self) extends AnyVal {
    
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
    def setExpectedOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs): Self = this.set("expectedOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedOutputs: Self = this.set("expectedOutputs", js.undefined)
    
    @scala.inline
    def setInputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setTimeouts(value: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts): Self = this.set("timeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeouts: Self = this.set("timeouts", js.undefined)
  }
}
