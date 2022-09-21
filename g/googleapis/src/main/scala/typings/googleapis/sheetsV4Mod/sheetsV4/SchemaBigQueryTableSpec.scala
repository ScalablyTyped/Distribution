package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryTableSpec extends StObject {
  
  /**
    * The BigQuery dataset id.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BigQuery table id.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed.
    */
  var tableProjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBigQueryTableSpec {
  
  inline def apply(): SchemaBigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryTableSpec]
  }
  
  extension [Self <: SchemaBigQueryTableSpec](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setTableProjectId(value: String): Self = StObject.set(x, "tableProjectId", value.asInstanceOf[js.Any])
    
    inline def setTableProjectIdNull: Self = StObject.set(x, "tableProjectId", null)
    
    inline def setTableProjectIdUndefined: Self = StObject.set(x, "tableProjectId", js.undefined)
  }
}
