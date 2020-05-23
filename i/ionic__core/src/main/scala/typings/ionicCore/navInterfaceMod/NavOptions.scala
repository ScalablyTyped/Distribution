package typings.ionicCore.navInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
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
    animationBuilder: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    delegate: FrameworkDelegate = null,
    direction: NavDirection = null,
    duration: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(js.Any.fromFunction2(animationBuilder))
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait.get.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL.get.asInstanceOf[js.Any])
    if (viewIsReady != null) __obj.updateDynamic("viewIsReady")(js.Any.fromFunction1(viewIsReady))
    __obj.asInstanceOf[NavOptions]
  }
}

