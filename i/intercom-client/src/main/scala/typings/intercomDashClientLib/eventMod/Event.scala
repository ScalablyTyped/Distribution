package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Partial<intercom-client.intercom-client/Event.UserIdId>, std.Partial<intercom-client.intercom-client/Event.IntercomUserIdId>, std.Partial<intercom-client.intercom-client/Event.EmailIdId>) */ trait Event extends js.Object {
  var created_at: scala.Double
  var event_name: java.lang.String
  val id: java.lang.String
  var metadata: js.UndefOr[js.Any] = js.undefined
}

