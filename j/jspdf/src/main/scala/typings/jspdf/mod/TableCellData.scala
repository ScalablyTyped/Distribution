package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellData extends StObject {
  
  var col: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
}
object TableCellData {
  
  inline def apply(): TableCellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellData]
  }
  
  extension [Self <: TableCellData](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
