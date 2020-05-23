package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorSeriesItemBorder] = js.undefined
  var categoryField: js.UndefOr[String] = js.undefined
  var closeField: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorField: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var downColor: js.UndefOr[String] = js.undefined
  var downColorField: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var highField: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[StockChartNavigatorSeriesItemHighlight] = js.undefined
  var labels: js.UndefOr[StockChartNavigatorSeriesItemLabels] = js.undefined
  var line: js.UndefOr[String | StockChartNavigatorSeriesItemLine] = js.undefined
  var lowField: js.UndefOr[String] = js.undefined
  var markers: js.UndefOr[StockChartNavigatorSeriesItemMarkers] = js.undefined
  var missingValues: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var openField: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[StockChartNavigatorSeriesItemOverlay] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | String | StockChartNavigatorSeriesItemStack] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[StockChartNavigatorSeriesItemTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorSeriesItem {
  @scala.inline
  def apply(
    aggregate: String | js.Function = null,
    axis: String = null,
    border: StockChartNavigatorSeriesItemBorder = null,
    categoryField: String = null,
    closeField: String = null,
    color: String = null,
    colorField: String = null,
    dashType: String = null,
    data: js.Any = null,
    downColor: String = null,
    downColorField: String = null,
    field: String = null,
    gap: js.UndefOr[Double] = js.undefined,
    highField: String = null,
    highlight: StockChartNavigatorSeriesItemHighlight = null,
    labels: StockChartNavigatorSeriesItemLabels = null,
    line: String | StockChartNavigatorSeriesItemLine = null,
    lowField: String = null,
    markers: StockChartNavigatorSeriesItemMarkers = null,
    missingValues: String = null,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    openField: String = null,
    overlay: StockChartNavigatorSeriesItemOverlay = null,
    spacing: js.UndefOr[Double] = js.undefined,
    stack: Boolean | String | StockChartNavigatorSeriesItemStack = null,
    style: String = null,
    tooltip: StockChartNavigatorSeriesItemTooltip = null,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): StockChartNavigatorSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField.asInstanceOf[js.Any])
    if (closeField != null) __obj.updateDynamic("closeField")(closeField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (downColor != null) __obj.updateDynamic("downColor")(downColor.asInstanceOf[js.Any])
    if (downColorField != null) __obj.updateDynamic("downColorField")(downColorField.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (highField != null) __obj.updateDynamic("highField")(highField.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lowField != null) __obj.updateDynamic("lowField")(lowField.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (openField != null) __obj.updateDynamic("openField")(openField.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItem]
  }
}

