package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnMenuMessages extends StObject {
  
  var columns: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var lock: js.UndefOr[String] = js.undefined
  
  var settings: js.UndefOr[String] = js.undefined
  
  var sortAscending: js.UndefOr[String] = js.undefined
  
  var sortDescending: js.UndefOr[String] = js.undefined
  
  var unlock: js.UndefOr[String] = js.undefined
}
object TreeListColumnMenuMessages {
  
  inline def apply(): TreeListColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnMenuMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListColumnMenuMessages] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLock(value: String): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setSettings(value: String): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSortAscending(value: String): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    
    inline def setSortDescending(value: String): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
    
    inline def setUnlock(value: String): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    inline def setUnlockUndefined: Self = StObject.set(x, "unlock", js.undefined)
  }
}
