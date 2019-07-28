package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisNotesDataItem extends js.Object {
  var icon: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartNavigatorCategoryAxisNotesDataItem {
  @scala.inline
  def apply(
    icon: StockChartNavigatorCategoryAxisNotesDataItemIcon = null,
    label: StockChartNavigatorCategoryAxisNotesDataItemLabel = null,
    line: StockChartNavigatorCategoryAxisNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): StockChartNavigatorCategoryAxisNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotesDataItem]
  }
}

