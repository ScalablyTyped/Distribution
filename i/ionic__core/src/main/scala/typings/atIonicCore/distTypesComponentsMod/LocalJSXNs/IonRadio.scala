package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsRadioDashGroupRadioDashGroupDashInterfaceMod.RadioChangeEventDetail
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRadio extends js.Object {
  /**
    * If `true`, the radio is selected.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the radio.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the radio button loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the radio button has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the radio button is selected.
    */
  var onIonSelect: js.UndefOr[js.Function1[/* event */ CustomEvent[RadioChangeEventDetail], Unit]] = js.undefined
  /**
    * the value of the radio.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}

object IonRadio {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    mode: ios | md = null,
    name: String = null,
    onIonBlur: /* event */ CustomEvent[Unit] => Unit = null,
    onIonFocus: /* event */ CustomEvent[Unit] => Unit = null,
    onIonSelect: /* event */ CustomEvent[RadioChangeEventDetail] => Unit = null,
    value: js.Any = null
  ): IonRadio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (onIonSelect != null) __obj.updateDynamic("onIonSelect")(js.Any.fromFunction1(onIonSelect))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonRadio]
  }
}

