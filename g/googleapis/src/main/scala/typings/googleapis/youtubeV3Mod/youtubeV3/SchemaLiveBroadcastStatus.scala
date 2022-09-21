package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveBroadcastStatus extends StObject {
  
  /**
    * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method.
    */
  var lifeCycleStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Priority of the live broadcast event (internal state).
    */
  var liveBroadcastPriority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the broadcast is made for kids or not, decided by YouTube instead of the creator. This field is read only.
    */
  var madeForKids: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
    */
  var privacyStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The broadcast's recording status.
    */
  var recordingStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field will be set to True if the creator declares the broadcast to be kids only: go/live-cw-work.
    */
  var selfDeclaredMadeForKids: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLiveBroadcastStatus {
  
  inline def apply(): SchemaLiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastStatus]
  }
  
  extension [Self <: SchemaLiveBroadcastStatus](x: Self) {
    
    inline def setLifeCycleStatus(value: String): Self = StObject.set(x, "lifeCycleStatus", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusNull: Self = StObject.set(x, "lifeCycleStatus", null)
    
    inline def setLifeCycleStatusUndefined: Self = StObject.set(x, "lifeCycleStatus", js.undefined)
    
    inline def setLiveBroadcastPriority(value: String): Self = StObject.set(x, "liveBroadcastPriority", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastPriorityNull: Self = StObject.set(x, "liveBroadcastPriority", null)
    
    inline def setLiveBroadcastPriorityUndefined: Self = StObject.set(x, "liveBroadcastPriority", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsNull: Self = StObject.set(x, "madeForKids", null)
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusNull: Self = StObject.set(x, "privacyStatus", null)
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusNull: Self = StObject.set(x, "recordingStatus", null)
    
    inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsNull: Self = StObject.set(x, "selfDeclaredMadeForKids", null)
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
  }
}
