package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeScale extends js.Object {
  var endAngle: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[RadialGaugeScaleLabels] = js.undefined
  var majorTicks: js.UndefOr[RadialGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minorTicks: js.UndefOr[RadialGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var rangeDistance: js.UndefOr[Double] = js.undefined
  var rangePlaceholderColor: js.UndefOr[String] = js.undefined
  var rangeSize: js.UndefOr[Double] = js.undefined
  var ranges: js.UndefOr[js.Array[RadialGaugeScaleRange]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object RadialGaugeScale {
  @scala.inline
  def apply(
    endAngle: Int | Double = null,
    labels: RadialGaugeScaleLabels = null,
    majorTicks: RadialGaugeScaleMajorTicks = null,
    majorUnit: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minorTicks: RadialGaugeScaleMinorTicks = null,
    minorUnit: Int | Double = null,
    rangeDistance: Int | Double = null,
    rangePlaceholderColor: String = null,
    rangeSize: Int | Double = null,
    ranges: js.Array[RadialGaugeScaleRange] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null
  ): RadialGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (rangeDistance != null) __obj.updateDynamic("rangeDistance")(rangeDistance.asInstanceOf[js.Any])
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor.asInstanceOf[js.Any])
    if (rangeSize != null) __obj.updateDynamic("rangeSize")(rangeSize.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeScale]
  }
}

