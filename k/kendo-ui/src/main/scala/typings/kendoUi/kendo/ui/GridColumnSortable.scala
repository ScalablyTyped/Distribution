package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  
  var compare: js.UndefOr[js.Function] = js.undefined
  
  var initialDirection: js.UndefOr[String] = js.undefined
}
object GridColumnSortable {
  
  inline def apply(): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnSortable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnSortable] (val x: Self) extends AnyVal {
    
    inline def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
    
    inline def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setInitialDirection(value: String): Self = StObject.set(x, "initialDirection", value.asInstanceOf[js.Any])
    
    inline def setInitialDirectionUndefined: Self = StObject.set(x, "initialDirection", js.undefined)
  }
}
