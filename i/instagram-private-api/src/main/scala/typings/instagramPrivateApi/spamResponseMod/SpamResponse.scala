package typings.instagramPrivateApi.spamResponseMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiStrings.fail
import typings.instagramPrivateApi.instagramPrivateApiStrings.feedback_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpamResponse extends js.Object {
  
  var error_type: js.UndefOr[String] = js.native
  
  var feedback_action: String = js.native
  
  var feedback_appeal_label: String = js.native
  
  var feedback_ignore_label: String = js.native
  
  var feedback_message: String = js.native
  
  var feedback_title: String = js.native
  
  var feedback_url: String = js.native
  
  var message: feedback_required = js.native
  
  var spam: `true` = js.native
  
  var status: fail = js.native
}
object SpamResponse {
  
  @scala.inline
  def apply(
    feedback_action: String,
    feedback_appeal_label: String,
    feedback_ignore_label: String,
    feedback_message: String,
    feedback_title: String,
    feedback_url: String,
    message: feedback_required,
    spam: `true`,
    status: fail
  ): SpamResponse = {
    val __obj = js.Dynamic.literal(feedback_action = feedback_action.asInstanceOf[js.Any], feedback_appeal_label = feedback_appeal_label.asInstanceOf[js.Any], feedback_ignore_label = feedback_ignore_label.asInstanceOf[js.Any], feedback_message = feedback_message.asInstanceOf[js.Any], feedback_title = feedback_title.asInstanceOf[js.Any], feedback_url = feedback_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamResponse]
  }
  
  @scala.inline
  implicit class SpamResponseOps[Self <: SpamResponse] (val x: Self) extends AnyVal {
    
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
    def setFeedback_action(value: String): Self = this.set("feedback_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_appeal_label(value: String): Self = this.set("feedback_appeal_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_ignore_label(value: String): Self = this.set("feedback_ignore_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_message(value: String): Self = this.set("feedback_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_title(value: String): Self = this.set("feedback_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback_url(value: String): Self = this.set("feedback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: feedback_required): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpam(value: `true`): Self = this.set("spam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: fail): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_type(value: String): Self = this.set("error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_type: Self = this.set("error_type", js.undefined)
  }
}
