package typings.ionicAngular.navControllerMod

import typings.ionicAngular.ionicAngularStrings.back
import typings.ionicAngular.ionicAngularStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var animationDirection: js.UndefOr[forward | back] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, animationDirection: forward | back = null): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

