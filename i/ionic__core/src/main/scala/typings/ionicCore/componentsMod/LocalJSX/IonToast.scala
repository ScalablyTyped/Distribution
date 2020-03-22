package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.middle
import typings.ionicCore.ionicCoreStrings.top
import typings.ionicCore.mod.Color
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.toastInterfaceMod.ToastButton
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonToast extends js.Object {
  /**
    * If `true`, the toast will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of buttons for the toast.
    */
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * How many milliseconds to wait before hiding the toast. By default, it will show until `dismiss()` is called.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Animation to use when the toast is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Header to be shown in the toast.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the toast is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Message to be shown in the toast.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the toast has dismissed.
    */
  var onIonToastDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted after the toast has presented.
    */
  var onIonToastDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted before the toast has dismissed.
    */
  var onIonToastWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted before the toast has presented.
    */
  var onIonToastWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * The position of the toast on the screen.
    */
  var position: js.UndefOr[top | bottom | middle] = js.undefined
  /**
    * If `true`, the toast will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object IonToast {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[ToastButton | String] = null,
    color: Color = null,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    header: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    message: String = null,
    mode: ios | md = null,
    onIonToastDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonToastDidPresent: /* event */ CustomEvent[Unit] => Unit = null,
    onIonToastWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonToastWillPresent: /* event */ CustomEvent[Unit] => Unit = null,
    position: top | bottom | middle = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): IonToast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction2(enterAnimation))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction2(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonToastDidDismiss != null) __obj.updateDynamic("onIonToastDidDismiss")(js.Any.fromFunction1(onIonToastDidDismiss))
    if (onIonToastDidPresent != null) __obj.updateDynamic("onIonToastDidPresent")(js.Any.fromFunction1(onIonToastDidPresent))
    if (onIonToastWillDismiss != null) __obj.updateDynamic("onIonToastWillDismiss")(js.Any.fromFunction1(onIonToastWillDismiss))
    if (onIonToastWillPresent != null) __obj.updateDynamic("onIonToastWillPresent")(js.Any.fromFunction1(onIonToastWillPresent))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonToast]
  }
}

