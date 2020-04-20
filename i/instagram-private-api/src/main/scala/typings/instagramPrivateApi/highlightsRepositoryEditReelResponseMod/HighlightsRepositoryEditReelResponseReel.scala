package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseReel extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var contains_stitched_media_blocked_by_rm: Boolean
  var cover_media: HighlightsRepositoryEditReelResponseCoverMedia
  var created_at: Double
  var has_pride_media: Boolean
  var id: String
  var items: js.Array[HighlightsRepositoryEditReelResponseItemsItem]
  var latest_reel_media: Double
  var media_count: Double
  var prefetch_count: Double
  var ranked_position: Double
  var reel_type: String
  var seen: Null
  var seen_ranked_position: Double
  var title: String
  var user: HighlightsRepositoryEditReelResponseUser
}

object HighlightsRepositoryEditReelResponseReel {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    contains_stitched_media_blocked_by_rm: Boolean,
    cover_media: HighlightsRepositoryEditReelResponseCoverMedia,
    created_at: Double,
    has_pride_media: Boolean,
    id: String,
    items: js.Array[HighlightsRepositoryEditReelResponseItemsItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Null,
    seen_ranked_position: Double,
    title: String,
    user: HighlightsRepositoryEditReelResponseUser
  ): HighlightsRepositoryEditReelResponseReel = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], contains_stitched_media_blocked_by_rm = contains_stitched_media_blocked_by_rm.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseReel]
  }
}

