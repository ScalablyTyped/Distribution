package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppendCellsRequest extends StObject {
  
  /**
    * The fields of CellData that should be updated. At least one field must be specified. The root is the CellData; 'row.values.' should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data to append.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.undefined
  
  /**
    * The sheet ID to append the data to.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAppendCellsRequest {
  
  inline def apply(): SchemaAppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendCellsRequest]
  }
  
  extension [Self <: SchemaAppendCellsRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRowData*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
