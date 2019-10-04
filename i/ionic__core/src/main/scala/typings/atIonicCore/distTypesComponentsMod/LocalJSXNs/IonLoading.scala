package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonLoading extends js.Object {
  /**
    * If `true`, the loading indicator will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the loading indicator will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Number of milliseconds to wait before dismissing the loading indicator.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Animation to use when the loading indicator is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the loading indicator is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Optional text content to display in the loading indicator.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the loading has dismissed.
    */
  var onIonLoadingDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted after the loading has presented.
    */
  var onIonLoadingDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted before the loading has dismissed.
    */
  var onIonLoadingWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted before the loading has presented.
    */
  var onIonLoadingWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * If `true`, a backdrop will be displayed behind the loading indicator.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the spinner to display.
    */
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  /**
    * If `true`, the loading indicator will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object IonLoading {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: AnimationBuilder = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: AnimationBuilder = null,
    message: String = null,
    mode: ios | md = null,
    onIonLoadingDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonLoadingDidPresent: /* event */ CustomEvent[Unit] => Unit = null,
    onIonLoadingWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonLoadingWillPresent: /* event */ CustomEvent[Unit] => Unit = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    spinner: SpinnerTypes = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): IonLoading = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonLoadingDidDismiss != null) __obj.updateDynamic("onIonLoadingDidDismiss")(js.Any.fromFunction1(onIonLoadingDidDismiss))
    if (onIonLoadingDidPresent != null) __obj.updateDynamic("onIonLoadingDidPresent")(js.Any.fromFunction1(onIonLoadingDidPresent))
    if (onIonLoadingWillDismiss != null) __obj.updateDynamic("onIonLoadingWillDismiss")(js.Any.fromFunction1(onIonLoadingWillDismiss))
    if (onIonLoadingWillPresent != null) __obj.updateDynamic("onIonLoadingWillPresent")(js.Any.fromFunction1(onIonLoadingWillPresent))
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[IonLoading]
  }
}

