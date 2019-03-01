package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItem extends js.Object {
  var aggregate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[SparklineSeriesItemBorder] = js.undefined
  var categoryField: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var colorField: js.UndefOr[java.lang.String] = js.undefined
  var connectors: js.UndefOr[SparklineSeriesItemConnectors] = js.undefined
  var currentField: js.UndefOr[java.lang.String] = js.undefined
  var dashType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var explodeField: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var gap: js.UndefOr[scala.Double] = js.undefined
  var highlight: js.UndefOr[SparklineSeriesItemHighlight] = js.undefined
  var labels: js.UndefOr[SparklineSeriesItemLabels] = js.undefined
  var line: js.UndefOr[java.lang.String | SparklineSeriesItemLine] = js.undefined
  var markers: js.UndefOr[SparklineSeriesItemMarkers] = js.undefined
  var missingValues: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var negativeColor: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[SparklineSeriesItemNotes] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var overlay: js.UndefOr[SparklineSeriesItemOverlay] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var stack: js.UndefOr[scala.Boolean | java.lang.String | SparklineSeriesItemStack] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[SparklineSeriesItemTarget] = js.undefined
  var targetField: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[SparklineSeriesItemTooltip] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object SparklineSeriesItem {
  @scala.inline
  def apply(
    aggregate: java.lang.String | js.Function = null,
    axis: java.lang.String = null,
    border: SparklineSeriesItemBorder = null,
    categoryField: java.lang.String = null,
    color: java.lang.String | js.Function = null,
    colorField: java.lang.String = null,
    connectors: SparklineSeriesItemConnectors = null,
    currentField: java.lang.String = null,
    dashType: java.lang.String = null,
    data: js.Any = null,
    explodeField: java.lang.String = null,
    field: java.lang.String = null,
    gap: scala.Int | scala.Double = null,
    highlight: SparklineSeriesItemHighlight = null,
    labels: SparklineSeriesItemLabels = null,
    line: java.lang.String | SparklineSeriesItemLine = null,
    markers: SparklineSeriesItemMarkers = null,
    missingValues: java.lang.String = null,
    name: java.lang.String = null,
    negativeColor: java.lang.String = null,
    notes: SparklineSeriesItemNotes = null,
    opacity: scala.Int | scala.Double = null,
    overlay: SparklineSeriesItemOverlay = null,
    padding: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    spacing: scala.Int | scala.Double = null,
    stack: scala.Boolean | java.lang.String | SparklineSeriesItemStack = null,
    startAngle: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    target: SparklineSeriesItemTarget = null,
    targetField: java.lang.String = null,
    tooltip: SparklineSeriesItemTooltip = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): SparklineSeriesItem = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (border != null) __obj.updateDynamic("border")(border)
    if (categoryField != null) __obj.updateDynamic("categoryField")(categoryField)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (currentField != null) __obj.updateDynamic("currentField")(currentField)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (explodeField != null) __obj.updateDynamic("explodeField")(explodeField)
    if (field != null) __obj.updateDynamic("field")(field)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetField != null) __obj.updateDynamic("targetField")(targetField)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItem]
  }
}

