package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridResizable extends StObject {
  
  var columns: js.UndefOr[Boolean] = js.undefined
  
  var rows: js.UndefOr[Boolean] = js.undefined
}
object GridResizable {
  
  inline def apply(): GridResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridResizable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridResizable] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setRows(value: Boolean): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
