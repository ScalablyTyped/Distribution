package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInstreamPositionAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The ad type to target. Only applicable to insertion order targeting and new line items supporting the specified ad type will inherit this targeting option by default.
    * Possible values are: * `AD_TYPE_VIDEO`, the setting will be inherited by new line item when line_item_type is `LINE_ITEM_TYPE_VIDEO_DEFAULT`. * `AD_TYPE_AUDIO`, the setting will be
    * inherited by new line item when line_item_type is `LINE_ITEM_TYPE_AUDIO_DEFAULT`.
    */
  var adType: js.UndefOr[String] = js.undefined
  
  /** The content instream position for video or audio ads. Output only in v1. Required in v2. */
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
    
    inline def setAdType(value: String): Self = StObject.set(x, "adType", value.asInstanceOf[js.Any])
    
    inline def setAdTypeUndefined: Self = StObject.set(x, "adType", js.undefined)
    
    inline def setContentInstreamPosition(value: String): Self = StObject.set(x, "contentInstreamPosition", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionUndefined: Self = StObject.set(x, "contentInstreamPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
