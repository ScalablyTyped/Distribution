package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var audio: js.UndefOr[Double] = js.undefined
  
  var closedCaptions: js.UndefOr[Double] = js.undefined
  
  var subtitles: js.UndefOr[Double] = js.undefined
  
  var video: js.UndefOr[Double] = js.undefined
}
object Audio {
  
  inline def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setAudio(value: Double): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setClosedCaptions(value: Double): Self = StObject.set(x, "closedCaptions", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsUndefined: Self = StObject.set(x, "closedCaptions", js.undefined)
    
    inline def setSubtitles(value: Double): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    inline def setVideo(value: Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
