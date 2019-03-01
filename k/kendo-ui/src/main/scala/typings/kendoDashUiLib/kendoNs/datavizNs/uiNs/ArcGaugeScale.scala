package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeScale extends js.Object {
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var labels: js.UndefOr[ArcGaugeScaleLabels] = js.undefined
  var majorTicks: js.UndefOr[ArcGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minorTicks: js.UndefOr[ArcGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[scala.Double] = js.undefined
  var rangeDistance: js.UndefOr[scala.Double] = js.undefined
  var rangeLineCap: js.UndefOr[java.lang.String] = js.undefined
  var rangePlaceholderColor: js.UndefOr[java.lang.String] = js.undefined
  var rangeSize: js.UndefOr[scala.Double] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object ArcGaugeScale {
  @scala.inline
  def apply(
    endAngle: scala.Int | scala.Double = null,
    labels: ArcGaugeScaleLabels = null,
    majorTicks: ArcGaugeScaleMajorTicks = null,
    majorUnit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorTicks: ArcGaugeScaleMinorTicks = null,
    minorUnit: scala.Int | scala.Double = null,
    rangeDistance: scala.Int | scala.Double = null,
    rangeLineCap: java.lang.String = null,
    rangePlaceholderColor: java.lang.String = null,
    rangeSize: scala.Int | scala.Double = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    startAngle: scala.Int | scala.Double = null
  ): ArcGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (rangeDistance != null) __obj.updateDynamic("rangeDistance")(rangeDistance.asInstanceOf[js.Any])
    if (rangeLineCap != null) __obj.updateDynamic("rangeLineCap")(rangeLineCap)
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor)
    if (rangeSize != null) __obj.updateDynamic("rangeSize")(rangeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeScale]
  }
}

