package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.AnimationBuilder
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
    animationBuilder: AnimationBuilder = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    direction: NavDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    mode: Mode = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined
  ): RouterOutletOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(animationBuilder)
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation)
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack)
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy)
    __obj.asInstanceOf[RouterOutletOptions]
  }
}

