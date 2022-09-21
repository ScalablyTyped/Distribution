package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSource extends StObject {
  
  /**
    * All calculated columns in the data source.
    */
  var calculatedColumns: js.UndefOr[js.Array[SchemaDataSourceColumn]] = js.undefined
  
  /**
    * The spreadsheet-scoped unique ID that identifies the data source. Example: 1080547365.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the Sheet connected with the data source. The field cannot be changed once set. When creating a data source, an associated DATA_SOURCE sheet is also created, if the field is not specified, the ID of the created sheet will be randomly generated.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The DataSourceSpec for the data source connected with this spreadsheet.
    */
  var spec: js.UndefOr[SchemaDataSourceSpec] = js.undefined
}
object SchemaDataSource {
  
  inline def apply(): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSource]
  }
  
  extension [Self <: SchemaDataSource](x: Self) {
    
    inline def setCalculatedColumns(value: js.Array[SchemaDataSourceColumn]): Self = StObject.set(x, "calculatedColumns", value.asInstanceOf[js.Any])
    
    inline def setCalculatedColumnsUndefined: Self = StObject.set(x, "calculatedColumns", js.undefined)
    
    inline def setCalculatedColumnsVarargs(value: SchemaDataSourceColumn*): Self = StObject.set(x, "calculatedColumns", js.Array(value*))
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    inline def setSpec(value: SchemaDataSourceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
