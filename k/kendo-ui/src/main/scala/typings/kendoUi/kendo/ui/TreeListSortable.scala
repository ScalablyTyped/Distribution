package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
}
object TreeListSortable {
  
  inline def apply(): TreeListSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListSortable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListSortable] (val x: Self) extends AnyVal {
    
    inline def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
