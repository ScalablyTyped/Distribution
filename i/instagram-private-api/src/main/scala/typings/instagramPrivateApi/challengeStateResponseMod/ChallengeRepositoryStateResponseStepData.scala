package typings.instagramPrivateApi.challengeStateResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeRepositoryStateResponseStepData extends js.Object {
  var big_blue_token: String
  var choice: String
  var contact_point: String
  var email: String
  var fb_access_token: String
  var form_type: String
  var google_oauth_token: String
  var resend_delay: Double
  var security_code: String
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
}

