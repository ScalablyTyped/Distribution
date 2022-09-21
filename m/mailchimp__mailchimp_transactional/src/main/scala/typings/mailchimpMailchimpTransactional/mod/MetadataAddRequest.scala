package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataAddRequest
  extends StObject
     with BaseRequest {
  
  /** a unique identifier for the metadata field */
  var name: String
  
  /** Mustache template to control how the metadata is rendered in your activity log */
  var view_template: js.UndefOr[String] = js.undefined
}
object MetadataAddRequest {
  
  inline def apply(name: String): MetadataAddRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataAddRequest]
  }
  
  extension [Self <: MetadataAddRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setView_template(value: String): Self = StObject.set(x, "view_template", value.asInstanceOf[js.Any])
    
    inline def setView_templateUndefined: Self = StObject.set(x, "view_template", js.undefined)
  }
}
