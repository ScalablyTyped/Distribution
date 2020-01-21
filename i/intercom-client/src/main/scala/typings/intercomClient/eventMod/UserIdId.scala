package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdId extends EventIdentifier {
  var user_id: String
}

object UserIdId {
  @scala.inline
  def apply(user_id: String): UserIdId = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdId]
  }
}

