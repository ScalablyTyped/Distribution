package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseStoryHashtagsItem extends StObject {
  
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
  implicit class TagFeedResponseStoryHashtagsItemMutableBuilder[Self <: TagFeedResponseStoryHashtagsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashtag(value: TagFeedResponseHashtag): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: String | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
