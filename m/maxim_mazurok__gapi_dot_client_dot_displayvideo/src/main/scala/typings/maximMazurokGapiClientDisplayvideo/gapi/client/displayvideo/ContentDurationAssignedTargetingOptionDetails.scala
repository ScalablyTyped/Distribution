package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDurationAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The content duration. */
  var contentDuration: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_DURATION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ContentDurationAssignedTargetingOptionDetails {
  
  inline def apply(): ContentDurationAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDurationAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentDurationAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setContentDuration(value: String): Self = StObject.set(x, "contentDuration", value.asInstanceOf[js.Any])
    
    inline def setContentDurationUndefined: Self = StObject.set(x, "contentDuration", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
