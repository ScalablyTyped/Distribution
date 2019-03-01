package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemNegativeValues extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartSeriesItemNegativeValues {
  @scala.inline
  def apply(color: java.lang.String = null, visible: js.UndefOr[scala.Boolean] = js.undefined): ChartSeriesItemNegativeValues = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartSeriesItemNegativeValues]
  }
}

