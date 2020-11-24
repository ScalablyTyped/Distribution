package typings.instagramPrivateApi.liveHeartbeatViewerCountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveHeartbeatViewerCountResponseRootObject extends js.Object {
  
  var broadcast_status: String = js.native
  
  var cobroadcaster_ids: js.Array[_] = js.native
  
  var is_top_live_eligible: Double = js.native
  
  var offset_to_video_start: Double = js.native
  
  var status: String = js.native
  
  var total_unique_viewer_count: Double = js.native
  
  var viewer_count: Double = js.native
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
  
  @scala.inline
  implicit class LiveHeartbeatViewerCountResponseRootObjectOps[Self <: LiveHeartbeatViewerCountResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBroadcast_status(value: String): Self = this.set("broadcast_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCobroadcaster_idsVarargs(value: js.Any*): Self = this.set("cobroadcaster_ids", js.Array(value :_*))
    
    @scala.inline
    def setCobroadcaster_ids(value: js.Array[_]): Self = this.set("cobroadcaster_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_top_live_eligible(value: Double): Self = this.set("is_top_live_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset_to_video_start(value: Double): Self = this.set("offset_to_video_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_unique_viewer_count(value: Double): Self = this.set("total_unique_viewer_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_count(value: Double): Self = this.set("viewer_count", value.asInstanceOf[js.Any])
  }
}
