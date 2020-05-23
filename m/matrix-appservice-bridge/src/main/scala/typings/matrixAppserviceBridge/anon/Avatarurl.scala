package typings.matrixAppserviceBridge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatarurl extends js.Object {
  var avatar_url: String
  var display_name: String
}

object Avatarurl {
  @scala.inline
  def apply(avatar_url: String, display_name: String): Avatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarurl]
  }
}

