package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsRangeRangeDashInterfaceMod.RangeValue
import typings.atIonicCore.distTypesInterfaceMod.Color
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
  var debounce: Double
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: Boolean
  /**
    * Show two knobs.
    */
  var dualKnobs: Boolean
  /**
    * Maximum integer value of the range.
    */
  var max: Double
  /**
    * Minimum integer value of the range.
    */
  var min: Double
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: Boolean
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: Boolean
  /**
    * Specifies the value granularity.
    */
  var step: Double
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: Boolean
  /**
    * the value of the range.
    */
  var value: RangeValue
}

object IonRange {
  @scala.inline
  def apply(
    debounce: Double,
    disabled: Boolean,
    dualKnobs: Boolean,
    max: Double,
    min: Double,
    name: String,
    pin: Boolean,
    snaps: Boolean,
    step: Double,
    ticks: Boolean,
    value: RangeValue,
    color: Color = null,
    mode: ios | md = null
  ): IonRange = {
    val __obj = js.Dynamic.literal(debounce = debounce, disabled = disabled, dualKnobs = dualKnobs, max = max, min = min, name = name, pin = pin, snaps = snaps, step = step, ticks = ticks, value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRange]
  }
}

