package typings.instagramDashPrivateDashApi.distResponsesIgtvDotChannelDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseRootObject extends js.Object {
  var approx_total_videos: Null
  var cover_photo_url: Null
  var description: Null
  var id: String
  var items: js.Array[IgtvChannelFeedResponseItemsItem]
  var max_id: String
  var more_available: Boolean
  var seen_state: IgtvChannelFeedResponseSeen_state
  var status: String
  var title: String
  var `type`: String
  var user_dict: IgtvChannelFeedResponseUser_dict
}

object IgtvChannelFeedResponseRootObject {
  @scala.inline
  def apply(
    approx_total_videos: Null,
    cover_photo_url: Null,
    description: Null,
    id: String,
    items: js.Array[IgtvChannelFeedResponseItemsItem],
    max_id: String,
    more_available: Boolean,
    seen_state: IgtvChannelFeedResponseSeen_state,
    status: String,
    title: String,
    `type`: String,
    user_dict: IgtvChannelFeedResponseUser_dict
  ): IgtvChannelFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseRootObject]
  }
}

