package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomUserIdId extends EventIdentifier {
  var intercom_user_id: String
}

object IntercomUserIdId {
  @scala.inline
  def apply(intercom_user_id: String): IntercomUserIdId = {
    val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntercomUserIdId]
  }
}

