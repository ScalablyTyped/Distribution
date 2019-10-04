package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerButton
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerColumn
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonPicker extends js.Object {
  /**
    * If `true`, the picker will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.UndefOr[js.Array[PickerColumn]] = js.undefined
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the picker has dismissed.
    */
  var onIonPickerDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted after the picker has presented.
    */
  var onIonPickerDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted before the picker has dismissed.
    */
  var onIonPickerWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  /**
    * Emitted before the picker has presented.
    */
  var onIonPickerWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}

object IonPicker {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[PickerButton] = null,
    columns: js.Array[PickerColumn] = null,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: AnimationBuilder = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: AnimationBuilder = null,
    mode: ios | md = null,
    onIonPickerDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonPickerDidPresent: /* event */ CustomEvent[Unit] => Unit = null,
    onIonPickerWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onIonPickerWillPresent: /* event */ CustomEvent[Unit] => Unit = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined
  ): IonPicker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonPickerDidDismiss != null) __obj.updateDynamic("onIonPickerDidDismiss")(js.Any.fromFunction1(onIonPickerDidDismiss))
    if (onIonPickerDidPresent != null) __obj.updateDynamic("onIonPickerDidPresent")(js.Any.fromFunction1(onIonPickerDidPresent))
    if (onIonPickerWillDismiss != null) __obj.updateDynamic("onIonPickerWillDismiss")(js.Any.fromFunction1(onIonPickerWillDismiss))
    if (onIonPickerWillPresent != null) __obj.updateDynamic("onIonPickerWillPresent")(js.Any.fromFunction1(onIonPickerWillPresent))
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop)
    __obj.asInstanceOf[IonPicker]
  }
}

