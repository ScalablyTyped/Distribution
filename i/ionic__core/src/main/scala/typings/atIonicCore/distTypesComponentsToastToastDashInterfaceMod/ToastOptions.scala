package typings.atIonicCore.distTypesComponentsToastToastDashInterfaceMod

import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.middle
import typings.atIonicCore.atIonicCoreStrings.top
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
  var closeButtonText: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var position: js.UndefOr[top | bottom | middle] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[ToastButton | String] = null,
    closeButtonText: String = null,
    color: Color = null,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    header: String = null,
    id: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    message: String = null,
    mode: Mode = null,
    position: top | bottom | middle = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[ToastOptions]
  }
}

