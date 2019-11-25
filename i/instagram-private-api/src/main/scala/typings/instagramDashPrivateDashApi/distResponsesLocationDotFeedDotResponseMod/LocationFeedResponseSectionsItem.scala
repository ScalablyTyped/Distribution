package typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseSectionsItem extends js.Object {
  var explore_item_info: LocationFeedResponseExplore_item_info
  var feed_type: String
  var layout_content: LocationFeedResponseLayout_content
  var layout_type: String
}

object LocationFeedResponseSectionsItem {
  @scala.inline
  def apply(
    explore_item_info: LocationFeedResponseExplore_item_info,
    feed_type: String,
    layout_content: LocationFeedResponseLayout_content,
    layout_type: String
  ): LocationFeedResponseSectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationFeedResponseSectionsItem]
  }
}

