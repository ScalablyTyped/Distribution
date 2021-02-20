package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnMenu extends StObject {
  
  var columns: js.UndefOr[Boolean] = js.native
  
  var filterable: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[TreeListColumnMenuMessages] = js.native
  
  var sortable: js.UndefOr[Boolean] = js.native
}
object TreeListColumnMenu {
  
  @scala.inline
  def apply(): TreeListColumnMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnMenu]
  }
  
  @scala.inline
  implicit class TreeListColumnMenuMutableBuilder[Self <: TreeListColumnMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeListColumnMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
