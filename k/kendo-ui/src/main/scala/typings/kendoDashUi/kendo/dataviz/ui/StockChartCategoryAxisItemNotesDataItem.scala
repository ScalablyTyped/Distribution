package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[StockChartCategoryAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[StockChartCategoryAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[StockChartCategoryAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartCategoryAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: StockChartCategoryAxisItemNotesDataItemIcon = null,
    label: StockChartCategoryAxisItemNotesDataItemLabel = null,
    line: StockChartCategoryAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): StockChartCategoryAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartCategoryAxisItemNotesDataItem]
  }
}

