package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | stdLib.Date] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var crosshair: js.UndefOr[SparklineValueAxisItemCrosshair] = js.undefined
  var labels: js.UndefOr[SparklineValueAxisItemLabels] = js.undefined
  var line: js.UndefOr[SparklineValueAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[SparklineValueAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[SparklineValueAxisItemMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minorGridLines: js.UndefOr[SparklineValueAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[SparklineValueAxisItemMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
  var narrowRange: js.UndefOr[scala.Boolean] = js.undefined
  var notes: js.UndefOr[SparklineValueAxisItemNotes] = js.undefined
  var plotBands: js.UndefOr[js.Array[SparklineValueAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[SparklineValueAxisItemTitle] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object SparklineValueAxisItem {
  @scala.inline
  def apply(
    axisCrossingValue: js.Any | stdLib.Date = null,
    color: java.lang.String = null,
    crosshair: SparklineValueAxisItemCrosshair = null,
    labels: SparklineValueAxisItemLabels = null,
    line: SparklineValueAxisItemLine = null,
    majorGridLines: SparklineValueAxisItemMajorGridLines = null,
    majorTicks: SparklineValueAxisItemMajorTicks = null,
    majorUnit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorGridLines: SparklineValueAxisItemMinorGridLines = null,
    minorTicks: SparklineValueAxisItemMinorTicks = null,
    minorUnit: scala.Int | scala.Double = null,
    name: js.Any = null,
    narrowRange: js.UndefOr[scala.Boolean] = js.undefined,
    notes: SparklineValueAxisItemNotes = null,
    plotBands: js.Array[SparklineValueAxisItemPlotBand] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    title: SparklineValueAxisItemTitle = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SparklineValueAxisItem = {
    val __obj = js.Dynamic.literal()
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(narrowRange)) __obj.updateDynamic("narrowRange")(narrowRange)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SparklineValueAxisItem]
  }
}

