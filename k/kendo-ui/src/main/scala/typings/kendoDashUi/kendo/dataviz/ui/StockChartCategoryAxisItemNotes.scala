package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartCategoryAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[StockChartCategoryAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartCategoryAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartCategoryAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object StockChartCategoryAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[StockChartCategoryAxisItemNotesDataItem] = null,
    icon: StockChartCategoryAxisItemNotesIcon = null,
    label: StockChartCategoryAxisItemNotesLabel = null,
    line: StockChartCategoryAxisItemNotesLine = null,
    position: String = null
  ): StockChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartCategoryAxisItemNotes]
  }
}

