package typings.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseSectionsItem extends js.Object {
  var explore_item_info: LocationFeedResponseExploreItemInfo
  var feed_type: String
  var layout_content: LocationFeedResponseLayoutContent
  var layout_type: String
}

object LocationFeedResponseSectionsItem {
  @scala.inline
  def apply(
    explore_item_info: LocationFeedResponseExploreItemInfo,
    feed_type: String,
    layout_content: LocationFeedResponseLayoutContent,
    layout_type: String
  ): LocationFeedResponseSectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationFeedResponseSectionsItem]
  }
}

