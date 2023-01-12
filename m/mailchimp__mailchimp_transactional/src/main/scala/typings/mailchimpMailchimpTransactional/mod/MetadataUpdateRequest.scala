package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataUpdateRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the metadata field to update */
  var name: String
  
  /** Mustache template to control how the metadata is rendered in your activity log */
  var view_template: String
}
object MetadataUpdateRequest {
  
  inline def apply(name: String, view_template: String): MetadataUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], view_template = view_template.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setView_template(value: String): Self = StObject.set(x, "view_template", value.asInstanceOf[js.Any])
  }
}
