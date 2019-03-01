package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeScale extends js.Object {
  var labels: js.UndefOr[LinearGaugeScaleLabels] = js.undefined
  var line: js.UndefOr[LinearGaugeScaleLine] = js.undefined
  var majorTicks: js.UndefOr[LinearGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minorTicks: js.UndefOr[LinearGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var rangePlaceholderColor: js.UndefOr[java.lang.String] = js.undefined
  var rangeSize: js.UndefOr[scala.Double] = js.undefined
  var ranges: js.UndefOr[js.Array[LinearGaugeScaleRange]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object LinearGaugeScale {
  @scala.inline
  def apply(
    labels: LinearGaugeScaleLabels = null,
    line: LinearGaugeScaleLine = null,
    majorTicks: LinearGaugeScaleMajorTicks = null,
    majorUnit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorTicks: LinearGaugeScaleMinorTicks = null,
    minorUnit: scala.Int | scala.Double = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    rangePlaceholderColor: java.lang.String = null,
    rangeSize: scala.Int | scala.Double = null,
    ranges: js.Array[LinearGaugeScaleRange] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): LinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor)
    if (rangeSize != null) __obj.updateDynamic("rangeSize")(rangeSize.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[LinearGaugeScale]
  }
}

