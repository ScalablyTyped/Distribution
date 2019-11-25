package typings.kendoDashUi.kendo.dataviz.ui

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
    endAngle: Int | Double = null,
    labels: ArcGaugeScaleLabels = null,
    majorTicks: ArcGaugeScaleMajorTicks = null,
    majorUnit: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minorTicks: ArcGaugeScaleMinorTicks = null,
    minorUnit: Int | Double = null,
    rangeDistance: Int | Double = null,
    rangeLineCap: String = null,
    rangePlaceholderColor: String = null,
    rangeSize: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null
  ): ArcGaugeScale = {
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
    if (rangeLineCap != null) __obj.updateDynamic("rangeLineCap")(rangeLineCap.asInstanceOf[js.Any])
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor.asInstanceOf[js.Any])
    if (rangeSize != null) __obj.updateDynamic("rangeSize")(rangeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeScale]
  }
}

