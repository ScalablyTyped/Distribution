package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFollowing extends js.Object {
  var following: Boolean
  var pyong: Boolean
}

object AnonFollowing {
  @scala.inline
  def apply(following: Boolean, pyong: Boolean): AnonFollowing = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFollowing]
  }
}

