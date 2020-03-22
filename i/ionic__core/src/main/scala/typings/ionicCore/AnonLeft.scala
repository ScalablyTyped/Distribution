package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var `animation-delay`: String
  var left: String
}

object AnonLeft {
  @scala.inline
  def apply(`animation-delay`: String, left: String): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

