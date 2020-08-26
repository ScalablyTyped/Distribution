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
  def apply(): SchemaListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertFeedbackResponse]
  }
  @scala.inline
  implicit class SchemaListAlertFeedbackResponseOps[Self <: SchemaListAlertFeedbackResponse] (val x: Self) extends AnyVal {
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
    def setFeedbackVarargs(value: SchemaAlertFeedback*): Self = this.set("feedback", js.Array(value :_*))
    @scala.inline
    def setFeedback(value: js.Array[SchemaAlertFeedback]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
  }
  
}

