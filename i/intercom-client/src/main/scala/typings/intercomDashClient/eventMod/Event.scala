package typings.intercomDashClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof intercom-client.intercom-client/Event.UserIdId ]:? intercom-client.intercom-client/Event.UserIdId[P]}
- Dropped {[ P in keyof intercom-client.intercom-client/Event.IntercomUserIdId ]:? intercom-client.intercom-client/Event.IntercomUserIdId[P]}
- Dropped {[ P in keyof intercom-client.intercom-client/Event.EmailIdId ]:? intercom-client.intercom-client/Event.EmailIdId[P]} */ trait Event extends js.Object {
  var created_at: Double
  var event_name: String
  val id: String
  var metadata: js.UndefOr[js.Any] = js.undefined
}

object Event {
  @scala.inline
  def apply(created_at: Double, event_name: String, id: String, metadata: js.Any = null): Event = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], event_name = event_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

