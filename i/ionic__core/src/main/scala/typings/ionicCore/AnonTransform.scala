package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform extends js.Object {
  var `animation-delay`: String
  var transform: String
}

object AnonTransform {
  @scala.inline
  def apply(`animation-delay`: String, transform: String): AnonTransform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransform]
  }
}

