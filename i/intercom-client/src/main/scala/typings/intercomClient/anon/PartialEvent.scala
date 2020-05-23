package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Event.Event> */
trait PartialEvent extends js.Object {
  var created_at: js.UndefOr[Double] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var event_name: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var intercom_user_id: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PartialEvent {
  @scala.inline
  def apply(
    created_at: js.UndefOr[Double] = js.undefined,
    email: String = null,
    event_name: String = null,
    id: String = null,
    intercom_user_id: String = null,
    metadata: js.Any = null,
    user_id: String = null
  ): PartialEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(created_at)) __obj.updateDynamic("created_at")(created_at.get.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (event_name != null) __obj.updateDynamic("event_name")(event_name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (intercom_user_id != null) __obj.updateDynamic("intercom_user_id")(intercom_user_id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEvent]
  }
}

