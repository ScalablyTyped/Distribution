package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1BigQueryTableSpec extends StObject {
  
  /** Output only. The table source type. */
  var tableSourceType: js.UndefOr[String] = js.undefined
  
  /** Specification of a BigQuery table. Populated only if the `table_source_type` is `BIGQUERY_TABLE`. */
  var tableSpec: js.UndefOr[GoogleCloudDatacatalogV1TableSpec] = js.undefined
  
  /** Table view specification. Populated only if the `table_source_type` is `BIGQUERY_VIEW`. */
  var viewSpec: js.UndefOr[GoogleCloudDatacatalogV1ViewSpec] = js.undefined
}
object GoogleCloudDatacatalogV1BigQueryTableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1BigQueryTableSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1BigQueryTableSpec] (val x: Self) extends AnyVal {
    
    inline def setTableSourceType(value: String): Self = StObject.set(x, "tableSourceType", value.asInstanceOf[js.Any])
    
    inline def setTableSourceTypeUndefined: Self = StObject.set(x, "tableSourceType", js.undefined)
    
    inline def setTableSpec(value: GoogleCloudDatacatalogV1TableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    inline def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
    
    inline def setViewSpec(value: GoogleCloudDatacatalogV1ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
    
    inline def setViewSpecUndefined: Self = StObject.set(x, "viewSpec", js.undefined)
  }
}
