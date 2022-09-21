package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceTable extends StObject {
  
  /**
    * The type to select columns for the data source table. Defaults to SELECTED.
    */
  var columnSelectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Columns selected for the data source table. The column_selection_type must be SELECTED.
    */
  var columns: js.UndefOr[js.Array[SchemaDataSourceColumnReference]] = js.undefined
  
  /**
    * Output only. The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * The ID of the data source the data source table is associated with.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filter specifications in the data source table.
    */
  var filterSpecs: js.UndefOr[js.Array[SchemaFilterSpec]] = js.undefined
  
  /**
    * The limit of rows to return. If not set, a default limit is applied. Please refer to the Sheets editor for the default and max limit.
    */
  var rowLimit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sort specifications in the data source table. The result of the data source table is sorted based on the sort specifications in order.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.undefined
}
object SchemaDataSourceTable {
  
  inline def apply(): SchemaDataSourceTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceTable]
  }
  
  extension [Self <: SchemaDataSourceTable](x: Self) {
    
    inline def setColumnSelectionType(value: String): Self = StObject.set(x, "columnSelectionType", value.asInstanceOf[js.Any])
    
    inline def setColumnSelectionTypeNull: Self = StObject.set(x, "columnSelectionType", null)
    
    inline def setColumnSelectionTypeUndefined: Self = StObject.set(x, "columnSelectionType", js.undefined)
    
    inline def setColumns(value: js.Array[SchemaDataSourceColumnReference]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaDataSourceColumnReference*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setFilterSpecs(value: js.Array[SchemaFilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    inline def setFilterSpecsVarargs(value: SchemaFilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
    
    inline def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
    
    inline def setRowLimitNull: Self = StObject.set(x, "rowLimit", null)
    
    inline def setRowLimitUndefined: Self = StObject.set(x, "rowLimit", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SchemaSortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value*))
  }
}
