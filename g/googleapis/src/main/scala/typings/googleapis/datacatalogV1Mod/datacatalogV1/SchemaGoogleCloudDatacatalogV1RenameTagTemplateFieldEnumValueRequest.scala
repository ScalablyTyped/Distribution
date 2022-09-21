package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest extends StObject {
  
  /**
    * Required. The new display name of the enum value. For example, `my_new_enum_value`.
    */
  var newEnumValueDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest](x: Self) {
    
    inline def setNewEnumValueDisplayName(value: String): Self = StObject.set(x, "newEnumValueDisplayName", value.asInstanceOf[js.Any])
    
    inline def setNewEnumValueDisplayNameNull: Self = StObject.set(x, "newEnumValueDisplayName", null)
    
    inline def setNewEnumValueDisplayNameUndefined: Self = StObject.set(x, "newEnumValueDisplayName", js.undefined)
  }
}
