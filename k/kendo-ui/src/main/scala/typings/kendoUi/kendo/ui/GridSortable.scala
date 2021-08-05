package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  
  var initialDirection: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var showIndexes: js.UndefOr[Boolean] = js.undefined
}
object GridSortable {
  
  inline def apply(): GridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSortable]
  }
  
  extension [Self <: GridSortable](x: Self) {
    
    inline def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
    
    inline def setInitialDirection(value: String): Self = StObject.set(x, "initialDirection", value.asInstanceOf[js.Any])
    
    inline def setInitialDirectionUndefined: Self = StObject.set(x, "initialDirection", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowIndexes(value: Boolean): Self = StObject.set(x, "showIndexes", value.asInstanceOf[js.Any])
    
    inline def setShowIndexesUndefined: Self = StObject.set(x, "showIndexes", js.undefined)
  }
}
