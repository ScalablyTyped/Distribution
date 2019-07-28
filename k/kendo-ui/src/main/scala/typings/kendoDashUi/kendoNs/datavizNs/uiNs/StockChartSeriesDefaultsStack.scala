package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesDefaultsStack extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object StockChartSeriesDefaultsStack {
  @scala.inline
  def apply(`type`: String = null): StockChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StockChartSeriesDefaultsStack]
  }
}

