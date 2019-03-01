package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdId extends EventIdentifier {
  var user_id: java.lang.String
}

object UserIdId {
  @scala.inline
  def apply(user_id: java.lang.String): UserIdId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[UserIdId]
  }
}

