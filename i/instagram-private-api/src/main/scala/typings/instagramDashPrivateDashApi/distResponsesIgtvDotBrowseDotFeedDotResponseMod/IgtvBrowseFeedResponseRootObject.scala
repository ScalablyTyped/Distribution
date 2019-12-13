package typings.instagramDashPrivateDashApi.distResponsesIgtvDotBrowseDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseRootObject extends js.Object {
  var badging: IgtvBrowseFeedResponseBadging
  var banner_token: String
  var browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem]
  var channels: js.Array[IgtvBrowseFeedResponseChannelsItem]
  var composer: IgtvBrowseFeedResponseComposer
  var max_id: String
  var more_available: Boolean
  var my_channel: IgtvBrowseFeedResponseMy_channel
  var seen_state: IgtvBrowseFeedResponseSeen_state
  var status: String
}

object IgtvBrowseFeedResponseRootObject {
  @scala.inline
  def apply(
    badging: IgtvBrowseFeedResponseBadging,
    banner_token: String,
    browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem],
    channels: js.Array[IgtvBrowseFeedResponseChannelsItem],
    composer: IgtvBrowseFeedResponseComposer,
    max_id: String,
    more_available: Boolean,
    my_channel: IgtvBrowseFeedResponseMy_channel,
    seen_state: IgtvBrowseFeedResponseSeen_state,
    status: String
  ): IgtvBrowseFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(badging = badging.asInstanceOf[js.Any], banner_token = banner_token.asInstanceOf[js.Any], browse_items = browse_items.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], my_channel = my_channel.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvBrowseFeedResponseRootObject]
  }
}

