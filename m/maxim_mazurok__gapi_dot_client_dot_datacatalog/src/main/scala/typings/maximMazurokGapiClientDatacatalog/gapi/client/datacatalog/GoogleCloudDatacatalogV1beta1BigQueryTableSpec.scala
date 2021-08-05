package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1BigQueryTableSpec extends StObject {
  
  /** Output only. The table source type. */
  var tableSourceType: js.UndefOr[String] = js.undefined
  
  /** Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`. */
  var tableSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1TableSpec] = js.undefined
  
  /** Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`. */
  var viewSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1ViewSpec] = js.undefined
}
object GoogleCloudDatacatalogV1beta1BigQueryTableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1BigQueryTableSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1BigQueryTableSpec](x: Self) {
    
    inline def setTableSourceType(value: String): Self = StObject.set(x, "tableSourceType", value.asInstanceOf[js.Any])
    
    inline def setTableSourceTypeUndefined: Self = StObject.set(x, "tableSourceType", js.undefined)
    
    inline def setTableSpec(value: GoogleCloudDatacatalogV1beta1TableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
    
    inline def setViewSpec(value: GoogleCloudDatacatalogV1beta1ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
    
    inline def setViewSpecUndefined: Self = StObject.set(x, "viewSpec", js.undefined)
  }
}
