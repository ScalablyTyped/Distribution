package typings.instagramPrivateApi.liveHeartbeatViewerCountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveHeartbeatViewerCountResponseRootObject extends js.Object {
  var broadcast_status: String
  var cobroadcaster_ids: js.Array[_]
  var is_top_live_eligible: Double
  var offset_to_video_start: Double
  var status: String
  var total_unique_viewer_count: Double
  var viewer_count: Double
}

object LiveHeartbeatViewerCountResponseRootObject {
  @scala.inline
  def apply(
    broadcast_status: String,
    cobroadcaster_ids: js.Array[_],
    is_top_live_eligible: Double,
    offset_to_video_start: Double,
    status: String,
    total_unique_viewer_count: Double,
    viewer_count: Double
  ): LiveHeartbeatViewerCountResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast_status = broadcast_status.asInstanceOf[js.Any], cobroadcaster_ids = cobroadcaster_ids.asInstanceOf[js.Any], is_top_live_eligible = is_top_live_eligible.asInstanceOf[js.Any], offset_to_video_start = offset_to_video_start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_unique_viewer_count = total_unique_viewer_count.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveHeartbeatViewerCountResponseRootObject]
  }
}

