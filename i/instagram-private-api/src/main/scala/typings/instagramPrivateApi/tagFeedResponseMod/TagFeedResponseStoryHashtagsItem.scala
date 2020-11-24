package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseStoryHashtagsItem extends js.Object {
  
  var hashtag: TagFeedResponseHashtag = js.native
  
  var height: String | Double = js.native
  
  var is_hidden: Double = js.native
  
  var is_pinned: Double = js.native
  
  var rotation: String | Double = js.native
  
  var width: String | Double = js.native
  
  var x: String | Double = js.native
  
  var y: String | Double = js.native
  
  var z: Double = js.native
}
object TagFeedResponseStoryHashtagsItem {
  
  @scala.inline
  def apply(
    hashtag: TagFeedResponseHashtag,
    height: String | Double,
    is_hidden: Double,
    is_pinned: Double,
    rotation: String | Double,
    width: String | Double,
    x: String | Double,
    y: String | Double,
    z: Double
  ): TagFeedResponseStoryHashtagsItem = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseStoryHashtagsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseStoryHashtagsItemOps[Self <: TagFeedResponseStoryHashtagsItem] (val x: Self) extends AnyVal {
    
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
    def setHashtag(value: TagFeedResponseHashtag): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = this.set("is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = this.set("is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: String | Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String | Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
