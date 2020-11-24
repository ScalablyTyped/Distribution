package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryHashtag extends StorySticker {
  
  var is_sticker: Boolean = js.native
  
  var tag_name: String = js.native
  
  var use_custom_title: Boolean = js.native
}
object StoryHashtag {
  
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    rotation: Double,
    tag_name: String,
    use_custom_title: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): StoryHashtag = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], use_custom_title = use_custom_title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryHashtag]
  }
  
  @scala.inline
  implicit class StoryHashtagOps[Self <: StoryHashtag] (val x: Self) extends AnyVal {
    
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
    def setIs_sticker(value: Boolean): Self = this.set("is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_name(value: String): Self = this.set("tag_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_custom_title(value: Boolean): Self = this.set("use_custom_title", value.asInstanceOf[js.Any])
  }
}
