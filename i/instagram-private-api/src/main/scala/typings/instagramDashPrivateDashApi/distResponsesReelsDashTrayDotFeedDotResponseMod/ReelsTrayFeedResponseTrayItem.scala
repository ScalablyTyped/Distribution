package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseTrayItem extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var expiring_at: Double
  var has_besties_media: Boolean
  var has_pride_media: Boolean
  var hide_from_feed_unit: js.UndefOr[Boolean] = js.undefined
  var id: Double
  var items: js.UndefOr[js.Array[ReelsTrayFeedResponseItemsItem]] = js.undefined
  var latest_reel_media: Double
  var media_count: Double
  var media_ids: js.Array[String]
  var muted: Boolean
  var prefetch_count: Double
  var ranked_position: Double
  var reel_type: String
  var seen: Double
  var seen_ranked_position: Double
  var user: ReelsTrayFeedResponseUser
}

object ReelsTrayFeedResponseTrayItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_besties_media: Boolean,
    has_pride_media: Boolean,
    id: Double,
    latest_reel_media: Double,
    media_count: Double,
    media_ids: js.Array[String],
    muted: Boolean,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Double,
    seen_ranked_position: Double,
    user: ReelsTrayFeedResponseUser,
    hide_from_feed_unit: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ReelsTrayFeedResponseItemsItem] = null
  ): ReelsTrayFeedResponseTrayItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_besties_media = has_besties_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_from_feed_unit)) __obj.updateDynamic("hide_from_feed_unit")(hide_from_feed_unit.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTrayItem]
  }
}

