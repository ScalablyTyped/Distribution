package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var `animation-delay`: String
  var left: String
}

object Left {
  @scala.inline
  def apply(`animation-delay`: String, left: String): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

