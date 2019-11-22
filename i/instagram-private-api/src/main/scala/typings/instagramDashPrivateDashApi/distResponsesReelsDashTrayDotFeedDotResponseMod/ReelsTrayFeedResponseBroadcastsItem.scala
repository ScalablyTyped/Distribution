package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseBroadcastsItem extends js.Object {
  var broadcast_message: String
  var broadcast_owner: ReelsTrayFeedResponseBroadcast_owner
  var broadcast_status: String
  var cobroadcasters: js.Array[_]
  var cover_frame_url: String
  var dash_abr_playback_url: Null
  var dash_live_predictive_playback_url: String
  var dash_playback_url: String
  var hide_from_feed_unit: Boolean
  var id: String
  var internal_only: Boolean
  var is_gaming_content: Boolean
  var is_player_live_trace_enabled: Double
  var media_id: String
  var muted: Boolean
  var organic_tracking_token: String
  var published_time: Double
  var ranked_position: Double
  var rtmp_playback_url: String
  var seen_ranked_position: Double
  var viewer_count: Double
}

object ReelsTrayFeedResponseBroadcastsItem {
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: ReelsTrayFeedResponseBroadcast_owner,
    broadcast_status: String,
    cobroadcasters: js.Array[_],
    cover_frame_url: String,
    dash_abr_playback_url: Null,
    dash_live_predictive_playback_url: String,
    dash_playback_url: String,
    hide_from_feed_unit: Boolean,
    id: String,
    internal_only: Boolean,
    is_gaming_content: Boolean,
    is_player_live_trace_enabled: Double,
    media_id: String,
    muted: Boolean,
    organic_tracking_token: String,
    published_time: Double,
    ranked_position: Double,
    rtmp_playback_url: String,
    seen_ranked_position: Double,
    viewer_count: Double
  ): ReelsTrayFeedResponseBroadcastsItem = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message, broadcast_owner = broadcast_owner, broadcast_status = broadcast_status, cobroadcasters = cobroadcasters, cover_frame_url = cover_frame_url, dash_abr_playback_url = dash_abr_playback_url, dash_live_predictive_playback_url = dash_live_predictive_playback_url, dash_playback_url = dash_playback_url, hide_from_feed_unit = hide_from_feed_unit, id = id, internal_only = internal_only, is_gaming_content = is_gaming_content, is_player_live_trace_enabled = is_player_live_trace_enabled, media_id = media_id, muted = muted, organic_tracking_token = organic_tracking_token, published_time = published_time, ranked_position = ranked_position, rtmp_playback_url = rtmp_playback_url, seen_ranked_position = seen_ranked_position, viewer_count = viewer_count)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseBroadcastsItem]
  }
}

