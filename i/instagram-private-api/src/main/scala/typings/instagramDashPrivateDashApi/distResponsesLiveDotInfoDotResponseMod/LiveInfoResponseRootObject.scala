package typings.instagramDashPrivateDashApi.distResponsesLiveDotInfoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveInfoResponseRootObject extends js.Object {
  var broadcast_message: String
  var broadcast_owner: LiveInfoResponseBroadcast_owner
  var broadcast_status: String
  var cobroadcasters: js.Array[_]
  var dash_abr_playback_url: Null
  var dash_live_predictive_playback_url: String
  var dash_playback_url: String
  var hide_from_feed_unit: Boolean
  var id: String
  var internal_only: Boolean
  var is_gaming_content: Boolean
  var is_player_live_trace_enabled: Double
  var media_id: String
  var organic_tracking_token: String
  var published_time: Double
  var rtmp_playback_url: String
  var status: String
  var viewer_count: Double
}

object LiveInfoResponseRootObject {
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: LiveInfoResponseBroadcast_owner,
    broadcast_status: String,
    cobroadcasters: js.Array[_],
    dash_abr_playback_url: Null,
    dash_live_predictive_playback_url: String,
    dash_playback_url: String,
    hide_from_feed_unit: Boolean,
    id: String,
    internal_only: Boolean,
    is_gaming_content: Boolean,
    is_player_live_trace_enabled: Double,
    media_id: String,
    organic_tracking_token: String,
    published_time: Double,
    rtmp_playback_url: String,
    status: String,
    viewer_count: Double
  ): LiveInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message, broadcast_owner = broadcast_owner, broadcast_status = broadcast_status, cobroadcasters = cobroadcasters, dash_abr_playback_url = dash_abr_playback_url, dash_live_predictive_playback_url = dash_live_predictive_playback_url, dash_playback_url = dash_playback_url, hide_from_feed_unit = hide_from_feed_unit, id = id, internal_only = internal_only, is_gaming_content = is_gaming_content, is_player_live_trace_enabled = is_player_live_trace_enabled, media_id = media_id, organic_tracking_token = organic_tracking_token, published_time = published_time, rtmp_playback_url = rtmp_playback_url, status = status, viewer_count = viewer_count)
  
    __obj.asInstanceOf[LiveInfoResponseRootObject]
  }
}

