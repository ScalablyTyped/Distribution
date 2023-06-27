package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerToolbarItemsMobileOptions extends StObject {
  
  var main: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
  
  var navigation: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
}
object SchedulerToolbarItemsMobileOptions {
  
  inline def apply(): SchedulerToolbarItemsMobileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerToolbarItemsMobileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerToolbarItemsMobileOptions] (val x: Self) extends AnyVal {
    
    inline def setMain(value: js.Array[ToolBarItem]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setMainVarargs(value: ToolBarItem*): Self = StObject.set(x, "main", js.Array(value*))
    
    inline def setNavigation(value: js.Array[ToolBarItem]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNavigationVarargs(value: ToolBarItem*): Self = StObject.set(x, "navigation", js.Array(value*))
  }
}
