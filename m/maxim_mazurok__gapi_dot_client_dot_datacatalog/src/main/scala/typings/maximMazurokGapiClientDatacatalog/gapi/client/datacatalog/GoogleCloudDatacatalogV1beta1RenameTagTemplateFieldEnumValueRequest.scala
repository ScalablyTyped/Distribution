package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest extends js.Object {
  
  /** Required. The new display name of the enum value. For example, `my_new_enum_value`. */
  var newEnumValueDisplayName: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequestOps[Self <: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest] (val x: Self) extends AnyVal {
    
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
    def setNewEnumValueDisplayName(value: String): Self = this.set("newEnumValueDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewEnumValueDisplayName: Self = this.set("newEnumValueDisplayName", js.undefined)
  }
}
