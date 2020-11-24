package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.anon.Duration
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingAlbumVideoItem extends PostingAlbumItem {
  
  var coverImage: Buffer = js.native
  
  var transcodeDelay: js.UndefOr[Double] = js.native
  
  var video: Buffer = js.native
  
  var videoInfo: js.UndefOr[Duration] = js.native
}
object PostingAlbumVideoItem {
  
  @scala.inline
  def apply(coverImage: Buffer, video: Buffer): PostingAlbumVideoItem = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumVideoItem]
  }
  
  @scala.inline
  implicit class PostingAlbumVideoItemOps[Self <: PostingAlbumVideoItem] (val x: Self) extends AnyVal {
    
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
    def setCoverImage(value: Buffer): Self = this.set("coverImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Buffer): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeDelay(value: Double): Self = this.set("transcodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeDelay: Self = this.set("transcodeDelay", js.undefined)
    
    @scala.inline
    def setVideoInfo(value: Duration): Self = this.set("videoInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoInfo: Self = this.set("videoInfo", js.undefined)
  }
}
