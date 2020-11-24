package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ColumnSchema extends js.Object {
  
  /** Required. Name of the column. */
  var column: js.UndefOr[String] = js.native
  
  /** Optional. Description of the column. Default value is an empty string. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. A column's mode indicates whether the values in this column are required, nullable, etc. Only `NULLABLE`, `REQUIRED` and `REPEATED` are supported. Default mode is
    * `NULLABLE`.
    */
  var mode: js.UndefOr[String] = js.native
  
  /** Optional. Schema of sub-columns. A column can have zero or more sub-columns. */
  var subcolumns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]] = js.native
  
  /** Required. Type of the column. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1ColumnSchema {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ColumnSchema]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ColumnSchemaOps[Self <: GoogleCloudDatacatalogV1beta1ColumnSchema] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSubcolumnsVarargs(value: GoogleCloudDatacatalogV1beta1ColumnSchema*): Self = this.set("subcolumns", js.Array(value :_*))
    
    @scala.inline
    def setSubcolumns(value: js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]): Self = this.set("subcolumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubcolumns: Self = this.set("subcolumns", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
