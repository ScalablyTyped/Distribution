package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendItem extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object StockChartLegendItem {
  @scala.inline
  def apply(cursor: String = null, visual: js.Function = null): StockChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartLegendItem]
  }
}

