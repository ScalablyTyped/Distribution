package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import typings.ionicCore.rangeInterfaceMod.RangeChangeEventDetail
import typings.ionicCore.rangeInterfaceMod.RangeValue
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRange extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Show two knobs.
    */
  var dualKnobs: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum integer value of the range.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum integer value of the range.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the range loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RangeChangeEventDetail], Unit]] = js.undefined
  /**
    * Emitted when the range has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the value granularity.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: js.UndefOr[Boolean] = js.undefined
  /**
    * the value of the range.
    */
  var value: js.UndefOr[RangeValue] = js.undefined
}

object IonRange {
  @scala.inline
  def apply(
    color: Color = null,
    debounce: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dualKnobs: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    mode: ios | md = null,
    name: String = null,
    onIonBlur: /* event */ CustomEvent[Unit] => Unit = null,
    onIonChange: /* event */ CustomEvent[RangeChangeEventDetail] => Unit = null,
    onIonFocus: /* event */ CustomEvent[Unit] => Unit = null,
    pin: js.UndefOr[Boolean] = js.undefined,
    snaps: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    ticks: js.UndefOr[Boolean] = js.undefined,
    value: RangeValue = null
  ): IonRange = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(debounce)) __obj.updateDynamic("debounce")(debounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dualKnobs)) __obj.updateDynamic("dualKnobs")(dualKnobs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (!js.isUndefined(pin)) __obj.updateDynamic("pin")(pin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snaps)) __obj.updateDynamic("snaps")(snaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRange]
  }
}

