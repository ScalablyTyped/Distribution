package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavOptions extends RouterOutletOptions {
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  var updateURL: js.UndefOr[Boolean] = js.undefined
  var viewIsReady: js.UndefOr[js.Function1[/* enteringEl */ HTMLElement, js.Promise[_]]] = js.undefined
}

object NavOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationBuilder: AnimationBuilder = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    delegate: FrameworkDelegate = null,
    direction: NavDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    mode: Mode = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined,
    updateURL: js.UndefOr[Boolean] = js.undefined,
    viewIsReady: /* enteringEl */ HTMLElement => js.Promise[_] = null
  ): NavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(animationBuilder)
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait)
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation)
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack)
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy)
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL)
    if (viewIsReady != null) __obj.updateDynamic("viewIsReady")(js.Any.fromFunction1(viewIsReady))
    __obj.asInstanceOf[NavOptions]
  }
}

