package typings.instagramPrivateApi.postingIgtvOptionsMod

import typings.instagramPrivateApi.anon.Bottom
import typings.instagramPrivateApi.anon.PartialMediaConfigureToIg
import typings.instagramPrivateApi.anon.PartialUploadVideoOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingIgtvOptions extends js.Object {
  
  var audioMuted: js.UndefOr[Boolean] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var configureOptions: js.UndefOr[PartialMediaConfigureToIg] = js.native
  
  var coverFrame: Buffer = js.native
  
  var feedPreviewCrop: js.UndefOr[Bottom] = js.native
  
  var maxTranscodeTries: js.UndefOr[Double] = js.native
  
  var shareToFeed: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
  
  var transcodeDelay: js.UndefOr[Double] = js.native
  
  var uploadOptions: js.UndefOr[PartialUploadVideoOptions] = js.native
  
  var video: Buffer = js.native
}
object PostingIgtvOptions {
  
  @scala.inline
  def apply(coverFrame: Buffer, title: String, video: Buffer): PostingIgtvOptions = {
    val __obj = js.Dynamic.literal(coverFrame = coverFrame.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingIgtvOptions]
  }
  
  @scala.inline
  implicit class PostingIgtvOptionsOps[Self <: PostingIgtvOptions] (val x: Self) extends AnyVal {
    
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
    def setCoverFrame(value: Buffer): Self = this.set("coverFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Buffer): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioMuted(value: Boolean): Self = this.set("audioMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioMuted: Self = this.set("audioMuted", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setConfigureOptions(value: PartialMediaConfigureToIg): Self = this.set("configureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigureOptions: Self = this.set("configureOptions", js.undefined)
    
    @scala.inline
    def setFeedPreviewCrop(value: Bottom): Self = this.set("feedPreviewCrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedPreviewCrop: Self = this.set("feedPreviewCrop", js.undefined)
    
    @scala.inline
    def setMaxTranscodeTries(value: Double): Self = this.set("maxTranscodeTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTranscodeTries: Self = this.set("maxTranscodeTries", js.undefined)
    
    @scala.inline
    def setShareToFeed(value: Boolean): Self = this.set("shareToFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareToFeed: Self = this.set("shareToFeed", js.undefined)
    
    @scala.inline
    def setTranscodeDelay(value: Double): Self = this.set("transcodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeDelay: Self = this.set("transcodeDelay", js.undefined)
    
    @scala.inline
    def setUploadOptions(value: PartialUploadVideoOptions): Self = this.set("uploadOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadOptions: Self = this.set("uploadOptions", js.undefined)
  }
}
