package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartXAxisItemNotes extends js.Object {
  
  var data: js.UndefOr[js.Array[ChartXAxisItemNotesDataItem]] = js.native
  
  var icon: js.UndefOr[ChartXAxisItemNotesIcon] = js.native
  
  var label: js.UndefOr[ChartXAxisItemNotesLabel] = js.native
  
  var line: js.UndefOr[ChartXAxisItemNotesLine] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartXAxisItemNotes {
  
  @scala.inline
  def apply(): ChartXAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItemNotes]
  }
  
  @scala.inline
  implicit class ChartXAxisItemNotesOps[Self <: ChartXAxisItemNotes] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ChartXAxisItemNotesDataItem*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChartXAxisItemNotesDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIcon(value: ChartXAxisItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartXAxisItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartXAxisItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
}
