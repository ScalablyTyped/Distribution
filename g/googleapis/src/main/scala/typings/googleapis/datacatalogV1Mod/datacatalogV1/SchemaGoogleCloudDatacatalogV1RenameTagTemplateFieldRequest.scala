package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldRequest extends StObject {
  
  /**
    * Required. The new ID of this tag template field. For example, `my_new_field`.
    */
  var newTagTemplateFieldId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldRequest](x: Self) {
    
    inline def setNewTagTemplateFieldId(value: String): Self = StObject.set(x, "newTagTemplateFieldId", value.asInstanceOf[js.Any])
    
    inline def setNewTagTemplateFieldIdNull: Self = StObject.set(x, "newTagTemplateFieldId", null)
    
    inline def setNewTagTemplateFieldIdUndefined: Self = StObject.set(x, "newTagTemplateFieldId", js.undefined)
  }
}
