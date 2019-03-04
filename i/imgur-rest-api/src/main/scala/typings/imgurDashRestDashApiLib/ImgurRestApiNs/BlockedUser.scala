package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedUser extends js.Object {
  var blocked_id: scala.Double
  var blocked_url: java.lang.String
}

object BlockedUser {
  @scala.inline
  def apply(blocked_id: scala.Double, blocked_url: java.lang.String): BlockedUser = {
    val __obj = js.Dynamic.literal(blocked_id = blocked_id, blocked_url = blocked_url)
  
    __obj.asInstanceOf[BlockedUser]
  }
}

