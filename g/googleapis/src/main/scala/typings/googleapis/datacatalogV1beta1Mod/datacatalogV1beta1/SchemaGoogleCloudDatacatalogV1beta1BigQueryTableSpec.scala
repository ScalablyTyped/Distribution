package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1BigQueryTableSpec extends StObject {
  
  /**
    * Output only. The table source type.
    */
  var tableSourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
    */
  var tableSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1TableSpec] = js.undefined
  
  /**
    * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
    */
  var viewSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1ViewSpec] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1BigQueryTableSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1BigQueryTableSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1BigQueryTableSpec](x: Self) {
    
    inline def setTableSourceType(value: String): Self = StObject.set(x, "tableSourceType", value.asInstanceOf[js.Any])
    
    inline def setTableSourceTypeNull: Self = StObject.set(x, "tableSourceType", null)
    
    inline def setTableSourceTypeUndefined: Self = StObject.set(x, "tableSourceType", js.undefined)
    
    inline def setTableSpec(value: SchemaGoogleCloudDatacatalogV1beta1TableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
    
    inline def setViewSpec(value: SchemaGoogleCloudDatacatalogV1beta1ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
    
    inline def setViewSpecUndefined: Self = StObject.set(x, "viewSpec", js.undefined)
  }
}
