package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnMenu extends StObject {
  
  var columns: js.UndefOr[Boolean | GridColumnMenuColumns] = js.undefined
  
  var componentType: js.UndefOr[String] = js.undefined
  
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[GridColumnMenuMessages] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
}
object GridColumnMenu {
  
  inline def apply(): GridColumnMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnMenu] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Boolean | GridColumnMenuColumns): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setComponentType(value: String): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "componentType", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setMessages(value: GridColumnMenuMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
