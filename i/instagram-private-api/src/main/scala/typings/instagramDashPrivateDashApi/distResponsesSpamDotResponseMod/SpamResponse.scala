package typings.instagramDashPrivateDashApi.distResponsesSpamDotResponseMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.fail
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feedback_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamResponse extends js.Object {
  var error_type: js.UndefOr[String] = js.undefined
  var feedback_action: String
  var feedback_appeal_label: String
  var feedback_ignore_label: String
  var feedback_message: String
  var feedback_title: String
  var feedback_url: String
  var message: feedback_required
  var spam: `true`
  var status: fail
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
    status: fail,
    error_type: String = null
  ): SpamResponse = {
    val __obj = js.Dynamic.literal(feedback_action = feedback_action, feedback_appeal_label = feedback_appeal_label, feedback_ignore_label = feedback_ignore_label, feedback_message = feedback_message, feedback_title = feedback_title, feedback_url = feedback_url, message = message, spam = spam, status = status)
    if (error_type != null) __obj.updateDynamic("error_type")(error_type)
    __obj.asInstanceOf[SpamResponse]
  }
}

