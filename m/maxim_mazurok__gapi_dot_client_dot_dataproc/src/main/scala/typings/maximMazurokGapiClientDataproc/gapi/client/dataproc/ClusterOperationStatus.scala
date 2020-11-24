package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationStatus extends js.Object {
  
  /** Output only. A message containing any operation metadata details. */
  var details: js.UndefOr[String] = js.native
  
  /** Output only. A message containing the detailed operation state. */
  var innerState: js.UndefOr[String] = js.native
  
  /** Output only. A message containing the operation state. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.native
}
object ClusterOperationStatus {
  
  @scala.inline
  def apply(): ClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStatus]
  }
  
  @scala.inline
  implicit class ClusterOperationStatusOps[Self <: ClusterOperationStatus] (val x: Self) extends AnyVal {
    
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
    def setInnerState(value: String): Self = this.set("innerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerState: Self = this.set("innerState", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateStartTime(value: String): Self = this.set("stateStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStartTime: Self = this.set("stateStartTime", js.undefined)
  }
}
