package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    gap: Int | Double = null,
    labels: SparklineSeriesDefaultsLabels = null,
    line: js.Any = null,
    overlay: js.Any = null,
    pie: js.Any = null,
    spacing: Int | Double = null,
    stack: Boolean | SparklineSeriesDefaultsStack = null,
    tooltip: SparklineSeriesDefaultsTooltip = null,
    `type`: String = null
  ): SparklineSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (border != null) __obj.updateDynamic("border")(border)
    if (column != null) __obj.updateDynamic("column")(column)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (pie != null) __obj.updateDynamic("pie")(pie)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SparklineSeriesDefaults]
  }
}

