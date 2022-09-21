package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemuxerResult extends StObject {
  
  var audio: js.UndefOr[RemuxedTrack] = js.undefined
  
  var id3: js.UndefOr[RemuxedMetadata] = js.undefined
  
  var independent: js.UndefOr[Boolean] = js.undefined
  
  var initSegment: js.UndefOr[InitSegmentData] = js.undefined
  
  var text: js.UndefOr[RemuxedUserdata] = js.undefined
  
  var video: js.UndefOr[RemuxedTrack] = js.undefined
}
object RemuxerResult {
  
  inline def apply(): RemuxerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemuxerResult]
  }
  
  extension [Self <: RemuxerResult](x: Self) {
    
    inline def setAudio(value: RemuxedTrack): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setId3(value: RemuxedMetadata): Self = StObject.set(x, "id3", value.asInstanceOf[js.Any])
    
    inline def setId3Undefined: Self = StObject.set(x, "id3", js.undefined)
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setInitSegment(value: InitSegmentData): Self = StObject.set(x, "initSegment", value.asInstanceOf[js.Any])
    
    inline def setInitSegmentUndefined: Self = StObject.set(x, "initSegment", js.undefined)
    
    inline def setText(value: RemuxedUserdata): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVideo(value: RemuxedTrack): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
