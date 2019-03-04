package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomUserIdId extends EventIdentifier {
  var intercom_user_id: java.lang.String
}

object IntercomUserIdId {
  @scala.inline
  def apply(intercom_user_id: java.lang.String): IntercomUserIdId = {
    val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id)
  
    __obj.asInstanceOf[IntercomUserIdId]
  }
}

