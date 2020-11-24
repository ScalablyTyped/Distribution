package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1FieldType extends js.Object {
  
  /** Represents an enum type. */
  var enumType: js.UndefOr[GoogleCloudDatacatalogV1beta1FieldTypeEnumType] = js.native
  
  /** Represents primitive types - string, bool etc. */
  var primitiveType: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1FieldType {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldType]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeOps[Self <: GoogleCloudDatacatalogV1beta1FieldType] (val x: Self) extends AnyVal {
    
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
    def setEnumType(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumType): Self = this.set("enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumType: Self = this.set("enumType", js.undefined)
    
    @scala.inline
    def setPrimitiveType(value: String): Self = this.set("primitiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveType: Self = this.set("primitiveType", js.undefined)
  }
}
