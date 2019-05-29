package typings
package atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOutletOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animationBuilder: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var deepWait: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[NavDirection] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var progressAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var showGoBack: js.UndefOr[scala.Boolean] = js.undefined
  var skipIfBusy: js.UndefOr[scala.Boolean] = js.undefined
}

object RouterOutletOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationBuilder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    deepWait: js.UndefOr[scala.Boolean] = js.undefined,
    direction: NavDirection = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    progressAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    showGoBack: js.UndefOr[scala.Boolean] = js.undefined,
    skipIfBusy: js.UndefOr[scala.Boolean] = js.undefined
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

