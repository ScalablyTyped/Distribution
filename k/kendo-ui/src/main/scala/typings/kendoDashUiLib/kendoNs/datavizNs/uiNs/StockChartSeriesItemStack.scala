package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemStack extends js.Object {
  var group: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartSeriesItemStack {
  @scala.inline
  def apply(group: java.lang.String = null, `type`: java.lang.String = null): StockChartSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StockChartSeriesItemStack]
  }
}

