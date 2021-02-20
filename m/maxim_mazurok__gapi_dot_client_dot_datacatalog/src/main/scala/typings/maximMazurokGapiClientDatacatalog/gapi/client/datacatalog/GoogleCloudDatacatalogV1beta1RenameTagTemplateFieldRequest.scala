package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest extends StObject {
  
  /** Required. The new ID of this tag template field. For example, `my_new_field`. */
  var newTagTemplateFieldId: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequestMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTagTemplateFieldId(value: String): Self = StObject.set(x, "newTagTemplateFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTagTemplateFieldIdUndefined: Self = StObject.set(x, "newTagTemplateFieldId", js.undefined)
  }
}
