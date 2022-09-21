package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStreamTypeAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The content stream type. */
  var contentStreamType: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_STREAM_TYPE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ContentStreamTypeAssignedTargetingOptionDetails {
  
  inline def apply(): ContentStreamTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentStreamTypeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ContentStreamTypeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentStreamType(value: String): Self = StObject.set(x, "contentStreamType", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeUndefined: Self = StObject.set(x, "contentStreamType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
