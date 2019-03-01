package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemErrorBarsLine extends js.Object {
  var dashType: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartSeriesItemErrorBarsLine {
  @scala.inline
  def apply(dashType: java.lang.String = null, width: scala.Int | scala.Double = null): ChartSeriesItemErrorBarsLine = {
    val __obj = js.Dynamic.literal()
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemErrorBarsLine]
  }
}

