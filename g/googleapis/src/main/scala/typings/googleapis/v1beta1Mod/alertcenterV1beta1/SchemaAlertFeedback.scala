package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A customer feedback about an alert.
  */
@js.native
trait SchemaAlertFeedback extends js.Object {
  /**
    * Output only. The alert identifier.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Output only. The time this feedback was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier of the Google account of the customer.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Output only. The email of the user that provided the feedback.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier for the feedback.
    */
  var feedbackId: js.UndefOr[String] = js.native
  /**
    * Required. The type of the feedback.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlertFeedback {
  @scala.inline
  def apply(
    alertId: String = null,
    createTime: String = null,
    customerId: String = null,
    email: String = null,
    feedbackId: String = null,
    `type`: String = null
  ): SchemaAlertFeedback = {
    val __obj = js.Dynamic.literal()
    if (alertId != null) __obj.updateDynamic("alertId")(alertId.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (feedbackId != null) __obj.updateDynamic("feedbackId")(feedbackId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAlertFeedback]
  }
}

