package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContentTypeAssignedTargetingOptionDetails extends StObject {
  
  /** The audio content type. Output only in v1. Required in v2. */
  var audioContentType: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_AUDIO_CONTENT_TYPE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object AudioContentTypeAssignedTargetingOptionDetails {
  
  inline def apply(): AudioContentTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContentTypeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: AudioContentTypeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAudioContentType(value: String): Self = StObject.set(x, "audioContentType", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeUndefined: Self = StObject.set(x, "audioContentType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
