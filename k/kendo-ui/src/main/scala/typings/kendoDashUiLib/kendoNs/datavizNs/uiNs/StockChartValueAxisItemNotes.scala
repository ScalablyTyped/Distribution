package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartValueAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartValueAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[StockChartValueAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartValueAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartValueAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartValueAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[StockChartValueAxisItemNotesDataItem] = null,
    icon: StockChartValueAxisItemNotesIcon = null,
    label: StockChartValueAxisItemNotesLabel = null,
    line: StockChartValueAxisItemNotesLine = null,
    position: java.lang.String = null
  ): StockChartValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[StockChartValueAxisItemNotes]
  }
}

