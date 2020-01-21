package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for an alert feedback listing request.
  */
@js.native
trait SchemaListAlertFeedbackResponse extends js.Object {
  /**
    * The list of alert feedback. Feedback entries for each alert are ordered
    * by creation time descending.
    */
  var feedback: js.UndefOr[js.Array[SchemaAlertFeedback]] = js.native
}

object SchemaListAlertFeedbackResponse {
  @scala.inline
  def apply(feedback: js.Array[SchemaAlertFeedback] = null): SchemaListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAlertFeedbackResponse]
  }
}

