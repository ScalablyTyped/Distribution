package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItem extends js.Object {
  var aggregate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartSeriesItemBorder] = js.undefined
  var categoryField: js.UndefOr[java.lang.String] = js.undefined
  var closeField: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var colorField: js.UndefOr[java.lang.String] = js.undefined
  var currentField: js.UndefOr[java.lang.String] = js.undefined
  var dashType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var downColor: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var downColorField: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var gap: js.UndefOr[scala.Double] = js.undefined
  var highField: js.UndefOr[java.lang.String] = js.undefined
  var highlight: js.UndefOr[StockChartSeriesItemHighlight] = js.undefined
  var labels: js.UndefOr[StockChartSeriesItemLabels] = js.undefined
  var line: js.UndefOr[java.lang.String | StockChartSeriesItemLine] = js.undefined
  var lowField: js.UndefOr[java.lang.String] = js.undefined
  var markers: js.UndefOr[StockChartSeriesItemMarkers] = js.undefined
  var missingValues: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var negativeColor: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[StockChartSeriesItemNotes] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var openField: js.UndefOr[java.lang.String] = js.undefined
  var overlay: js.UndefOr[StockChartSeriesItemOverlay] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var stack: js.UndefOr[scala.Boolean | java.lang.String | StockChartSeriesItemStack] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[StockChartSeriesItemTarget] = js.undefined
  var targetField: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[StockChartSeriesItemTooltip] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visibleInLegend: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object StockChartSeriesItem {
  @scala.inline
  def apply(
    aggregate: java.lang.String | js.Function = null,
    axis: java.lang.String = null,
    border: StockChartSeriesItemBorder = null,
    categoryField: java.lang.String = null,
    closeField: java.lang.String = null,
    color: java.lang.String | js.Function = null,
    colorField: java.lang.String = null,
    currentField: java.lang.String = null,
    dashType: java.lang.String = null,
    data: js.Any = null,
    downColor: java.lang.String | js.Function = null,
    downColorField: java.lang.String = null,
    field: java.lang.String = null,
    gap: scala.Int | scala.Double = null,
    highField: java.lang.String = null,
    highlight: StockChartSeriesItemHighlight = null,
    labels: StockChartSeriesItemLabels = null,
    line: java.lang.String | StockChartSeriesItemLine = null,
    lowField: java.lang.String = null,
    markers: StockChartSeriesItemMarkers = null,
    missingValues: java.lang.String = null,
    name: java.lang.String = null,
    negativeColor: java.lang.String = null,
    notes: StockChartSeriesItemNotes = null,
    opacity: scala.Int | scala.Double = null,
    openField: java.lang.String = null,
    overlay: StockChartSeriesItemOverlay = null,
    spacing: scala.Int | scala.Double = null,
    stack: scala.Boolean | java.lang.String | StockChartSeriesItemStack = null,
    style: java.lang.String = null,
    target: StockChartSeriesItemTarget = null,
    targetField: java.lang.String = null,
    tooltip: StockChartSeriesItemTooltip = null,
    `type`: java.lang.String = null,
    visibleInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): StockChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (border != null) __obj.updateDynamic("border")(border)
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField)
    if (closeField != null) __obj.updateDynamic("closeField")(closeField)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField)
    if (currentField != null) __obj.updateDynamic("currentField")(currentField)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (downColor != null) __obj.updateDynamic("downColor")(downColor.asInstanceOf[js.Any])
    if (downColorField != null) __obj.updateDynamic("downColorField")(downColorField)
    if (field != null) __obj.updateDynamic("field")(field)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (highField != null) __obj.updateDynamic("highField")(highField)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lowField != null) __obj.updateDynamic("lowField")(lowField)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openField != null) __obj.updateDynamic("openField")(openField)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetField != null) __obj.updateDynamic("targetField")(targetField)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visibleInLegend)) __obj.updateDynamic("visibleInLegend")(visibleInLegend)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItem]
  }
}

