package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slider //////////////////////////////////////////////////
trait SliderOptions extends SliderEvents {
  var animate: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
   // boolean, string or number
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
   // boolean or string
  var step: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    animate: js.Any = null,
    change: SliderEvent = null,
    classes: SliderClasses = null,
    create: SliderEvent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    range: js.Any = null,
    slide: SliderEvent = null,
    start: SliderEvent = null,
    step: scala.Int | scala.Double = null,
    stop: SliderEvent = null,
    value: scala.Int | scala.Double = null,
    values: js.Array[scala.Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (change != null) __obj.updateDynamic("change")(change)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (range != null) __obj.updateDynamic("range")(range)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (start != null) __obj.updateDynamic("start")(start)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SliderOptions]
  }
}

