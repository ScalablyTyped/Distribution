package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest extends StObject {
  
  /** Required. The new display name of the enum value. For example, `my_new_enum_value`. */
  var newEnumValueDisplayName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest] (val x: Self) extends AnyVal {
    
    inline def setNewEnumValueDisplayName(value: String): Self = StObject.set(x, "newEnumValueDisplayName", value.asInstanceOf[js.Any])
    
    inline def setNewEnumValueDisplayNameUndefined: Self = StObject.set(x, "newEnumValueDisplayName", js.undefined)
  }
}
