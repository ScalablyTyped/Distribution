package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionMuteOptions extends StObject {
  
  var audio: js.UndefOr[Boolean] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
}
object SessionMuteOptions {
  
  inline def apply(): SessionMuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionMuteOptions]
  }
  
  extension [Self <: SessionMuteOptions](x: Self) {
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
