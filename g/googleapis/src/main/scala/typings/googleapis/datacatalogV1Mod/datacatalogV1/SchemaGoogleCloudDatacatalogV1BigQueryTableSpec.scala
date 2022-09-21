package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1BigQueryTableSpec extends StObject {
  
  /**
    * Output only. The table source type.
    */
  var tableSourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specification of a BigQuery table. Populated only if the `table_source_type` is `BIGQUERY_TABLE`.
    */
  var tableSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1TableSpec] = js.undefined
  
  /**
    * Table view specification. Populated only if the `table_source_type` is `BIGQUERY_VIEW`.
    */
  var viewSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1ViewSpec] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1BigQueryTableSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1BigQueryTableSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1BigQueryTableSpec](x: Self) {
    
    inline def setTableSourceType(value: String): Self = StObject.set(x, "tableSourceType", value.asInstanceOf[js.Any])
    
    inline def setTableSourceTypeNull: Self = StObject.set(x, "tableSourceType", null)
    
    inline def setTableSourceTypeUndefined: Self = StObject.set(x, "tableSourceType", js.undefined)
    
    inline def setTableSpec(value: SchemaGoogleCloudDatacatalogV1TableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
    
    inline def setViewSpec(value: SchemaGoogleCloudDatacatalogV1ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
    
    inline def setViewSpecUndefined: Self = StObject.set(x, "viewSpec", js.undefined)
  }
}
