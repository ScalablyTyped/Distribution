package typings.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseItemsItem extends js.Object {
  var media: SavedFeedResponseMedia
}

object SavedFeedResponseItemsItem {
  @scala.inline
  def apply(media: SavedFeedResponseMedia): SavedFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SavedFeedResponseItemsItem]
  }
}

