package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutGap extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
}
object TileLayoutGap {
  
  inline def apply(): TileLayoutGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutGap]
  }
  
  extension [Self <: TileLayoutGap](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
