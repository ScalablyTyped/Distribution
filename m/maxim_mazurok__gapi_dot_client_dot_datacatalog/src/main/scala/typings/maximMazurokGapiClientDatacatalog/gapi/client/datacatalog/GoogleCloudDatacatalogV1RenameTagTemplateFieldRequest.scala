package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest extends StObject {
  
  /** Required. The new ID of this tag template field. For example, `my_new_field`. */
  var newTagTemplateFieldId: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest] (val x: Self) extends AnyVal {
    
    inline def setNewTagTemplateFieldId(value: String): Self = StObject.set(x, "newTagTemplateFieldId", value.asInstanceOf[js.Any])
    
    inline def setNewTagTemplateFieldIdUndefined: Self = StObject.set(x, "newTagTemplateFieldId", js.undefined)
  }
}
