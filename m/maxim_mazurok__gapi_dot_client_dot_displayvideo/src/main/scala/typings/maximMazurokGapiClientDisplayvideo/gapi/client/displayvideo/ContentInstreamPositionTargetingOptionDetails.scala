package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInstreamPositionTargetingOptionDetails extends StObject {
  
  /** Output only. The content instream position. */
  var contentInstreamPosition: js.UndefOr[String] = js.undefined
}
object ContentInstreamPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentInstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInstreamPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentInstreamPositionTargetingOptionDetailsMutableBuilder[Self <: ContentInstreamPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentInstreamPosition(value: String): Self = StObject.set(x, "contentInstreamPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInstreamPositionUndefined: Self = StObject.set(x, "contentInstreamPosition", js.undefined)
  }
}
