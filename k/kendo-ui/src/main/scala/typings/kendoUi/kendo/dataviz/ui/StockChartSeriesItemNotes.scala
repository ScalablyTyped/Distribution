package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartSeriesItemNotes extends js.Object {
  
  var icon: js.UndefOr[StockChartSeriesItemNotesIcon] = js.native
  
  var label: js.UndefOr[StockChartSeriesItemNotesLabel] = js.native
  
  var line: js.UndefOr[StockChartSeriesItemNotesLine] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object StockChartSeriesItemNotes {
  
  @scala.inline
  def apply(): StockChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemNotes]
  }
  
  @scala.inline
  implicit class StockChartSeriesItemNotesOps[Self <: StockChartSeriesItemNotes] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: StockChartSeriesItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: StockChartSeriesItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: StockChartSeriesItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
