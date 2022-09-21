package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnMenuColumnsGroup extends StObject {
  
  var columns: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object GridColumnMenuColumnsGroup {
  
  inline def apply(): GridColumnMenuColumnsGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnMenuColumnsGroup]
  }
  
  extension [Self <: GridColumnMenuColumnsGroup](x: Self) {
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
