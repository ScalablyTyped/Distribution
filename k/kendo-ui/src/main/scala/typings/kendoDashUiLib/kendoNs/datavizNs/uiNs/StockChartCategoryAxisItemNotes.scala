package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartCategoryAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[StockChartCategoryAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartCategoryAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartCategoryAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartCategoryAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[StockChartCategoryAxisItemNotesDataItem] = null,
    icon: StockChartCategoryAxisItemNotesIcon = null,
    label: StockChartCategoryAxisItemNotesLabel = null,
    line: StockChartCategoryAxisItemNotesLine = null,
    position: java.lang.String = null
  ): StockChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[StockChartCategoryAxisItemNotes]
  }
}

