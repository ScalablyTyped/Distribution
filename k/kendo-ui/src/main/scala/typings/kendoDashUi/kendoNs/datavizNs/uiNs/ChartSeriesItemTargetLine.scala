package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemTargetLine extends js.Object {
  var width: js.UndefOr[Double | js.Function] = js.undefined
}

object ChartSeriesItemTargetLine {
  @scala.inline
  def apply(width: Double | js.Function = null): ChartSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemTargetLine]
  }
}

