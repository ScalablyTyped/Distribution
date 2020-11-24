package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastVoiceOptions extends js.Object {
  
  var file: Buffer = js.native
  
  var transcodeDelay: js.UndefOr[Double] = js.native
  
  var uploadId: js.UndefOr[String] = js.native
  
  var waveform: js.UndefOr[js.Array[Double]] = js.native
  
  var waveformSamplingFrequencyHz: js.UndefOr[Double] = js.native
}
object DirectThreadBroadcastVoiceOptions {
  
  @scala.inline
  def apply(file: Buffer): DirectThreadBroadcastVoiceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVoiceOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastVoiceOptionsOps[Self <: DirectThreadBroadcastVoiceOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeDelay(value: Double): Self = this.set("transcodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeDelay: Self = this.set("transcodeDelay", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
    
    @scala.inline
    def setWaveformVarargs(value: Double*): Self = this.set("waveform", js.Array(value :_*))
    
    @scala.inline
    def setWaveform(value: js.Array[Double]): Self = this.set("waveform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaveform: Self = this.set("waveform", js.undefined)
    
    @scala.inline
    def setWaveformSamplingFrequencyHz(value: Double): Self = this.set("waveformSamplingFrequencyHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaveformSamplingFrequencyHz: Self = this.set("waveformSamplingFrequencyHz", js.undefined)
  }
}
