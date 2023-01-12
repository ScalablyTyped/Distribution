package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellChange extends StObject {
  
  var col: String
  
  var newValue: CellValue
  
  var oldValue: CellValue
  
  var row: String
  
  var x: String
  
  var y: String
}
object CellChange {
  
  inline def apply(col: String, newValue: CellValue, oldValue: CellValue, row: String, x: String, y: String): CellChange = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellChange] (val x: Self) extends AnyVal {
    
    inline def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: CellValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: CellValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
