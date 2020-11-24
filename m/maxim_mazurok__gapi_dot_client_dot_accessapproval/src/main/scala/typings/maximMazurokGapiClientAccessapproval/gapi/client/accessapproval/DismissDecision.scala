package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissDecision extends js.Object {
  
  /** The time at which the approval request was dismissed. */
  var dismissTime: js.UndefOr[String] = js.native
  
  /**
    * This field will be true if the ApprovalRequest was implcitly dismissed due to inaction by the access approval approvers (the request is not acted on by the approvers before the
    * exiration time).
    */
  var `implicit`: js.UndefOr[Boolean] = js.native
}
object DismissDecision {
  
  @scala.inline
  def apply(): DismissDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DismissDecision]
  }
  
  @scala.inline
  implicit class DismissDecisionOps[Self <: DismissDecision] (val x: Self) extends AnyVal {
    
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
    def setDismissTime(value: String): Self = this.set("dismissTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissTime: Self = this.set("dismissTime", js.undefined)
    
    @scala.inline
    def setImplicit(value: Boolean): Self = this.set("implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
  }
}
