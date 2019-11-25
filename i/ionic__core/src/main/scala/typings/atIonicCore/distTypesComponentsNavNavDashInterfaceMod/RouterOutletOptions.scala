package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOutletOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var animationBuilder: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var deepWait: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[NavDirection] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var progressAnimation: js.UndefOr[Boolean] = js.undefined
  var showGoBack: js.UndefOr[Boolean] = js.undefined
  var skipIfBusy: js.UndefOr[Boolean] = js.undefined
}

object RouterOutletOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationBuilder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    deepWait: js.UndefOr[Boolean] = js.undefined,
    direction: NavDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    progressAnimation: js.UndefOr[Boolean] = js.undefined,
    showGoBack: js.UndefOr[Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[Boolean] = js.undefined
  ): RouterOutletOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationBuilder != null) __obj.updateDynamic("animationBuilder")(animationBuilder.asInstanceOf[js.Any])
    if (!js.isUndefined(deepWait)) __obj.updateDynamic("deepWait")(deepWait.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressAnimation)) __obj.updateDynamic("progressAnimation")(progressAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(showGoBack)) __obj.updateDynamic("showGoBack")(showGoBack.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBusy)) __obj.updateDynamic("skipIfBusy")(skipIfBusy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOutletOptions]
  }
}

