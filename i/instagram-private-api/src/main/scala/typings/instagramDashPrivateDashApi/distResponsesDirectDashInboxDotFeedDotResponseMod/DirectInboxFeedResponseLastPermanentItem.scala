package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseLastPermanentItem extends js.Object {
  var client_context: js.UndefOr[String] = js.undefined
  var item_id: String
  var item_type: String
  var link: js.UndefOr[DirectInboxFeedResponseLink] = js.undefined
  var placeholder: js.UndefOr[DirectInboxFeedResponsePlaceholder] = js.undefined
  var profile: js.UndefOr[DirectInboxFeedResponseProfile] = js.undefined
  var reel_share: js.UndefOr[DirectInboxFeedResponseReelShare] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var timestamp: String
  var user_id: Double
}

object DirectInboxFeedResponseLastPermanentItem {
  @scala.inline
  def apply(
    item_id: String,
    item_type: String,
    timestamp: String,
    user_id: Double,
    client_context: String = null,
    link: DirectInboxFeedResponseLink = null,
    placeholder: DirectInboxFeedResponsePlaceholder = null,
    profile: DirectInboxFeedResponseProfile = null,
    reel_share: DirectInboxFeedResponseReelShare = null,
    text: String = null
  ): DirectInboxFeedResponseLastPermanentItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    if (client_context != null) __obj.updateDynamic("client_context")(client_context.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (reel_share != null) __obj.updateDynamic("reel_share")(reel_share.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseLastPermanentItem]
  }
}

