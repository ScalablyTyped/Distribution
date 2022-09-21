package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYouTubeBroadcastSessionInfo extends StObject {
  
  /**
    * Current broadcast session's statistics.
    */
  var broadcastStats: js.UndefOr[SchemaYouTubeBroadcastStats] = js.undefined
  
  /**
    * YouTube broadcast session's state information.
    */
  var sessionStateInfo: js.UndefOr[SchemaSessionStateInfo] = js.undefined
  
  /**
    * A unique server-generated ID for the broadcast session.
    */
  var youTubeBroadcastSessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The YouTube Live broadcast event that is being streamed to.
    */
  var youTubeLiveBroadcastEvent: js.UndefOr[SchemaYouTubeLiveBroadcastEvent] = js.undefined
}
object SchemaYouTubeBroadcastSessionInfo {
  
  inline def apply(): SchemaYouTubeBroadcastSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYouTubeBroadcastSessionInfo]
  }
  
  extension [Self <: SchemaYouTubeBroadcastSessionInfo](x: Self) {
    
    inline def setBroadcastStats(value: SchemaYouTubeBroadcastStats): Self = StObject.set(x, "broadcastStats", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStatsUndefined: Self = StObject.set(x, "broadcastStats", js.undefined)
    
    inline def setSessionStateInfo(value: SchemaSessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
    
    inline def setYouTubeBroadcastSessionId(value: String): Self = StObject.set(x, "youTubeBroadcastSessionId", value.asInstanceOf[js.Any])
    
    inline def setYouTubeBroadcastSessionIdNull: Self = StObject.set(x, "youTubeBroadcastSessionId", null)
    
    inline def setYouTubeBroadcastSessionIdUndefined: Self = StObject.set(x, "youTubeBroadcastSessionId", js.undefined)
    
    inline def setYouTubeLiveBroadcastEvent(value: SchemaYouTubeLiveBroadcastEvent): Self = StObject.set(x, "youTubeLiveBroadcastEvent", value.asInstanceOf[js.Any])
    
    inline def setYouTubeLiveBroadcastEventUndefined: Self = StObject.set(x, "youTubeLiveBroadcastEvent", js.undefined)
  }
}
