package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRange extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  var debounce: scala.Double
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: scala.Boolean
  /**
    * Show two knobs.
    */
  var dualKnobs: scala.Boolean
  /**
    * Maximum integer value of the range.
    */
  var max: scala.Double
  /**
    * Minimum integer value of the range.
    */
  var min: scala.Double
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: scala.Boolean
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: scala.Boolean
  /**
    * Specifies the value granularity.
    */
  var step: scala.Double
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: scala.Boolean
  /**
    * the value of the range.
    */
  var value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RangeValue */ js.Any
}

object IonRange {
  @scala.inline
  def apply(
    debounce: scala.Double,
    disabled: scala.Boolean,
    dualKnobs: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    name: java.lang.String,
    pin: scala.Boolean,
    snaps: scala.Boolean,
    step: scala.Double,
    ticks: scala.Boolean,
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RangeValue */ js.Any,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null
  ): IonRange = {
    val __obj = js.Dynamic.literal(debounce = debounce, disabled = disabled, dualKnobs = dualKnobs, max = max, min = min, mode = mode, name = name, pin = pin, snaps = snaps, step = step, ticks = ticks, value = value)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[IonRange]
  }
}

