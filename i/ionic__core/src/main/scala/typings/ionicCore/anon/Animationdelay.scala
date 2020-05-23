package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animationdelay extends js.Object {
  var `animation-delay`: String
  var left: String
  var top: String
}

object Animationdelay {
  @scala.inline
  def apply(`animation-delay`: String, left: String, top: String): Animationdelay = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animationdelay]
  }
}

