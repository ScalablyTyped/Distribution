package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentOutstreamPositionAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The content outstream position. */
  var contentOutstreamPosition: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ContentOutstreamPositionAssignedTargetingOptionDetails {
  
  inline def apply(): ContentOutstreamPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOutstreamPositionAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ContentOutstreamPositionAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentOutstreamPosition(value: String): Self = StObject.set(x, "contentOutstreamPosition", value.asInstanceOf[js.Any])
    
    inline def setContentOutstreamPositionUndefined: Self = StObject.set(x, "contentOutstreamPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
