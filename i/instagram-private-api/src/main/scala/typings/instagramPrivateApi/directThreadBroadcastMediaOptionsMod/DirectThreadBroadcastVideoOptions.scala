package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastVideoOptions extends js.Object {
  
  var sampled: js.UndefOr[Boolean] = js.native
  
  var transcodeDelay: js.UndefOr[Double] = js.native
  
  var uploadId: js.UndefOr[String] = js.native
  
  var video: Buffer = js.native
}
object DirectThreadBroadcastVideoOptions {
  
  @scala.inline
  def apply(video: Buffer): DirectThreadBroadcastVideoOptions = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastVideoOptionsOps[Self <: DirectThreadBroadcastVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setVideo(value: Buffer): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampled(value: Boolean): Self = this.set("sampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampled: Self = this.set("sampled", js.undefined)
    
    @scala.inline
    def setTranscodeDelay(value: Double): Self = this.set("transcodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeDelay: Self = this.set("transcodeDelay", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
  }
}
