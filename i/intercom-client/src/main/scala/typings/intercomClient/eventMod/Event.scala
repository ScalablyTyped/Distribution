package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<intercom-client.intercom-client/Event.UserIdId> */
/* Inlined parent std.Partial<intercom-client.intercom-client/Event.IntercomUserIdId> */
/* Inlined parent std.Partial<intercom-client.intercom-client/Event.EmailIdId> */
trait Event extends js.Object {
  var created_at: Double
  var email: js.UndefOr[String] = js.undefined
  var event_name: String
  val id: String
  var intercom_user_id: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    created_at: Double,
    event_name: String,
    id: String,
    email: String = null,
    intercom_user_id: String = null,
    metadata: js.Any = null,
    user_id: String = null
  ): Event = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], event_name = event_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (intercom_user_id != null) __obj.updateDynamic("intercom_user_id")(intercom_user_id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

