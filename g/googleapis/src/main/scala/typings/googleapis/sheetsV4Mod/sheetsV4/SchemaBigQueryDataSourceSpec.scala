package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryDataSourceSpec extends StObject {
  
  /**
    * The ID of a BigQuery enabled GCP project with a billing account attached. For any queries executed against the data source, the project is charged.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A BigQueryQuerySpec.
    */
  var querySpec: js.UndefOr[SchemaBigQueryQuerySpec] = js.undefined
  
  /**
    * A BigQueryTableSpec.
    */
  var tableSpec: js.UndefOr[SchemaBigQueryTableSpec] = js.undefined
}
object SchemaBigQueryDataSourceSpec {
  
  inline def apply(): SchemaBigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDataSourceSpec]
  }
  
  extension [Self <: SchemaBigQueryDataSourceSpec](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setQuerySpec(value: SchemaBigQueryQuerySpec): Self = StObject.set(x, "querySpec", value.asInstanceOf[js.Any])
    
    inline def setQuerySpecUndefined: Self = StObject.set(x, "querySpec", js.undefined)
    
    inline def setTableSpec(value: SchemaBigQueryTableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
  }
}
