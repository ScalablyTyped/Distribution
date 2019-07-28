package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemExtremesBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.undefined
  var width: js.UndefOr[Double | js.Function] = js.undefined
}

object ChartSeriesItemExtremesBorder {
  @scala.inline
  def apply(color: String | js.Function = null, width: Double | js.Function = null): ChartSeriesItemExtremesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemExtremesBorder]
  }
}

