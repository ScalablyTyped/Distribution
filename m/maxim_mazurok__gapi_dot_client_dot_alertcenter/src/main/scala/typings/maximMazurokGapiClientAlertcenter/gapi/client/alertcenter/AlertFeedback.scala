package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertFeedback extends js.Object {
  
  /** Output only. The alert identifier. */
  var alertId: js.UndefOr[String] = js.native
  
  /** Output only. The time this feedback was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier of the Google account of the customer. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Output only. The email of the user that provided the feedback. */
  var email: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier for the feedback. */
  var feedbackId: js.UndefOr[String] = js.native
  
  /** Required. The type of the feedback. */
  var `type`: js.UndefOr[String] = js.native
}
object AlertFeedback {
  
  @scala.inline
  def apply(): AlertFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertFeedback]
  }
  
  @scala.inline
  implicit class AlertFeedbackOps[Self <: AlertFeedback] (val x: Self) extends AnyVal {
    
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
    def setAlertId(value: String): Self = this.set("alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertId: Self = this.set("alertId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFeedbackId(value: String): Self = this.set("feedbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackId: Self = this.set("feedbackId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
