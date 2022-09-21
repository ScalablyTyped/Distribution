package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataResponse extends StObject {
  
  /** the unique identifier of the metadata field to update */
  var name: String
  
  /** the current state of the metadata field */
  var state: MetadataState
  
  /** Mustache template to control how the metadata is rendered in your activity log */
  var view_template: js.UndefOr[String | Null] = js.undefined
}
object MetadataResponse {
  
  inline def apply(name: String, state: MetadataState): MetadataResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResponse]
  }
  
  extension [Self <: MetadataResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setState(value: MetadataState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setView_template(value: String): Self = StObject.set(x, "view_template", value.asInstanceOf[js.Any])
    
    inline def setView_templateNull: Self = StObject.set(x, "view_template", null)
    
    inline def setView_templateUndefined: Self = StObject.set(x, "view_template", js.undefined)
  }
}
