package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[SparklineSeriesItemBorder] = js.undefined
  var categoryField: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var colorField: js.UndefOr[String] = js.undefined
  var connectors: js.UndefOr[SparklineSeriesItemConnectors] = js.undefined
  var currentField: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var explodeField: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var highlight: js.UndefOr[SparklineSeriesItemHighlight] = js.undefined
  var labels: js.UndefOr[SparklineSeriesItemLabels] = js.undefined
  var line: js.UndefOr[String | SparklineSeriesItemLine] = js.undefined
  var markers: js.UndefOr[SparklineSeriesItemMarkers] = js.undefined
  var missingValues: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var negativeColor: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[SparklineSeriesItemNotes] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var overlay: js.UndefOr[SparklineSeriesItemOverlay] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | String | SparklineSeriesItemStack] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[SparklineSeriesItemTarget] = js.undefined
  var targetField: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[SparklineSeriesItemTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SparklineSeriesItem {
  @scala.inline
  def apply(
    aggregate: String | js.Function = null,
    axis: String = null,
    border: SparklineSeriesItemBorder = null,
    categoryField: String = null,
    color: String | js.Function = null,
    colorField: String = null,
    connectors: SparklineSeriesItemConnectors = null,
    currentField: String = null,
    dashType: String = null,
    data: js.Any = null,
    explodeField: String = null,
    field: String = null,
    gap: Int | Double = null,
    highlight: SparklineSeriesItemHighlight = null,
    labels: SparklineSeriesItemLabels = null,
    line: String | SparklineSeriesItemLine = null,
    markers: SparklineSeriesItemMarkers = null,
    missingValues: String = null,
    name: String = null,
    negativeColor: String = null,
    notes: SparklineSeriesItemNotes = null,
    opacity: Int | Double = null,
    overlay: SparklineSeriesItemOverlay = null,
    padding: Int | Double = null,
    size: Int | Double = null,
    spacing: Int | Double = null,
    stack: Boolean | String | SparklineSeriesItemStack = null,
    startAngle: Int | Double = null,
    style: String = null,
    target: SparklineSeriesItemTarget = null,
    targetField: String = null,
    tooltip: SparklineSeriesItemTooltip = null,
    `type`: String = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): SparklineSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (currentField != null) __obj.updateDynamic("currentField")(currentField.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (explodeField != null) __obj.updateDynamic("explodeField")(explodeField.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetField != null) __obj.updateDynamic("targetField")(targetField.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItem]
  }
}

