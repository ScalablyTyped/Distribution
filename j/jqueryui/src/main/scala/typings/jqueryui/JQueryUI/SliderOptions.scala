package typings.jqueryui.JQueryUI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slider //////////////////////////////////////////////////
trait SliderOptions extends SliderEvents {
  var animate: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
   // boolean, string or number
  var disabled: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
   // boolean or string
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    animate: js.Any = null,
    change: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    classes: SliderClasses = null,
    create: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    start: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    step: Int | Double = null,
    stop: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    value: Int | Double = null,
    values: js.Array[Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (range != null) __obj.updateDynamic("range")(range)
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SliderOptions]
  }
}

