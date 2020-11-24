package typings.instagramPrivateApi.postingVideoOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingVideoOptions extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var coverImage: Buffer = js.native
  
  var location: js.UndefOr[PostingLocation] = js.native
  
  var transcodeDelay: js.UndefOr[Double] = js.native
  
  var usertags: js.UndefOr[PostingUsertags] = js.native
  
  var video: Buffer = js.native
}
object PostingVideoOptions {
  
  @scala.inline
  def apply(coverImage: Buffer, video: Buffer): PostingVideoOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingVideoOptions]
  }
  
  @scala.inline
  implicit class PostingVideoOptionsOps[Self <: PostingVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setLocation(value: PostingLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setTranscodeDelay(value: Double): Self = this.set("transcodeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeDelay: Self = this.set("transcodeDelay", js.undefined)
    
    @scala.inline
    def setUsertags(value: PostingUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
