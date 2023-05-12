package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<hls.js.hls.js.ElementaryStreamTypes, hls.js.hls.js.ElementaryStreamInfo | null> */
trait ElementaryStreams extends StObject {
  
  var audio: ElementaryStreamInfo | Null
  
  var audiovideo: ElementaryStreamInfo | Null
  
  var video: ElementaryStreamInfo | Null
}
object ElementaryStreams {
  
  inline def apply(): ElementaryStreams = {
    val __obj = js.Dynamic.literal(audio = null, audiovideo = null, video = null)
    __obj.asInstanceOf[ElementaryStreams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementaryStreams] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: ElementaryStreamInfo): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudiovideo(value: ElementaryStreamInfo): Self = StObject.set(x, "audiovideo", value.asInstanceOf[js.Any])
    
    inline def setAudiovideoNull: Self = StObject.set(x, "audiovideo", null)
    
    inline def setVideo(value: ElementaryStreamInfo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoNull: Self = StObject.set(x, "video", null)
  }
}
