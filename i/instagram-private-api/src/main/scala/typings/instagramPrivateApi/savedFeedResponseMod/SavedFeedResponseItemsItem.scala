package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseItemsItem extends StObject {
  
  var media: SavedFeedResponseMedia = js.native
}
object SavedFeedResponseItemsItem {
  
  @scala.inline
  def apply(media: SavedFeedResponseMedia): SavedFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseItemsItem]
  }
  
  @scala.inline
  implicit class SavedFeedResponseItemsItemMutableBuilder[Self <: SavedFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: SavedFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
