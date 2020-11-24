package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatus extends js.Object {
  
  /** Optional. Output only. Job state details, such as an error description if the state is ERROR. */
  var details: js.UndefOr[String] = js.native
  
  /** Output only. A state message specifying the overall job state. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time when this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.native
  
  /** Output only. Additional state information, which includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.native
}
object JobStatus {
  
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateStartTime(value: String): Self = this.set("stateStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStartTime: Self = this.set("stateStartTime", js.undefined)
    
    @scala.inline
    def setSubstate(value: String): Self = this.set("substate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstate: Self = this.set("substate", js.undefined)
  }
}
