package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnMenu extends StObject {
  
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
  implicit class GridColumnMenuMutableBuilder[Self <: GridColumnMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setMessages(value: GridColumnMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
