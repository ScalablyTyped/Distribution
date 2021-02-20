package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends StObject {
  
  var audio: js.UndefOr[Double] = js.native
  
  var closedCaptions: js.UndefOr[Double] = js.native
  
  var subtitles: js.UndefOr[Double] = js.native
  
  var video: js.UndefOr[Double] = js.native
}
object Audio {
  
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Double): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setClosedCaptions(value: Double): Self = StObject.set(x, "closedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionsUndefined: Self = StObject.set(x, "closedCaptions", js.undefined)
    
    @scala.inline
    def setSubtitles(value: Double): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    @scala.inline
    def setVideo(value: Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
