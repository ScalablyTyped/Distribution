package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesDefaults extends js.Object {
  var area: js.UndefOr[js.Any] = js.undefined
  var bar: js.UndefOr[js.Any] = js.undefined
  var border: js.UndefOr[SparklineSeriesDefaultsBorder] = js.undefined
  var column: js.UndefOr[js.Any] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[SparklineSeriesDefaultsLabels] = js.undefined
  var line: js.UndefOr[js.Any] = js.undefined
  var overlay: js.UndefOr[js.Any] = js.undefined
  var pie: js.UndefOr[js.Any] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | SparklineSeriesDefaultsStack] = js.undefined
  var tooltip: js.UndefOr[SparklineSeriesDefaultsTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SparklineSeriesDefaults {
  @scala.inline
  def apply(
    area: js.Any = null,
    bar: js.Any = null,
    border: SparklineSeriesDefaultsBorder = null,
    column: js.Any = null,
    gap: js.UndefOr[Double] = js.undefined,
    labels: SparklineSeriesDefaultsLabels = null,
    line: js.Any = null,
    overlay: js.Any = null,
    pie: js.Any = null,
    spacing: js.UndefOr[Double] = js.undefined,
    stack: Boolean | SparklineSeriesDefaultsStack = null,
    tooltip: SparklineSeriesDefaultsTooltip = null,
    `type`: String = null
  ): SparklineSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesDefaults]
  }
}

