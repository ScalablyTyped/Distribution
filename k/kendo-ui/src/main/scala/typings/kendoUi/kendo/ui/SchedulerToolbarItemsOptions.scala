package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerToolbarItemsOptions extends StObject {
  
  var desktop: js.UndefOr[js.Array[ToolBarItem]] = js.undefined
  
  var mobile: js.UndefOr[SchedulerToolbarItemsMobileOptions] = js.undefined
}
object SchedulerToolbarItemsOptions {
  
  inline def apply(): SchedulerToolbarItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerToolbarItemsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerToolbarItemsOptions] (val x: Self) extends AnyVal {
    
    inline def setDesktop(value: js.Array[ToolBarItem]): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setDesktopVarargs(value: ToolBarItem*): Self = StObject.set(x, "desktop", js.Array(value*))
    
    inline def setMobile(value: SchedulerToolbarItemsMobileOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
