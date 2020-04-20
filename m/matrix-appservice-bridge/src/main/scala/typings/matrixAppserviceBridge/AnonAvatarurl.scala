package typings.matrixAppserviceBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatarurl extends js.Object {
  var avatar_url: String
  var display_name: String
}

object AnonAvatarurl {
  @scala.inline
  def apply(avatar_url: String, display_name: String): AnonAvatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatarurl]
  }
}

