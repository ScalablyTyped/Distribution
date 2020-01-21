package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesDefaults extends js.Object {
  var area: js.UndefOr[js.Any] = js.undefined
  var border: js.UndefOr[StockChartSeriesDefaultsBorder] = js.undefined
  var candlestick: js.UndefOr[js.Any] = js.undefined
  var column: js.UndefOr[js.Any] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[StockChartSeriesDefaultsLabels] = js.undefined
  var line: js.UndefOr[js.Any] = js.undefined
  var ohlc: js.UndefOr[js.Any] = js.undefined
  var overlay: js.UndefOr[js.Any] = js.undefined
  var pie: js.UndefOr[js.Any] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | StockChartSeriesDefaultsStack] = js.undefined
  var tooltip: js.UndefOr[StockChartSeriesDefaultsTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StockChartSeriesDefaults {
  @scala.inline
  def apply(
    area: js.Any = null,
    border: StockChartSeriesDefaultsBorder = null,
    candlestick: js.Any = null,
    column: js.Any = null,
    gap: Int | Double = null,
    labels: StockChartSeriesDefaultsLabels = null,
    line: js.Any = null,
    ohlc: js.Any = null,
    overlay: js.Any = null,
    pie: js.Any = null,
    spacing: Int | Double = null,
    stack: Boolean | StockChartSeriesDefaultsStack = null,
    tooltip: StockChartSeriesDefaultsTooltip = null,
    `type`: String = null
  ): StockChartSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (ohlc != null) __obj.updateDynamic("ohlc")(ohlc.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesDefaults]
  }
}

