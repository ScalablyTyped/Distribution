package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseTrayItem extends js.Object {
  var can_reply: Boolean
  var can_reshare: Null
  var cover_media: HighlightsRepositoryHighlightsTrayResponseCoverMedia
  var has_pride_media: Boolean
  var id: String
  var latest_reel_media: Double
  var media_count: Double
  var prefetch_count: Double
  var ranked_position: Double
  var reel_type: String
  var seen: Null
  var seen_ranked_position: Double
  var title: String
  var user: HighlightsRepositoryHighlightsTrayResponseUser
}

object HighlightsRepositoryHighlightsTrayResponseTrayItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Null,
    cover_media: HighlightsRepositoryHighlightsTrayResponseCoverMedia,
    has_pride_media: Boolean,
    id: String,
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Null,
    seen_ranked_position: Double,
    title: String,
    user: HighlightsRepositoryHighlightsTrayResponseUser
  ): HighlightsRepositoryHighlightsTrayResponseTrayItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTrayItem]
  }
}

