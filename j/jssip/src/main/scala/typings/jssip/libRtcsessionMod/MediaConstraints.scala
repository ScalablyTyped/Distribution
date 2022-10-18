package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConstraints extends StObject {
  
  var audio: js.UndefOr[Boolean] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
}
object MediaConstraints {
  
  inline def apply(): MediaConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConstraints]
  }
  
  extension [Self <: MediaConstraints](x: Self) {
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
