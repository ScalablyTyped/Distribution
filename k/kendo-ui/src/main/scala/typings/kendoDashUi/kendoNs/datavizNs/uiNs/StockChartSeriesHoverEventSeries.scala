package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesHoverEventSeries extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StockChartSeriesHoverEventSeries {
  @scala.inline
  def apply(data: js.Any = null, name: String = null, `type`: String = null): StockChartSeriesHoverEventSeries = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StockChartSeriesHoverEventSeries]
  }
}

