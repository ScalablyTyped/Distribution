package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeScale extends js.Object {
  var endAngle: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[ArcGaugeScaleLabels] = js.undefined
  var majorTicks: js.UndefOr[ArcGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minorTicks: js.UndefOr[ArcGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var rangeDistance: js.UndefOr[Double] = js.undefined
  var rangeLineCap: js.UndefOr[String] = js.undefined
  var rangePlaceholderColor: js.UndefOr[String] = js.undefined
  var rangeSize: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object ArcGaugeScale {
  @scala.inline
  def apply(
    endAngle: js.UndefOr[Double] = js.undefined,
    labels: ArcGaugeScaleLabels = null,
    majorTicks: ArcGaugeScaleMajorTicks = null,
    majorUnit: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minorTicks: ArcGaugeScaleMinorTicks = null,
    minorUnit: js.UndefOr[Double] = js.undefined,
    rangeDistance: js.UndefOr[Double] = js.undefined,
    rangeLineCap: String = null,
    rangePlaceholderColor: String = null,
    rangeSize: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined
  ): ArcGaugeScale = {
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
    if (rangeLineCap != null) __obj.updateDynamic("rangeLineCap")(rangeLineCap.asInstanceOf[js.Any])
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeSize)) __obj.updateDynamic("rangeSize")(rangeSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeScale]
  }
}

