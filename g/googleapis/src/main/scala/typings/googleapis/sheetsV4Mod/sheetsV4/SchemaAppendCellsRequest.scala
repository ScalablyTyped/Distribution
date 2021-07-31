package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds new cells after the last row with data in a sheet, inserting new rows
  * into the sheet if necessary.
  */
trait SchemaAppendCellsRequest extends StObject {
  
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The data to append.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.undefined
  
  /**
    * The sheet ID to append the data to.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaAppendCellsRequest {
  
  @scala.inline
  def apply(): SchemaAppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaAppendCellsRequestMutableBuilder[Self <: SchemaAppendCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRowData*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
