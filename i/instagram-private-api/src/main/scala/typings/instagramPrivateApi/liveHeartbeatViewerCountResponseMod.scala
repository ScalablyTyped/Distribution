package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveHeartbeatViewerCountResponseMod {
  
  trait LiveHeartbeatViewerCountResponseRootObject extends StObject {
    
    var broadcast_status: String
    
    var cobroadcaster_ids: js.Array[js.Any]
    
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
      cobroadcaster_ids: js.Array[js.Any],
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
    implicit class LiveHeartbeatViewerCountResponseRootObjectMutableBuilder[Self <: LiveHeartbeatViewerCountResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCobroadcaster_ids(value: js.Array[js.Any]): Self = StObject.set(x, "cobroadcaster_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCobroadcaster_idsVarargs(value: js.Any*): Self = StObject.set(x, "cobroadcaster_ids", js.Array(value :_*))
      
      @scala.inline
      def setIs_top_live_eligible(value: Double): Self = StObject.set(x, "is_top_live_eligible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset_to_video_start(value: Double): Self = StObject.set(x, "offset_to_video_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_unique_viewer_count(value: Double): Self = StObject.set(x, "total_unique_viewer_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
    }
  }
}
