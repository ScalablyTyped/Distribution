package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationdelayLeft extends js.Object {
  var `animation-delay`: String
  var left: String
}

object AnonAnimationdelayLeft {
  @scala.inline
  def apply(`animation-delay`: String, left: String): AnonAnimationdelayLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationdelayLeft]
  }
}

