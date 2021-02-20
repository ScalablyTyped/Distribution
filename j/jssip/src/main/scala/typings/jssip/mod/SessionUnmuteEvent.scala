package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionUnmuteEvent extends StObject {
  
  var audio: Boolean = js.native
  
  var video: Boolean = js.native
}
object SessionUnmuteEvent {
  
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SessionUnmuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUnmuteEvent]
  }
  
  @scala.inline
  implicit class SessionUnmuteEventMutableBuilder[Self <: SessionUnmuteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
