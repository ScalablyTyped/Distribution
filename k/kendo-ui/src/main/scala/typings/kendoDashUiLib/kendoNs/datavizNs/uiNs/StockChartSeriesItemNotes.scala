package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[StockChartSeriesItemNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartSeriesItemNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartSeriesItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartSeriesItemNotes {
  @scala.inline
  def apply(
    icon: StockChartSeriesItemNotesIcon = null,
    label: StockChartSeriesItemNotesLabel = null,
    line: StockChartSeriesItemNotesLine = null,
    position: java.lang.String = null
  ): StockChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[StockChartSeriesItemNotes]
  }
}

