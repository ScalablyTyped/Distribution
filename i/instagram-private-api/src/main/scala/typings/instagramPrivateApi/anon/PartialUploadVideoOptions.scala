package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/types/upload.video.options.UploadVideoOptions> */
@js.native
trait PartialUploadVideoOptions extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var forAlbum: js.UndefOr[Boolean] = js.native
  
  var forDirectStory: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var isDirect: js.UndefOr[Boolean] = js.native
  
  var isDirectVoice: js.UndefOr[Boolean] = js.native
  
  var isIgtvVideo: js.UndefOr[Boolean] = js.native
  
  var isSidecar: js.UndefOr[Boolean] = js.native
  
  var mediaType: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var uploadId: js.UndefOr[String] = js.native
  
  var uploadName: js.UndefOr[String] = js.native
  
  var video: js.UndefOr[typings.node.Buffer] = js.native
  
  var waterfallId: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialUploadVideoOptions {
  
  @scala.inline
  def apply(): PartialUploadVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUploadVideoOptions]
  }
  
  @scala.inline
  implicit class PartialUploadVideoOptionsOps[Self <: PartialUploadVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setForAlbum(value: Boolean): Self = this.set("forAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForAlbum: Self = this.set("forAlbum", js.undefined)
    
    @scala.inline
    def setForDirectStory(value: Boolean): Self = this.set("forDirectStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForDirectStory: Self = this.set("forDirectStory", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsDirect(value: Boolean): Self = this.set("isDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDirect: Self = this.set("isDirect", js.undefined)
    
    @scala.inline
    def setIsDirectVoice(value: Boolean): Self = this.set("isDirectVoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDirectVoice: Self = this.set("isDirectVoice", js.undefined)
    
    @scala.inline
    def setIsIgtvVideo(value: Boolean): Self = this.set("isIgtvVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIgtvVideo: Self = this.set("isIgtvVideo", js.undefined)
    
    @scala.inline
    def setIsSidecar(value: Boolean): Self = this.set("isSidecar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSidecar: Self = this.set("isSidecar", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
    
    @scala.inline
    def setUploadName(value: String): Self = this.set("uploadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadName: Self = this.set("uploadName", js.undefined)
    
    @scala.inline
    def setVideo(value: typings.node.Buffer): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setWaterfallId(value: String): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfallId: Self = this.set("waterfallId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
