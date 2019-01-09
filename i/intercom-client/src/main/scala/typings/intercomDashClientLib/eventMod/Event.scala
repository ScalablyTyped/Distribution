package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof intercom-client.intercom-client/Event.UserIdId ]:? intercom-client.intercom-client/Event.UserIdId[P]}
- Dropped {[ P in keyof intercom-client.intercom-client/Event.IntercomUserIdId ]:? intercom-client.intercom-client/Event.IntercomUserIdId[P]}
- Dropped {[ P in keyof intercom-client.intercom-client/Event.EmailIdId ]:? intercom-client.intercom-client/Event.EmailIdId[P]} */ trait Event extends js.Object {
  var created_at: scala.Double
  var event_name: java.lang.String
  val id: java.lang.String
  var metadata: js.UndefOr[js.Any] = js.undefined
}

