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
  
  extension [Self <: VideoQualityChangedEvent](x: Self) {
    
    inline def setVideoQuality(value: Double): Self = StObject.set(x, "videoQuality", value.asInstanceOf[js.Any])
  }
}
