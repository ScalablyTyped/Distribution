package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDurationTargetingOptionDetails extends StObject {
  
  /** Output only. The content duration. */
  var contentDuration: js.UndefOr[String] = js.undefined
}
object ContentDurationTargetingOptionDetails {
  
  inline def apply(): ContentDurationTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDurationTargetingOptionDetails]
  }
  
  extension [Self <: ContentDurationTargetingOptionDetails](x: Self) {
    
    inline def setContentDuration(value: String): Self = StObject.set(x, "contentDuration", value.asInstanceOf[js.Any])
    
    inline def setContentDurationUndefined: Self = StObject.set(x, "contentDuration", js.undefined)
  }
}
