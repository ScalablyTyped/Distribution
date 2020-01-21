package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemTarget extends js.Object {
  var border: js.UndefOr[js.Function | ChartSeriesItemTargetBorder] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var line: js.UndefOr[ChartSeriesItemTargetLine] = js.undefined
}

object ChartSeriesItemTarget {
  @scala.inline
  def apply(
    border: js.Function | ChartSeriesItemTargetBorder = null,
    color: String | js.Function = null,
    line: ChartSeriesItemTargetLine = null
  ): ChartSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemTarget]
  }
}

