package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1BigQueryTableSpec extends StObject {
  
  /** Output only. The table source type. */
  var tableSourceType: js.UndefOr[String] = js.native
  
  /** Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`. */
  var tableSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1TableSpec] = js.native
  
  /** Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`. */
  var viewSpec: js.UndefOr[GoogleCloudDatacatalogV1beta1ViewSpec] = js.native
}
object GoogleCloudDatacatalogV1beta1BigQueryTableSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1BigQueryTableSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1BigQueryTableSpecMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1BigQueryTableSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableSourceType(value: String): Self = StObject.set(x, "tableSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSourceTypeUndefined: Self = StObject.set(x, "tableSourceType", js.undefined)
    
    @scala.inline
    def setTableSpec(value: GoogleCloudDatacatalogV1beta1TableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
    
    @scala.inline
    def setViewSpec(value: GoogleCloudDatacatalogV1beta1ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSpecUndefined: Self = StObject.set(x, "viewSpec", js.undefined)
  }
}
