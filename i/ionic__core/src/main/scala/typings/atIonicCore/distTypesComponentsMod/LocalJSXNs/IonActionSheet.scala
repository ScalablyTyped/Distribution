package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetButton
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonActionSheet extends js.Object {
  /**
    * If `true`, the action sheet will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the action sheet will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of buttons for the action sheet.
    */
  var buttons: js.UndefOr[js.Array[ActionSheetButton | String]] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Animation to use when the action sheet is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Title for the action sheet.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the action sheet is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the alert has dismissed.
    */
  var onIonActionSheetDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted after the alert has presented.
    */
  var onIonActionSheetDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted before the alert has dismissed.
    */
  var onIonActionSheetWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted before the alert has presented.
    */
  var onIonActionSheetWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Subtitle for the action sheet.
    */
  var subHeader: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the action sheet will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object IonActionSheet {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[ActionSheetButton | String] = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: AnimationBuilder = null,
    header: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: AnimationBuilder = null,
    mode: ios | md = null,
    onIonActionSheetDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonActionSheetDidPresent: /* event */ CustomEvent[Unit] => Unit = null,
    onIonActionSheetWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonActionSheetWillPresent: /* event */ CustomEvent[Unit] => Unit = null,
    subHeader: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): IonActionSheet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (header != null) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonActionSheetDidDismiss != null) __obj.updateDynamic("onIonActionSheetDidDismiss")(js.Any.fromFunction1(onIonActionSheetDidDismiss))
    if (onIonActionSheetDidPresent != null) __obj.updateDynamic("onIonActionSheetDidPresent")(js.Any.fromFunction1(onIonActionSheetDidPresent))
    if (onIonActionSheetWillDismiss != null) __obj.updateDynamic("onIonActionSheetWillDismiss")(js.Any.fromFunction1(onIonActionSheetWillDismiss))
    if (onIonActionSheetWillPresent != null) __obj.updateDynamic("onIonActionSheetWillPresent")(js.Any.fromFunction1(onIonActionSheetWillPresent))
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[IonActionSheet]
  }
}

