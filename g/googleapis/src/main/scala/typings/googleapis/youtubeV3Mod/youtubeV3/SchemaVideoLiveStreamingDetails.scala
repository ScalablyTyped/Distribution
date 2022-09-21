package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoLiveStreamingDetails extends StObject {
  
  /**
    * The ID of the currently active live chat attached to this video. This field is filled only if the video is a currently live broadcast that has live chat. Once the broadcast transitions to complete this field will be removed and the live chat closed down. For persistent broadcasts that live chat id will no longer be tied to this video but rather to the new video being displayed at the persistent page.
    */
  var activeLiveChatId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the broadcast actually ended. This value will not be available until the broadcast is over.
    */
  var actualEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the broadcast actually started. This value will not be available until the broadcast begins.
    */
  var actualStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
    */
  var concurrentViewers: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the broadcast is scheduled to end. If the value is empty or the property is not present, then the broadcast is scheduled to contiue indefinitely.
    */
  var scheduledEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the broadcast is scheduled to begin.
    */
  var scheduledStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoLiveStreamingDetails {
  
  inline def apply(): SchemaVideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoLiveStreamingDetails]
  }
  
  extension [Self <: SchemaVideoLiveStreamingDetails](x: Self) {
    
    inline def setActiveLiveChatId(value: String): Self = StObject.set(x, "activeLiveChatId", value.asInstanceOf[js.Any])
    
    inline def setActiveLiveChatIdNull: Self = StObject.set(x, "activeLiveChatId", null)
    
    inline def setActiveLiveChatIdUndefined: Self = StObject.set(x, "activeLiveChatId", js.undefined)
    
    inline def setActualEndTime(value: String): Self = StObject.set(x, "actualEndTime", value.asInstanceOf[js.Any])
    
    inline def setActualEndTimeNull: Self = StObject.set(x, "actualEndTime", null)
    
    inline def setActualEndTimeUndefined: Self = StObject.set(x, "actualEndTime", js.undefined)
    
    inline def setActualStartTime(value: String): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
    
    inline def setActualStartTimeNull: Self = StObject.set(x, "actualStartTime", null)
    
    inline def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
    
    inline def setConcurrentViewers(value: String): Self = StObject.set(x, "concurrentViewers", value.asInstanceOf[js.Any])
    
    inline def setConcurrentViewersNull: Self = StObject.set(x, "concurrentViewers", null)
    
    inline def setConcurrentViewersUndefined: Self = StObject.set(x, "concurrentViewers", js.undefined)
    
    inline def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledEndTimeNull: Self = StObject.set(x, "scheduledEndTime", null)
    
    inline def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
    
    inline def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeNull: Self = StObject.set(x, "scheduledStartTime", null)
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
  }
}
