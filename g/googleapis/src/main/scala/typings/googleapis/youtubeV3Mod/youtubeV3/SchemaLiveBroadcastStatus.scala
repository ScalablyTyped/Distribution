package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveBroadcastStatus extends StObject {
  
  /**
    * The broadcast&#39;s status. The status can be updated using the API&#39;s
    * liveBroadcasts.transition method.
    */
  var lifeCycleStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Priority of the live broadcast event (internal state).
    */
  var liveBroadcastPriority: js.UndefOr[String] = js.undefined
  
  /**
    * The broadcast&#39;s privacy status. Note that the broadcast represents
    * exactly one YouTube video, so the privacy settings are identical to those
    * supported for videos. In addition, you can set this field by modifying
    * the broadcast resource or by setting the privacyStatus field of the
    * corresponding video resource.
    */
  var privacyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The broadcast&#39;s recording status.
    */
  var recordingStatus: js.UndefOr[String] = js.undefined
}
object SchemaLiveBroadcastStatus {
  
  @scala.inline
  def apply(): SchemaLiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastStatus]
  }
  
  @scala.inline
  implicit class SchemaLiveBroadcastStatusMutableBuilder[Self <: SchemaLiveBroadcastStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifeCycleStatus(value: String): Self = StObject.set(x, "lifeCycleStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeCycleStatusUndefined: Self = StObject.set(x, "lifeCycleStatus", js.undefined)
    
    @scala.inline
    def setLiveBroadcastPriority(value: String): Self = StObject.set(x, "liveBroadcastPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveBroadcastPriorityUndefined: Self = StObject.set(x, "liveBroadcastPriority", js.undefined)
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    @scala.inline
    def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
  }
}
