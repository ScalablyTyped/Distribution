package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGridCoordinate extends StObject {
  
  /**
    * The column index of the coordinate.
    */
  var columnIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The row index of the coordinate.
    */
  var rowIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sheet this coordinate is on.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGridCoordinate {
  
  inline def apply(): SchemaGridCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridCoordinate]
  }
  
  extension [Self <: SchemaGridCoordinate](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexNull: Self = StObject.set(x, "columnIndex", null)
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexNull: Self = StObject.set(x, "rowIndex", null)
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
