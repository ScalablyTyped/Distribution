package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeScale extends js.Object {
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var labels: js.UndefOr[RadialGaugeScaleLabels] = js.undefined
  var majorTicks: js.UndefOr[RadialGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minorTicks: js.UndefOr[RadialGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[scala.Double] = js.undefined
  var rangeDistance: js.UndefOr[scala.Double] = js.undefined
  var rangePlaceholderColor: js.UndefOr[java.lang.String] = js.undefined
  var rangeSize: js.UndefOr[scala.Double] = js.undefined
  var ranges: js.UndefOr[js.Array[RadialGaugeScaleRange]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object RadialGaugeScale {
  @scala.inline
  def apply(
    endAngle: scala.Int | scala.Double = null,
    labels: RadialGaugeScaleLabels = null,
    majorTicks: RadialGaugeScaleMajorTicks = null,
    majorUnit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorTicks: RadialGaugeScaleMinorTicks = null,
    minorUnit: scala.Int | scala.Double = null,
    rangeDistance: scala.Int | scala.Double = null,
    rangePlaceholderColor: java.lang.String = null,
    rangeSize: scala.Int | scala.Double = null,
    ranges: js.Array[RadialGaugeScaleRange] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    startAngle: scala.Int | scala.Double = null
  ): RadialGaugeScale = {
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
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor)
    if (rangeSize != null) __obj.updateDynamic("rangeSize")(rangeSize.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeScale]
  }
}

