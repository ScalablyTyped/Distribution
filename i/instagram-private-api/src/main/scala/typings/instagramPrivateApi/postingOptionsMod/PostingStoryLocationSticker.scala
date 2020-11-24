package typings.instagramPrivateApi.postingOptionsMod

import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingStoryLocationSticker extends js.Object {
  
  var latitude: String = js.native
  
  var longitude: String = js.native
  
  var sticker: StoryLocation = js.native
}
object PostingStoryLocationSticker {
  
  @scala.inline
  def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], sticker = sticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryLocationSticker]
  }
  
  @scala.inline
  implicit class PostingStoryLocationStickerOps[Self <: PostingStoryLocationSticker] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: String): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticker(value: StoryLocation): Self = this.set("sticker", value.asInstanceOf[js.Any])
  }
}
