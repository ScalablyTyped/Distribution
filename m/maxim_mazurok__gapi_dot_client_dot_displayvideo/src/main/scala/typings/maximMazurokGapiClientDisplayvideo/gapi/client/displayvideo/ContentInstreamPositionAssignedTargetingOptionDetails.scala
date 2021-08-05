package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInstreamPositionAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The content instream position for video or audio ads. */
  var contentInstreamPosition: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ContentInstreamPositionAssignedTargetingOptionDetails {
  
  inline def apply(): ContentInstreamPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInstreamPositionAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ContentInstreamPositionAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentInstreamPosition(value: String): Self = StObject.set(x, "contentInstreamPosition", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionUndefined: Self = StObject.set(x, "contentInstreamPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
