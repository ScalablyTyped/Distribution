package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationdelay extends js.Object {
  var `animation-delay`: String
  var left: String
  var top: String
}

object AnonAnimationdelay {
  @scala.inline
  def apply(`animation-delay`: String, left: String, top: String): AnonAnimationdelay = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationdelay]
  }
}

