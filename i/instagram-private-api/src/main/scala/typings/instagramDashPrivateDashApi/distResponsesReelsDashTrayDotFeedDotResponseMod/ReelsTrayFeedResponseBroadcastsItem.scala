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
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], cobroadcasters = cobroadcasters.asInstanceOf[js.Any], cover_frame_url = cover_frame_url.asInstanceOf[js.Any], dash_abr_playback_url = dash_abr_playback_url.asInstanceOf[js.Any], dash_live_predictive_playback_url = dash_live_predictive_playback_url.asInstanceOf[js.Any], dash_playback_url = dash_playback_url.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal_only = internal_only.asInstanceOf[js.Any], is_gaming_content = is_gaming_content.asInstanceOf[js.Any], is_player_live_trace_enabled = is_player_live_trace_enabled.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], rtmp_playback_url = rtmp_playback_url.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsTrayFeedResponseBroadcastsItem]
  }
}

