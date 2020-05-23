package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeScale extends js.Object {
  var labels: js.UndefOr[LinearGaugeScaleLabels] = js.undefined
  var line: js.UndefOr[LinearGaugeScaleLine] = js.undefined
  var majorTicks: js.UndefOr[LinearGaugeScaleMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minorTicks: js.UndefOr[LinearGaugeScaleMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var rangePlaceholderColor: js.UndefOr[String] = js.undefined
  var rangeSize: js.UndefOr[Double] = js.undefined
  var ranges: js.UndefOr[js.Array[LinearGaugeScaleRange]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object LinearGaugeScale {
  @scala.inline
  def apply(
    labels: LinearGaugeScaleLabels = null,
    line: LinearGaugeScaleLine = null,
    majorTicks: LinearGaugeScaleMajorTicks = null,
    majorUnit: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minorTicks: LinearGaugeScaleMinorTicks = null,
    minorUnit: js.UndefOr[Double] = js.undefined,
    mirror: js.UndefOr[Boolean] = js.undefined,
    rangePlaceholderColor: String = null,
    rangeSize: js.UndefOr[Double] = js.undefined,
    ranges: js.Array[LinearGaugeScaleRange] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): LinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(majorUnit)) __obj.updateDynamic("majorUnit")(majorUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(minorUnit)) __obj.updateDynamic("minorUnit")(minorUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (rangePlaceholderColor != null) __obj.updateDynamic("rangePlaceholderColor")(rangePlaceholderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeSize)) __obj.updateDynamic("rangeSize")(rangeSize.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeScale]
  }
}

