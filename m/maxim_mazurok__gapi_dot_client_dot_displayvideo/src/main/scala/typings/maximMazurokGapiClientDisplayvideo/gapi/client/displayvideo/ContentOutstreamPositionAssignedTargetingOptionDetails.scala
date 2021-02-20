package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentOutstreamPositionAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The content outstream position. */
  var contentOutstreamPosition: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object ContentOutstreamPositionAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentOutstreamPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOutstreamPositionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentOutstreamPositionAssignedTargetingOptionDetailsMutableBuilder[Self <: ContentOutstreamPositionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOutstreamPosition(value: String): Self = StObject.set(x, "contentOutstreamPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOutstreamPositionUndefined: Self = StObject.set(x, "contentOutstreamPosition", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
