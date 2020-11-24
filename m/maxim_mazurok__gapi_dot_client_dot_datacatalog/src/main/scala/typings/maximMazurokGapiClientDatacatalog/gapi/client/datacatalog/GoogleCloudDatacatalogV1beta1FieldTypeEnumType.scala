package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1FieldTypeEnumType extends js.Object {
  
  var allowedValues: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]] = js.native
}
object GoogleCloudDatacatalogV1beta1FieldTypeEnumType {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldTypeEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldTypeEnumType]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeOps[Self <: GoogleCloudDatacatalogV1beta1FieldTypeEnumType] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
  }
}
