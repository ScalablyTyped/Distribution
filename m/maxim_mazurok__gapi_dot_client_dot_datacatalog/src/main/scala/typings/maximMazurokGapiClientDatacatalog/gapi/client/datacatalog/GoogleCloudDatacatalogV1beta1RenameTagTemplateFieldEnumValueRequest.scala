package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest extends StObject {
  
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
  implicit class GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequestMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewEnumValueDisplayName(value: String): Self = StObject.set(x, "newEnumValueDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewEnumValueDisplayNameUndefined: Self = StObject.set(x, "newEnumValueDisplayName", js.undefined)
  }
}
