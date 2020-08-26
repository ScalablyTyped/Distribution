package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartValueAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[StockChartValueAxisItemNotesDataItem]] = js.native
  var icon: js.UndefOr[StockChartValueAxisItemNotesIcon] = js.native
  var label: js.UndefOr[StockChartValueAxisItemNotesLabel] = js.native
  var line: js.UndefOr[StockChartValueAxisItemNotesLine] = js.native
  var position: js.UndefOr[String] = js.native
}

object StockChartValueAxisItemNotes {
  @scala.inline
  def apply(): StockChartValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartValueAxisItemNotes]
  }
  @scala.inline
  implicit class StockChartValueAxisItemNotesOps[Self <: StockChartValueAxisItemNotes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: StockChartValueAxisItemNotesDataItem*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[StockChartValueAxisItemNotesDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIcon(value: StockChartValueAxisItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: StockChartValueAxisItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLine(value: StockChartValueAxisItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

