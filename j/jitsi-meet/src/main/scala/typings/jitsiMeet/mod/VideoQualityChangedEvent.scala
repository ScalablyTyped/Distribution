package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoQualityChangedEvent extends StObject {
  
  var videoQuality: Double
}
object VideoQualityChangedEvent {
  
  inline def apply(videoQuality: Double): VideoQualityChangedEvent = {
    val __obj = js.Dynamic.literal(videoQuality = videoQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoQualityChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoQualityChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setVideoQuality(value: Double): Self = StObject.set(x, "videoQuality", value.asInstanceOf[js.Any])
  }
}
