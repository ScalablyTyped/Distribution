package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGridData extends StObject {
  
  /**
    * Metadata about the requested columns in the grid, starting with the column in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.undefined
  
  /**
    * The data in the grid, one entry per row, starting with the row in startRow. The values in RowData will correspond to columns starting at start_column.
    */
  var rowData: js.UndefOr[js.Array[SchemaRowData]] = js.undefined
  
  /**
    * Metadata about the requested rows in the grid, starting with the row in start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.undefined
  
  /**
    * The first column this GridData refers to, zero-based.
    */
  var startColumn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The first row this GridData refers to, zero-based.
    */
  var startRow: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGridData {
  
  inline def apply(): SchemaGridData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridData]
  }
  
  extension [Self <: SchemaGridData](x: Self) {
    
    inline def setColumnMetadata(value: js.Array[SchemaDimensionProperties]): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    inline def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    inline def setColumnMetadataVarargs(value: SchemaDimensionProperties*): Self = StObject.set(x, "columnMetadata", js.Array(value*))
    
    inline def setRowData(value: js.Array[SchemaRowData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    inline def setRowDataVarargs(value: SchemaRowData*): Self = StObject.set(x, "rowData", js.Array(value*))
    
    inline def setRowMetadata(value: js.Array[SchemaDimensionProperties]): Self = StObject.set(x, "rowMetadata", value.asInstanceOf[js.Any])
    
    inline def setRowMetadataUndefined: Self = StObject.set(x, "rowMetadata", js.undefined)
    
    inline def setRowMetadataVarargs(value: SchemaDimensionProperties*): Self = StObject.set(x, "rowMetadata", js.Array(value*))
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnNull: Self = StObject.set(x, "startColumn", null)
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowNull: Self = StObject.set(x, "startRow", null)
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
  }
}
