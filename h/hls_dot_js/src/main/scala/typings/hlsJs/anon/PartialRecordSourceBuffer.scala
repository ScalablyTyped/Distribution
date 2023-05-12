package typings.hlsJs.anon

import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<hls.js.hls.js.SourceBufferName, std.TimeRanges>> */
trait PartialRecordSourceBuffer extends StObject {
  
  var audio: js.UndefOr[TimeRanges] = js.undefined
  
  var audiovideo: js.UndefOr[TimeRanges] = js.undefined
  
  var video: js.UndefOr[TimeRanges] = js.undefined
}
object PartialRecordSourceBuffer {
  
  inline def apply(): PartialRecordSourceBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordSourceBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordSourceBuffer] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: TimeRanges): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAudiovideo(value: TimeRanges): Self = StObject.set(x, "audiovideo", value.asInstanceOf[js.Any])
    
    inline def setAudiovideoUndefined: Self = StObject.set(x, "audiovideo", js.undefined)
    
    inline def setVideo(value: TimeRanges): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
