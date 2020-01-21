package typings.ionicCore.transitionMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.ionicCore.navInterfaceMod.NavDirection
import typings.ionicCore.navInterfaceMod.NavOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends NavOptions {
  var baseEl: js.Any
  var enteringEl: HTMLElement
  var leavingEl: js.UndefOr[HTMLElement] = js.undefined
  var progressCallback: js.UndefOr[
    js.Function1[
      /* ani */ js.UndefOr[Animation | typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation], 
      Unit
    ]
  ] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(
    baseEl: js.Any,
    enteringEl: HTMLElement,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationBuilder: (/* Animation */ typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation] = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    delegate: FrameworkDelegate = null,
    direction: NavDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leavingEl: HTMLElement = null,
    mode: Mode = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    progressCallback: /* ani */ js.UndefOr[Animation | typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation] => Unit = null,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined,
    updateURL: js.UndefOr[Boolean] = js.undefined,
    viewIsReady: /* enteringEl */ HTMLElement => js.Promise[_] = null
  ): TransitionOptions = {
    val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(js.Any.fromFunction3(animationBuilder))
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leavingEl != null) __obj.updateDynamic("leavingEl")(leavingEl.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation.asInstanceOf[js.Any])
    if (progressCallback != null) __obj.updateDynamic("progressCallback")(js.Any.fromFunction1(progressCallback))
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy.asInstanceOf[js.Any])
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL.asInstanceOf[js.Any])
    if (viewIsReady != null) __obj.updateDynamic("viewIsReady")(js.Any.fromFunction1(viewIsReady))
    __obj.asInstanceOf[TransitionOptions]
  }
}

