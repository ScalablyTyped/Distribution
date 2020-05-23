package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemErrorBarsLine extends js.Object {
  var dashType: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartSeriesItemErrorBarsLine {
  @scala.inline
  def apply(dashType: String = null, width: js.UndefOr[Double] = js.undefined): ChartSeriesItemErrorBarsLine = {
    val __obj = js.Dynamic.literal()
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemErrorBarsLine]
  }
}

