package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioVideoOffset extends StObject {
  
  /** The offset in percentage of the audio or video duration. */
  var percentage: js.UndefOr[String] = js.undefined
  
  /** The offset in seconds from the start of the audio or video. */
  var seconds: js.UndefOr[String] = js.undefined
}
object AudioVideoOffset {
  
  inline def apply(): AudioVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioVideoOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioVideoOffset] (val x: Self) extends AnyVal {
    
    inline def setPercentage(value: String): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
