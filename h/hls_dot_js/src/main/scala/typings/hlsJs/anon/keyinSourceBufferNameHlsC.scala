package typings.hlsJs.anon

import typings.hlsJs.mod.HlsChunkPerformanceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in hls.js.hls.js.SourceBufferName ]: hls.js.hls.js.HlsChunkPerformanceTiming} */
trait keyinSourceBufferNameHlsC extends StObject {
  
  var audio: HlsChunkPerformanceTiming
  
  var audiovideo: HlsChunkPerformanceTiming
  
  var video: HlsChunkPerformanceTiming
}
object keyinSourceBufferNameHlsC {
  
  inline def apply(
    audio: HlsChunkPerformanceTiming,
    audiovideo: HlsChunkPerformanceTiming,
    video: HlsChunkPerformanceTiming
  ): keyinSourceBufferNameHlsC = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], audiovideo = audiovideo.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinSourceBufferNameHlsC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinSourceBufferNameHlsC] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: HlsChunkPerformanceTiming): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudiovideo(value: HlsChunkPerformanceTiming): Self = StObject.set(x, "audiovideo", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: HlsChunkPerformanceTiming): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
