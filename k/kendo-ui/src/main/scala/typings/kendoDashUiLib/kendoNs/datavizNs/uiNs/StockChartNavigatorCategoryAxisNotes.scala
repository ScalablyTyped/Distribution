package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisNotesDataItem]] = js.undefined
  var icon: js.UndefOr[StockChartNavigatorCategoryAxisNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartNavigatorCategoryAxisNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartNavigatorCategoryAxisNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartNavigatorCategoryAxisNotes {
  @scala.inline
  def apply(
    data: js.Array[StockChartNavigatorCategoryAxisNotesDataItem] = null,
    icon: StockChartNavigatorCategoryAxisNotesIcon = null,
    label: StockChartNavigatorCategoryAxisNotesLabel = null,
    line: StockChartNavigatorCategoryAxisNotesLine = null,
    position: java.lang.String = null
  ): StockChartNavigatorCategoryAxisNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotes]
  }
}

