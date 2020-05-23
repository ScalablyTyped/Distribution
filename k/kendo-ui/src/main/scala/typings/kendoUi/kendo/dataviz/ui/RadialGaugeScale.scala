package typings.kendoUi.kendo.dataviz.ui

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
    endAngle: js.UndefOr[Double] = js.undefined,
    labels: RadialGaugeScaleLabels = null,
    majorTicks: RadialGaugeScaleMajorTicks = null,
    majorUnit: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minorTicks: RadialGaugeScaleMinorTicks = null,
    minorUnit: js.UndefOr[Double] = js.undefined,
    rangeDistance: js.UndefOr[Double] = js.undefined,
    rangePlaceholderColor: String = null,
    rangeSize: js.UndefOr[Double] = js.undefined,
    ranges: js.Array[RadialGaugeScaleRange] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined
  ): RadialGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(majorUnit)) __obj.updateDynamic("majorUnit")(majorUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(minorUnit)) __obj.updateDynamic("minorUnit")(minorUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeDistance)) __obj.updateDynamic("rangeDistance")(rangeDistance.get.asInstanceOf[js.Any])
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeSize)) __obj.updateDynamic("rangeSize")(rangeSize.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeScale]
  }
}

