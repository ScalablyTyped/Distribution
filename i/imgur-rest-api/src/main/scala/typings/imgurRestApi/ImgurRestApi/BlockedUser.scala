package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedUser extends js.Object {
  var blocked_id: Double
  var blocked_url: String
}

object BlockedUser {
  @scala.inline
  def apply(blocked_id: Double, blocked_url: String): BlockedUser = {
    val __obj = js.Dynamic.literal(blocked_id = blocked_id.asInstanceOf[js.Any], blocked_url = blocked_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedUser]
  }
}

