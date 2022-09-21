package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceSheetProperties extends StObject {
  
  /**
    * The columns displayed on the sheet, corresponding to the values in RowData.
    */
  var columns: js.UndefOr[js.Array[SchemaDataSourceColumn]] = js.undefined
  
  /**
    * The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * ID of the DataSource the sheet is connected to.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceSheetProperties {
  
  inline def apply(): SchemaDataSourceSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceSheetProperties]
  }
  
  extension [Self <: SchemaDataSourceSheetProperties](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaDataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaDataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
