package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Schema extends js.Object {
  
  /** Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be specified. */
  var columns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]] = js.native
}
object GoogleCloudDatacatalogV1beta1Schema {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Schema]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SchemaOps[Self <: GoogleCloudDatacatalogV1beta1Schema] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: GoogleCloudDatacatalogV1beta1ColumnSchema*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
}
