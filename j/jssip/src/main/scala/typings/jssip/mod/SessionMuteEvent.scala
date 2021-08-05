package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionMuteEvent extends StObject {
  
  var audio: Boolean
  
  var video: Boolean
}
object SessionMuteEvent {
  
  inline def apply(audio: Boolean, video: Boolean): SessionMuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionMuteEvent]
  }
  
  extension [Self <: SessionMuteEvent](x: Self) {
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
