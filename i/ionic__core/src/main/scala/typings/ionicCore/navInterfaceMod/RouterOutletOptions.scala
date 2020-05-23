package typings.ionicCore.navInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOutletOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var animationBuilder: js.UndefOr[AnimationBuilder] = js.undefined
  var deepWait: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[NavDirection] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var progressAnimation: js.UndefOr[Boolean] = js.undefined
  var showGoBack: js.UndefOr[Boolean] = js.undefined
  var skipIfBusy: js.UndefOr[Boolean] = js.undefined
}

object RouterOutletOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationBuilder: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    direction: NavDirection = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    mode: Mode = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined
  ): RouterOutletOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(js.Any.fromFunction2(animationBuilder))
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOutletOptions]
  }
}

