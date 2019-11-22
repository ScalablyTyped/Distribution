package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseReel extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var contains_stitched_media_blocked_by_rm: Boolean
  var cover_media: HighlightsRepositoryEditReelResponseCover_media
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
    cover_media: HighlightsRepositoryEditReelResponseCover_media,
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
    val __obj = js.Dynamic.literal(can_reply = can_reply, can_reshare = can_reshare, contains_stitched_media_blocked_by_rm = contains_stitched_media_blocked_by_rm, cover_media = cover_media, created_at = created_at, has_pride_media = has_pride_media, id = id, items = items, latest_reel_media = latest_reel_media, media_count = media_count, prefetch_count = prefetch_count, ranked_position = ranked_position, reel_type = reel_type, seen = seen, seen_ranked_position = seen_ranked_position, title = title, user = user)
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseReel]
  }
}

