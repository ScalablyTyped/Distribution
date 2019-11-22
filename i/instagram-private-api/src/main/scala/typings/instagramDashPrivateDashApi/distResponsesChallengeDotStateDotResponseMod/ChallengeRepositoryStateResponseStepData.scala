package typings.instagramDashPrivateDashApi.distResponsesChallengeDotStateDotResponseMod

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
    val __obj = js.Dynamic.literal(big_blue_token = big_blue_token, choice = choice, contact_point = contact_point, email = email, fb_access_token = fb_access_token, form_type = form_type, google_oauth_token = google_oauth_token, resend_delay = resend_delay, security_code = security_code)
  
    __obj.asInstanceOf[ChallengeRepositoryStateResponseStepData]
  }
}

