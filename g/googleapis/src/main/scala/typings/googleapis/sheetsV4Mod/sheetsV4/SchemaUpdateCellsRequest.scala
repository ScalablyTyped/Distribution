package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates all cells in a range with new data.
  */
trait SchemaUpdateCellsRequest extends StObject {
  
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The range to write data to.  If the data in rows does not cover the
    * entire requested range, the fields matching those set in fields will be
    * cleared.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The data to write.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.undefined
  
  /**
    * The coordinate to start writing data at. Any number of rows and columns
    * (including a different number of columns per row) may be written.
    */
  var start: js.UndefOr[SchemaGridCoordinate] = js.undefined
}
object SchemaUpdateCellsRequest {
  
  inline def apply(): SchemaUpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateCellsRequest]
  }
  
  extension [Self <: SchemaUpdateCellsRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRowData*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setStart(value: SchemaGridCoordinate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
