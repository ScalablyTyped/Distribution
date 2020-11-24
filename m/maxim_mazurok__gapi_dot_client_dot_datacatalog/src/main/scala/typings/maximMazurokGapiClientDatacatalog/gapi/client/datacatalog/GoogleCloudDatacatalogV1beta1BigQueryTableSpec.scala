package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1BigQueryTableSpec extends js.Object {
  
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
  implicit class GoogleCloudDatacatalogV1beta1BigQueryTableSpecOps[Self <: GoogleCloudDatacatalogV1beta1BigQueryTableSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableSourceType(value: String): Self = this.set("tableSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSourceType: Self = this.set("tableSourceType", js.undefined)
    
    @scala.inline
    def setTableSpec(value: GoogleCloudDatacatalogV1beta1TableSpec): Self = this.set("tableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSpec: Self = this.set("tableSpec", js.undefined)
    
    @scala.inline
    def setViewSpec(value: GoogleCloudDatacatalogV1beta1ViewSpec): Self = this.set("viewSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewSpec: Self = this.set("viewSpec", js.undefined)
  }
}
