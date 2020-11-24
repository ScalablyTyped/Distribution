package typings.instagramPrivateApi.directThreadBroadcastReelOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.photo_
import typings.instagramPrivateApi.instagramPrivateApiStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastReelOptions extends js.Object {
  
  var mediaId: String = js.native
  
  var mediaType: js.UndefOr[photo_ | video_] = js.native
  
  var reelId: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object DirectThreadBroadcastReelOptions {
  
  @scala.inline
  def apply(mediaId: String): DirectThreadBroadcastReelOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastReelOptionsOps[Self <: DirectThreadBroadcastReelOptions] (val x: Self) extends AnyVal {
    
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
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: photo_ | video_): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setReelId(value: String): Self = this.set("reelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReelId: Self = this.set("reelId", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
