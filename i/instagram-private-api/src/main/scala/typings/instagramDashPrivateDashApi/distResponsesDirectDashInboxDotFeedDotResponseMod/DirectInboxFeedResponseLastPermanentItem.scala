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
    val __obj = js.Dynamic.literal(item_id = item_id, item_type = item_type, timestamp = timestamp, user_id = user_id)
    if (client_context != null) __obj.updateDynamic("client_context")(client_context)
    if (link != null) __obj.updateDynamic("link")(link)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (reel_share != null) __obj.updateDynamic("reel_share")(reel_share)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DirectInboxFeedResponseLastPermanentItem]
  }
}

