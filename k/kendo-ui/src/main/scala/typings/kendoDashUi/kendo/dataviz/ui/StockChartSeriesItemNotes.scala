package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[StockChartSeriesItemNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartSeriesItemNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartSeriesItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object StockChartSeriesItemNotes {
  @scala.inline
  def apply(
    icon: StockChartSeriesItemNotesIcon = null,
    label: StockChartSeriesItemNotesLabel = null,
    line: StockChartSeriesItemNotesLine = null,
    position: String = null
  ): StockChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItemNotes]
  }
}

