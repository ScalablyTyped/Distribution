package typings.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the execution of a container results in a non-zero
  * exit status that was not otherwise ignored. Execution will continue, but
  * only actions that are flagged as `ALWAYS_RUN` will be executed. Other
  * actions will be skipped.
  */
@js.native
trait SchemaUnexpectedExitStatusEvent extends js.Object {
  
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
  
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
}
object SchemaUnexpectedExitStatusEvent {
  
  @scala.inline
  def apply(): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
  
  @scala.inline
  implicit class SchemaUnexpectedExitStatusEventOps[Self <: SchemaUnexpectedExitStatusEvent] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: Double): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setExitStatus(value: Double): Self = this.set("exitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitStatus: Self = this.set("exitStatus", js.undefined)
  }
}
