package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerToolbarOptions extends StObject {
  
  var items: js.UndefOr[js.Array[ToolBarItem] | SchedulerToolbarItemsOptions] = js.undefined
}
object SchedulerToolbarOptions {
  
  inline def apply(): SchedulerToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerToolbarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerToolbarOptions] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ToolBarItem] | SchedulerToolbarItemsOptions): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ToolBarItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
