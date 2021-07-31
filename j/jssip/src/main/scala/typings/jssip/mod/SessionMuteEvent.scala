package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionMuteEvent extends StObject {
  
  var audio: Boolean
  
  var video: Boolean
}
object SessionMuteEvent {
  
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SessionMuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionMuteEvent]
  }
  
  @scala.inline
  implicit class SessionMuteEventMutableBuilder[Self <: SessionMuteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
