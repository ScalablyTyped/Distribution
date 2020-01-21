package typings.ionicAngular

import typings.ionicAngular.ionicAngularStrings.back
import typings.ionicAngular.ionicAngularStrings.forward
import typings.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: js.UndefOr[forward | back] = js.undefined
  var direction: RouterDirection
}

object AnonAnimation {
  @scala.inline
  def apply(direction: RouterDirection, animation: forward | back = null): AnonAnimation = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimation]
  }
}

