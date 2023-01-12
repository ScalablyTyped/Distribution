package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContentTypeTargetingOptionDetails extends StObject {
  
  /** Output only. The audio content type. */
  var audioContentType: js.UndefOr[String] = js.undefined
}
object AudioContentTypeTargetingOptionDetails {
  
  inline def apply(): AudioContentTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContentTypeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioContentTypeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setAudioContentType(value: String): Self = StObject.set(x, "audioContentType", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeUndefined: Self = StObject.set(x, "audioContentType", js.undefined)
  }
}
