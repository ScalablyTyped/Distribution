package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<hls.js.hls.js.SourceBufferName, hls.js.hls.js.ExtendedSourceBuffer>> */
trait SourceBuffers extends StObject {
  
  var audio: js.UndefOr[ExtendedSourceBuffer] = js.undefined
  
  var audiovideo: js.UndefOr[ExtendedSourceBuffer] = js.undefined
  
  var video: js.UndefOr[ExtendedSourceBuffer] = js.undefined
}
object SourceBuffers {
  
  inline def apply(): SourceBuffers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceBuffers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceBuffers] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: ExtendedSourceBuffer): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAudiovideo(value: ExtendedSourceBuffer): Self = StObject.set(x, "audiovideo", value.asInstanceOf[js.Any])
    
    inline def setAudiovideoUndefined: Self = StObject.set(x, "audiovideo", js.undefined)
    
    inline def setVideo(value: ExtendedSourceBuffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
