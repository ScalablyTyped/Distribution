package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYouTubeLiveBroadcastEvent extends StObject {
  
  /**
    * Input only. The broadcast id, used to control the lifecycle of the event on YouTube
    */
  var broadcastId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * YouTube channel associated with the broadcast.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A URL that can be used to watch the meeting broadcast. Will be populated by the backend.
    */
  var viewUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaYouTubeLiveBroadcastEvent {
  
  inline def apply(): SchemaYouTubeLiveBroadcastEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYouTubeLiveBroadcastEvent]
  }
  
  extension [Self <: SchemaYouTubeLiveBroadcastEvent](x: Self) {
    
    inline def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    inline def setBroadcastIdNull: Self = StObject.set(x, "broadcastId", null)
    
    inline def setBroadcastIdUndefined: Self = StObject.set(x, "broadcastId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlNull: Self = StObject.set(x, "viewUrl", null)
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
