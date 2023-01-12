package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStreamTypeTargetingOptionDetails extends StObject {
  
  /** Output only. The content stream type. */
  var contentStreamType: js.UndefOr[String] = js.undefined
}
object ContentStreamTypeTargetingOptionDetails {
  
  inline def apply(): ContentStreamTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentStreamTypeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentStreamTypeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setContentStreamType(value: String): Self = StObject.set(x, "contentStreamType", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeUndefined: Self = StObject.set(x, "contentStreamType", js.undefined)
  }
}
