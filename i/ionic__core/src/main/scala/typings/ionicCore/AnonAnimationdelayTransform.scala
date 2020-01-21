package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationdelayTransform extends js.Object {
  var `animation-delay`: String
  var transform: String
}

object AnonAnimationdelayTransform {
  @scala.inline
  def apply(`animation-delay`: String, transform: String): AnonAnimationdelayTransform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationdelayTransform]
  }
}

