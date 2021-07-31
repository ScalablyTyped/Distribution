package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentOutstreamPositionTargetingOptionDetails extends StObject {
  
  /** Output only. The content outstream position. */
  var contentOutstreamPosition: js.UndefOr[String] = js.undefined
}
object ContentOutstreamPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentOutstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOutstreamPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentOutstreamPositionTargetingOptionDetailsMutableBuilder[Self <: ContentOutstreamPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOutstreamPosition(value: String): Self = StObject.set(x, "contentOutstreamPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOutstreamPositionUndefined: Self = StObject.set(x, "contentOutstreamPosition", js.undefined)
  }
}
