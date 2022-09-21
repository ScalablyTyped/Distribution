package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsertTableColumnRequest extends StObject {
  
  /**
    * Whether to insert new column to the right of the reference cell location. - `True`: insert to the right. - `False`: insert to the left.
    */
  var insertRight: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The reference table cell location from which columns will be inserted. A new column will be inserted to the left (or right) of the column where the reference cell is. If the reference cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
}
object SchemaInsertTableColumnRequest {
  
  inline def apply(): SchemaInsertTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableColumnRequest]
  }
  
  extension [Self <: SchemaInsertTableColumnRequest](x: Self) {
    
    inline def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
    
    inline def setInsertRightNull: Self = StObject.set(x, "insertRight", null)
    
    inline def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
    
    inline def setTableCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
