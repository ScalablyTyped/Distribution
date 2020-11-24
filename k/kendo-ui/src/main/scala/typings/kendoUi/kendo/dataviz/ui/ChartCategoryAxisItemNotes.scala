package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCategoryAxisItemNotes extends js.Object {
  
  var data: js.UndefOr[js.Array[ChartCategoryAxisItemNotesDataItem]] = js.native
  
  var icon: js.UndefOr[ChartCategoryAxisItemNotesIcon] = js.native
  
  var label: js.UndefOr[ChartCategoryAxisItemNotesLabel] = js.native
  
  var line: js.UndefOr[ChartCategoryAxisItemNotesLine] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartCategoryAxisItemNotes {
  
  @scala.inline
  def apply(): ChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemNotes]
  }
  
  @scala.inline
  implicit class ChartCategoryAxisItemNotesOps[Self <: ChartCategoryAxisItemNotes] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: ChartCategoryAxisItemNotesDataItem*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChartCategoryAxisItemNotesDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIcon(value: ChartCategoryAxisItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartCategoryAxisItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartCategoryAxisItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
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
