package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    classes: SliderClasses = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    value: js.UndefOr[Double] = js.undefined,
    values: js.Array[Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

