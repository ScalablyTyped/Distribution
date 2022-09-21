package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableCellLocation extends StObject {
  
  /**
    * The 0-based column index.
    */
  var columnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The 0-based row index.
    */
  var rowIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTableCellLocation {
  
  inline def apply(): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
  
  extension [Self <: SchemaTableCellLocation](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexNull: Self = StObject.set(x, "columnIndex", null)
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexNull: Self = StObject.set(x, "rowIndex", null)
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
