package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardToolbar extends StObject {
  
  var items: js.UndefOr[js.Array[TaskBoardToolbarItem]] = js.undefined
}
object TaskBoardToolbar {
  
  inline def apply(): TaskBoardToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardToolbar]
  }
  
  extension [Self <: TaskBoardToolbar](x: Self) {
    
    inline def setItems(value: js.Array[TaskBoardToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TaskBoardToolbarItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
