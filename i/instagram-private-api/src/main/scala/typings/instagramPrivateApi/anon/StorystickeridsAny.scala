package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorystickeridsAny extends js.Object {
  
  var story_sticker_ids: js.Any = js.native
}
object StorystickeridsAny {
  
  @scala.inline
  def apply(story_sticker_ids: js.Any): StorystickeridsAny = {
    val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorystickeridsAny]
  }
  
  @scala.inline
  implicit class StorystickeridsAnyOps[Self <: StorystickeridsAny] (val x: Self) extends AnyVal {
    
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
    def setStory_sticker_ids(value: js.Any): Self = this.set("story_sticker_ids", value.asInstanceOf[js.Any])
  }
}
