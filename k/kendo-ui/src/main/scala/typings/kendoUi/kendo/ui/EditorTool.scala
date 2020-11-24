package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorTool extends js.Object {
  
  var columns: js.UndefOr[Double] = js.native
  
  var exec: js.UndefOr[js.Function] = js.native
  
  var items: js.UndefOr[js.Array[EditorToolItem]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var palette: js.UndefOr[String | js.Any] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object EditorTool {
  
  @scala.inline
  def apply(): EditorTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorTool]
  }
  
  @scala.inline
  implicit class EditorToolOps[Self <: EditorTool] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setExec(value: js.Function): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: EditorToolItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[EditorToolItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPalette(value: String | js.Any): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
