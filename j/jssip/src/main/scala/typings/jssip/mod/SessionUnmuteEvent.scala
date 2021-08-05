package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionUnmuteEvent extends StObject {
  
  var audio: Boolean
  
  var video: Boolean
}
object SessionUnmuteEvent {
  
  inline def apply(audio: Boolean, video: Boolean): SessionUnmuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUnmuteEvent]
  }
  
  extension [Self <: SessionUnmuteEvent](x: Self) {
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
