package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnMenu extends js.Object {
  
  var columns: js.UndefOr[Boolean] = js.native
  
  var filterable: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[GridColumnMenuMessages] = js.native
  
  var sortable: js.UndefOr[Boolean] = js.native
}
object GridColumnMenu {
  
  @scala.inline
  def apply(): GridColumnMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenu]
  }
  
  @scala.inline
  implicit class GridColumnMenuOps[Self <: GridColumnMenu] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Boolean): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setMessages(value: GridColumnMenuMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
}
