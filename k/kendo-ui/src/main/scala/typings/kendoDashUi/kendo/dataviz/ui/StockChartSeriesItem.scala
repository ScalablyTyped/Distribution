package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartSeriesItemBorder] = js.undefined
  var categoryField: js.UndefOr[String] = js.undefined
  var closeField: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var colorField: js.UndefOr[String] = js.undefined
  var currentField: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var downColor: js.UndefOr[String | js.Function] = js.undefined
  var downColorField: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var highField: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[StockChartSeriesItemHighlight] = js.undefined
  var labels: js.UndefOr[StockChartSeriesItemLabels] = js.undefined
  var line: js.UndefOr[String | StockChartSeriesItemLine] = js.undefined
  var lowField: js.UndefOr[String] = js.undefined
  var markers: js.UndefOr[StockChartSeriesItemMarkers] = js.undefined
  var missingValues: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var negativeColor: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[StockChartSeriesItemNotes] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var openField: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[StockChartSeriesItemOverlay] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | String | StockChartSeriesItemStack] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[StockChartSeriesItemTarget] = js.undefined
  var targetField: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[StockChartSeriesItemTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StockChartSeriesItem {
  @scala.inline
  def apply(
    aggregate: String | js.Function = null,
    axis: String = null,
    border: StockChartSeriesItemBorder = null,
    categoryField: String = null,
    closeField: String = null,
    color: String | js.Function = null,
    colorField: String = null,
    currentField: String = null,
    dashType: String = null,
    data: js.Any = null,
    downColor: String | js.Function = null,
    downColorField: String = null,
    field: String = null,
    gap: Int | Double = null,
    highField: String = null,
    highlight: StockChartSeriesItemHighlight = null,
    labels: StockChartSeriesItemLabels = null,
    line: String | StockChartSeriesItemLine = null,
    lowField: String = null,
    markers: StockChartSeriesItemMarkers = null,
    missingValues: String = null,
    name: String = null,
    negativeColor: String = null,
    notes: StockChartSeriesItemNotes = null,
    opacity: Int | Double = null,
    openField: String = null,
    overlay: StockChartSeriesItemOverlay = null,
    spacing: Int | Double = null,
    stack: Boolean | String | StockChartSeriesItemStack = null,
    style: String = null,
    target: StockChartSeriesItemTarget = null,
    targetField: String = null,
    tooltip: StockChartSeriesItemTooltip = null,
    `type`: String = null,
    visibleInLegend: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): StockChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField.asInstanceOf[js.Any])
    if (closeField != null) __obj.updateDynamic("closeField")(closeField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (currentField != null) __obj.updateDynamic("currentField")(currentField.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (downColor != null) __obj.updateDynamic("downColor")(downColor.asInstanceOf[js.Any])
    if (downColorField != null) __obj.updateDynamic("downColorField")(downColorField.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (highField != null) __obj.updateDynamic("highField")(highField.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lowField != null) __obj.updateDynamic("lowField")(lowField.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openField != null) __obj.updateDynamic("openField")(openField.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetField != null) __obj.updateDynamic("targetField")(targetField.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleInLegend)) __obj.updateDynamic("visibleInLegend")(visibleInLegend.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItem]
  }
}

