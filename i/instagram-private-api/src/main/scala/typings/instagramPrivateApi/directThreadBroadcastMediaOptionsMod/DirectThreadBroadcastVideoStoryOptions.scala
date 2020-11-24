package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastVideoStoryOptions extends DirectThreadBroadcastStoryOptions {
  
  var coverImage: Buffer = js.native
  
  var video: Buffer = js.native
}
object DirectThreadBroadcastVideoStoryOptions {
  
  @scala.inline
  def apply(coverImage: Buffer, video: Buffer): DirectThreadBroadcastVideoStoryOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoStoryOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastVideoStoryOptionsOps[Self <: DirectThreadBroadcastVideoStoryOptions] (val x: Self) extends AnyVal {
    
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
  }
}
