package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic tool step to be used for binaries we do not explicitly support. For
  * example: running cp to copy artifacts from one location to another.
  */
@js.native
trait SchemaToolExecutionStep extends js.Object {
  
  /**
    * A Tool execution.  - In response: present if set by create/update request
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}
object SchemaToolExecutionStep {
  
  @scala.inline
  def apply(): SchemaToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExecutionStep]
  }
  
  @scala.inline
  implicit class SchemaToolExecutionStepOps[Self <: SchemaToolExecutionStep] (val x: Self) extends AnyVal {
    
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
    def setToolExecution(value: SchemaToolExecution): Self = this.set("toolExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolExecution: Self = this.set("toolExecution", js.undefined)
  }
}
