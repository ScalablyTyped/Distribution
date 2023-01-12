package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeBroadcastSessionInfo extends StObject {
  
  /** Current broadcast session's statistics. */
  var broadcastStats: js.UndefOr[YouTubeBroadcastStats] = js.undefined
  
  /** YouTube broadcast session's state information. */
  var sessionStateInfo: js.UndefOr[SessionStateInfo] = js.undefined
  
  /** A unique server-generated ID for the broadcast session. */
  var youTubeBroadcastSessionId: js.UndefOr[String] = js.undefined
  
  /** The YouTube Live broadcast event that is being streamed to. */
  var youTubeLiveBroadcastEvent: js.UndefOr[YouTubeLiveBroadcastEvent] = js.undefined
}
object YouTubeBroadcastSessionInfo {
  
  inline def apply(): YouTubeBroadcastSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeBroadcastSessionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YouTubeBroadcastSessionInfo] (val x: Self) extends AnyVal {
    
    inline def setBroadcastStats(value: YouTubeBroadcastStats): Self = StObject.set(x, "broadcastStats", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStatsUndefined: Self = StObject.set(x, "broadcastStats", js.undefined)
    
    inline def setSessionStateInfo(value: SessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
    
    inline def setYouTubeBroadcastSessionId(value: String): Self = StObject.set(x, "youTubeBroadcastSessionId", value.asInstanceOf[js.Any])
    
    inline def setYouTubeBroadcastSessionIdUndefined: Self = StObject.set(x, "youTubeBroadcastSessionId", js.undefined)
    
    inline def setYouTubeLiveBroadcastEvent(value: YouTubeLiveBroadcastEvent): Self = StObject.set(x, "youTubeLiveBroadcastEvent", value.asInstanceOf[js.Any])
    
    inline def setYouTubeLiveBroadcastEventUndefined: Self = StObject.set(x, "youTubeLiveBroadcastEvent", js.undefined)
  }
}
