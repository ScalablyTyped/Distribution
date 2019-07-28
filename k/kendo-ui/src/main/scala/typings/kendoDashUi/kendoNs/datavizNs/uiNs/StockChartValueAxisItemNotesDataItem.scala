package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartValueAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[StockChartValueAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[StockChartValueAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[StockChartValueAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartValueAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: StockChartValueAxisItemNotesDataItemIcon = null,
    label: StockChartValueAxisItemNotesDataItemLabel = null,
    line: StockChartValueAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): StockChartValueAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartValueAxisItemNotesDataItem]
  }
}

