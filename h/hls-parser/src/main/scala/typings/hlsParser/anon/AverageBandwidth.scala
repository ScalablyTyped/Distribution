package typings.hlsParser.anon

import typings.hlsParser.hlsParserStrings.AUDIO
import typings.hlsParser.hlsParserStrings.SUBTITLES
import typings.hlsParser.hlsParserStrings.VIDEO
import typings.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typings.hlsParser.mod.types.Rendition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageBandwidth extends StObject {
  
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.undefined
  
  var averageBandwidth: js.UndefOr[Double] = js.undefined
  
  var bandwidth: Double
  
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.undefined
  
  var codecs: js.UndefOr[String] = js.undefined
  
  var currentRenditions: js.UndefOr[Audio] = js.undefined
  
  var frameRate: js.UndefOr[Double] = js.undefined
  
  var hdcpLevel: js.UndefOr[String] = js.undefined
  
  var isIFrameOnly: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[Height] = js.undefined
  
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.undefined
  
  var uri: String
  
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.undefined
}
object AverageBandwidth {
  
  inline def apply(bandwidth: Double, uri: String): AverageBandwidth = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageBandwidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AverageBandwidth] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: js.Array[Rendition[AUDIO]]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAudioVarargs(value: Rendition[AUDIO]*): Self = StObject.set(x, "audio", js.Array(value*))
    
    inline def setAverageBandwidth(value: Double): Self = StObject.set(x, "averageBandwidth", value.asInstanceOf[js.Any])
    
    inline def setAverageBandwidthUndefined: Self = StObject.set(x, "averageBandwidth", js.undefined)
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptions(value: js.Array[Rendition[`CLOSED-CAPTIONS`]]): Self = StObject.set(x, "closedCaptions", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsUndefined: Self = StObject.set(x, "closedCaptions", js.undefined)
    
    inline def setClosedCaptionsVarargs(value: Rendition[`CLOSED-CAPTIONS`]*): Self = StObject.set(x, "closedCaptions", js.Array(value*))
    
    inline def setCodecs(value: String): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setCodecsUndefined: Self = StObject.set(x, "codecs", js.undefined)
    
    inline def setCurrentRenditions(value: Audio): Self = StObject.set(x, "currentRenditions", value.asInstanceOf[js.Any])
    
    inline def setCurrentRenditionsUndefined: Self = StObject.set(x, "currentRenditions", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setHdcpLevel(value: String): Self = StObject.set(x, "hdcpLevel", value.asInstanceOf[js.Any])
    
    inline def setHdcpLevelUndefined: Self = StObject.set(x, "hdcpLevel", js.undefined)
    
    inline def setIsIFrameOnly(value: Boolean): Self = StObject.set(x, "isIFrameOnly", value.asInstanceOf[js.Any])
    
    inline def setIsIFrameOnlyUndefined: Self = StObject.set(x, "isIFrameOnly", js.undefined)
    
    inline def setResolution(value: Height): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSubtitles(value: js.Array[Rendition[SUBTITLES]]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "subtitles", js.undefined)
    
    inline def setSubtitlesVarargs(value: Rendition[SUBTITLES]*): Self = StObject.set(x, "subtitles", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: js.Array[Rendition[VIDEO]]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVideoVarargs(value: Rendition[VIDEO]*): Self = StObject.set(x, "video", js.Array(value*))
  }
}
