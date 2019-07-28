package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartValueAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[StockChartValueAxisItemCrosshair] = js.undefined
  var labels: js.UndefOr[StockChartValueAxisItemLabels] = js.undefined
  var line: js.UndefOr[StockChartValueAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[StockChartValueAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[StockChartValueAxisItemMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minorGridLines: js.UndefOr[StockChartValueAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[StockChartValueAxisItemMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  var notes: js.UndefOr[StockChartValueAxisItemNotes] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var plotBands: js.UndefOr[js.Array[StockChartValueAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[StockChartValueAxisItemTitle] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartValueAxisItem {
  @scala.inline
  def apply(
    axisCrossingValue: js.Any | Date = null,
    background: String = null,
    color: String = null,
    crosshair: StockChartValueAxisItemCrosshair = null,
    labels: StockChartValueAxisItemLabels = null,
    line: StockChartValueAxisItemLine = null,
    majorGridLines: StockChartValueAxisItemMajorGridLines = null,
    majorTicks: StockChartValueAxisItemMajorTicks = null,
    majorUnit: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minorGridLines: StockChartValueAxisItemMinorGridLines = null,
    minorTicks: StockChartValueAxisItemMinorTicks = null,
    minorUnit: Int | Double = null,
    name: js.Any = null,
    narrowRange: js.UndefOr[Boolean] = js.undefined,
    notes: StockChartValueAxisItemNotes = null,
    pane: String = null,
    plotBands: js.Array[StockChartValueAxisItemPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    title: StockChartValueAxisItemTitle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartValueAxisItem = {
    val __obj = js.Dynamic.literal()
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
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
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartValueAxisItem]
  }
}

