package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeReason extends js.Object {
  
  var DisputeReasonMessage: String = js.native
  
  var DisputeReasonType: typings.mangopay2NodejsSdk.mod.dispute.DisputeReasonType = js.native
}
object DisputeReason {
  
  @scala.inline
  def apply(DisputeReasonMessage: String, DisputeReasonType: DisputeReasonType): DisputeReason = {
    val __obj = js.Dynamic.literal(DisputeReasonMessage = DisputeReasonMessage.asInstanceOf[js.Any], DisputeReasonType = DisputeReasonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeReason]
  }
  
  @scala.inline
  implicit class DisputeReasonOps[Self <: DisputeReason] (val x: Self) extends AnyVal {
    
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
    def setDisputeReasonMessage(value: String): Self = this.set("DisputeReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputeReasonType(value: DisputeReasonType): Self = this.set("DisputeReasonType", value.asInstanceOf[js.Any])
  }
}
