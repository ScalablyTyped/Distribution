package typings.instagramPrivateApi.challengeStateResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeRepositoryStateResponseStepData extends js.Object {
  
  var big_blue_token: String = js.native
  
  var choice: String = js.native
  
  var contact_point: String = js.native
  
  var email: String = js.native
  
  var fb_access_token: String = js.native
  
  var form_type: String = js.native
  
  var google_oauth_token: String = js.native
  
  var resend_delay: Double = js.native
  
  var security_code: String = js.native
}
object ChallengeRepositoryStateResponseStepData {
  
  @scala.inline
  def apply(
    big_blue_token: String,
    choice: String,
    contact_point: String,
    email: String,
    fb_access_token: String,
    form_type: String,
    google_oauth_token: String,
    resend_delay: Double,
    security_code: String
  ): ChallengeRepositoryStateResponseStepData = {
    val __obj = js.Dynamic.literal(big_blue_token = big_blue_token.asInstanceOf[js.Any], choice = choice.asInstanceOf[js.Any], contact_point = contact_point.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fb_access_token = fb_access_token.asInstanceOf[js.Any], form_type = form_type.asInstanceOf[js.Any], google_oauth_token = google_oauth_token.asInstanceOf[js.Any], resend_delay = resend_delay.asInstanceOf[js.Any], security_code = security_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeRepositoryStateResponseStepData]
  }
  
  @scala.inline
  implicit class ChallengeRepositoryStateResponseStepDataOps[Self <: ChallengeRepositoryStateResponseStepData] (val x: Self) extends AnyVal {
    
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
    def setBig_blue_token(value: String): Self = this.set("big_blue_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoice(value: String): Self = this.set("choice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact_point(value: String): Self = this.set("contact_point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFb_access_token(value: String): Self = this.set("fb_access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm_type(value: String): Self = this.set("form_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle_oauth_token(value: String): Self = this.set("google_oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResend_delay(value: Double): Self = this.set("resend_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity_code(value: String): Self = this.set("security_code", value.asInstanceOf[js.Any])
  }
}
