package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemErrorBarsLine extends js.Object {
  var dashType: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartSeriesItemErrorBarsLine {
  @scala.inline
  def apply(dashType: String = null, width: Int | Double = null): ChartSeriesItemErrorBarsLine = {
    val __obj = js.Dynamic.literal()
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemErrorBarsLine]
  }
}

