package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeLiveBroadcastEvent extends StObject {
  
  /** Input only. The broadcast id, used to control the lifecycle of the event on YouTube */
  var broadcastId: js.UndefOr[String] = js.undefined
  
  /** YouTube channel associated with the broadcast. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Output only. A URL that can be used to watch the meeting broadcast. Will be populated by the backend. */
  var viewUrl: js.UndefOr[String] = js.undefined
}
object YouTubeLiveBroadcastEvent {
  
  inline def apply(): YouTubeLiveBroadcastEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeLiveBroadcastEvent]
  }
  
  extension [Self <: YouTubeLiveBroadcastEvent](x: Self) {
    
    inline def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    inline def setBroadcastIdUndefined: Self = StObject.set(x, "broadcastId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
