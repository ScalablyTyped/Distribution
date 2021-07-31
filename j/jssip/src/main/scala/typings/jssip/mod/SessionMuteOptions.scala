package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionMuteOptions extends StObject {
  
  var audio: js.UndefOr[Boolean] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
}
object SessionMuteOptions {
  
  @scala.inline
  def apply(): SessionMuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionMuteOptions]
  }
  
  @scala.inline
  implicit class SessionMuteOptionsMutableBuilder[Self <: SessionMuteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
