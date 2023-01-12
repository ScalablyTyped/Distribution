package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSet extends StObject {
  
  var audio: js.UndefOr[Track] = js.undefined
  
  var audiovideo: js.UndefOr[Track] = js.undefined
  
  var video: js.UndefOr[Track] = js.undefined
}
object TrackSet {
  
  inline def apply(): TrackSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackSet] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: Track): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAudiovideo(value: Track): Self = StObject.set(x, "audiovideo", value.asInstanceOf[js.Any])
    
    inline def setAudiovideoUndefined: Self = StObject.set(x, "audiovideo", js.undefined)
    
    inline def setVideo(value: Track): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
