package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponse extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var expiring_at: Double
  var id: Double
  var items: js.Array[ReelsMediaFeedResponseItem]
  var latest_reel_media: Double
  var media_count: Double
  var prefetch_count: Double
  var reel_type: String
  var seen: Double
  var user: ReelsMediaFeedResponseUser
}

object ReelsMediaFeedResponse {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    id: Double,
    items: js.Array[ReelsMediaFeedResponseItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    user: ReelsMediaFeedResponseUser
  ): ReelsMediaFeedResponse = {
    val __obj = js.Dynamic.literal(can_reply = can_reply, can_reshare = can_reshare, expiring_at = expiring_at, id = id, items = items, latest_reel_media = latest_reel_media, media_count = media_count, prefetch_count = prefetch_count, reel_type = reel_type, seen = seen, user = user)
  
    __obj.asInstanceOf[ReelsMediaFeedResponse]
  }
}

