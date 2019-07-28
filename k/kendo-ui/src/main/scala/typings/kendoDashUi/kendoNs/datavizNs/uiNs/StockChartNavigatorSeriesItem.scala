package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    gap: Int | Double = null,
    highField: String = null,
    highlight: StockChartNavigatorSeriesItemHighlight = null,
    labels: StockChartNavigatorSeriesItemLabels = null,
    line: String | StockChartNavigatorSeriesItemLine = null,
    lowField: String = null,
    markers: StockChartNavigatorSeriesItemMarkers = null,
    missingValues: String = null,
    name: String = null,
    opacity: Int | Double = null,
    openField: String = null,
    overlay: StockChartNavigatorSeriesItemOverlay = null,
    spacing: Int | Double = null,
    stack: Boolean | String | StockChartNavigatorSeriesItemStack = null,
    style: String = null,
    tooltip: StockChartNavigatorSeriesItemTooltip = null,
    `type`: String = null,
    width: Int | Double = null
  ): StockChartNavigatorSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (border != null) __obj.updateDynamic("border")(border)
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField)
    if (closeField != null) __obj.updateDynamic("closeField")(closeField)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorField != null) __obj.updateDynamic("colorField")(colorField)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (downColor != null) __obj.updateDynamic("downColor")(downColor)
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
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openField != null) __obj.updateDynamic("openField")(openField)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItem]
  }
}

