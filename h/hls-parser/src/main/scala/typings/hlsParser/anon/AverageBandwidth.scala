package typings.hlsParser.anon

import typings.hlsParser.hlsParserStrings.AUDIO
import typings.hlsParser.hlsParserStrings.SUBTITLES
import typings.hlsParser.hlsParserStrings.VIDEO
import typings.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typings.hlsParser.mod.types.Rendition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AverageBandwidth extends js.Object {
  
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.native
  
  var averageBandwidth: js.UndefOr[Double] = js.native
  
  var bandwidth: Double = js.native
  
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.native
  
  var codecs: js.UndefOr[String] = js.native
  
  var currentRenditions: js.UndefOr[Audio] = js.native
  
  var frameRate: js.UndefOr[Double] = js.native
  
  var hdcpLevel: js.UndefOr[String] = js.native
  
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  
  var resolution: js.UndefOr[Height] = js.native
  
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.native
  
  var uri: String = js.native
  
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.native
}
object AverageBandwidth {
  
  @scala.inline
  def apply(bandwidth: Double, uri: String): AverageBandwidth = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageBandwidth]
  }
  
  @scala.inline
  implicit class AverageBandwidthOps[Self <: AverageBandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioVarargs(value: Rendition[AUDIO]*): Self = this.set("audio", js.Array(value :_*))
    
    @scala.inline
    def setAudio(value: js.Array[Rendition[AUDIO]]): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setAverageBandwidth(value: Double): Self = this.set("averageBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageBandwidth: Self = this.set("averageBandwidth", js.undefined)
    
    @scala.inline
    def setClosedCaptionsVarargs(value: Rendition[`CLOSED-CAPTIONS`]*): Self = this.set("closedCaptions", js.Array(value :_*))
    
    @scala.inline
    def setClosedCaptions(value: js.Array[Rendition[`CLOSED-CAPTIONS`]]): Self = this.set("closedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosedCaptions: Self = this.set("closedCaptions", js.undefined)
    
    @scala.inline
    def setCodecs(value: String): Self = this.set("codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecs: Self = this.set("codecs", js.undefined)
    
    @scala.inline
    def setCurrentRenditions(value: Audio): Self = this.set("currentRenditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRenditions: Self = this.set("currentRenditions", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setHdcpLevel(value: String): Self = this.set("hdcpLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHdcpLevel: Self = this.set("hdcpLevel", js.undefined)
    
    @scala.inline
    def setIsIFrameOnly(value: Boolean): Self = this.set("isIFrameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIFrameOnly: Self = this.set("isIFrameOnly", js.undefined)
    
    @scala.inline
    def setResolution(value: Height): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setSubtitlesVarargs(value: Rendition[SUBTITLES]*): Self = this.set("subtitles", js.Array(value :_*))
    
    @scala.inline
    def setSubtitles(value: js.Array[Rendition[SUBTITLES]]): Self = this.set("subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitles: Self = this.set("subtitles", js.undefined)
    
    @scala.inline
    def setVideoVarargs(value: Rendition[VIDEO]*): Self = this.set("video", js.Array(value :_*))
    
    @scala.inline
    def setVideo(value: js.Array[Rendition[VIDEO]]): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
