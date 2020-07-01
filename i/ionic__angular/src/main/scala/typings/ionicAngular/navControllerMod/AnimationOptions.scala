package typings.ionicAngular.navControllerMod

import typings.ionicAngular.ionicAngularStrings.back
import typings.ionicAngular.ionicAngularStrings.forward
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  var animationDirection: js.UndefOr[forward | back] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    animationDirection: forward | back = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(js.Any.fromFunction2(animation))
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

