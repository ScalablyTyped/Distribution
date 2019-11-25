package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisNotesDataItem]] = js.undefined
  var icon: js.UndefOr[StockChartNavigatorCategoryAxisNotesIcon] = js.undefined
  var label: js.UndefOr[StockChartNavigatorCategoryAxisNotesLabel] = js.undefined
  var line: js.UndefOr[StockChartNavigatorCategoryAxisNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object StockChartNavigatorCategoryAxisNotes {
  @scala.inline
  def apply(
    data: js.Array[StockChartNavigatorCategoryAxisNotesDataItem] = null,
    icon: StockChartNavigatorCategoryAxisNotesIcon = null,
    label: StockChartNavigatorCategoryAxisNotesLabel = null,
    line: StockChartNavigatorCategoryAxisNotesLine = null,
    position: String = null
  ): StockChartNavigatorCategoryAxisNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotes]
  }
}

