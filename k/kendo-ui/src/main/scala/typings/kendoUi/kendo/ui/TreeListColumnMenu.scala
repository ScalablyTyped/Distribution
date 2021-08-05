package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnMenu extends StObject {
  
  var columns: js.UndefOr[Boolean] = js.undefined
  
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[TreeListColumnMenuMessages] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
}
object TreeListColumnMenu {
  
  inline def apply(): TreeListColumnMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnMenu]
  }
  
  extension [Self <: TreeListColumnMenu](x: Self) {
    
    inline def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setMessages(value: TreeListColumnMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
