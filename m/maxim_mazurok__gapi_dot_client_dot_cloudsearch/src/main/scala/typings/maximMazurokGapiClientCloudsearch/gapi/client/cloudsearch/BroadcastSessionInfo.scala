package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastSessionInfo extends StObject {
  
  /** A unique server-generated ID for the broadcast session. */
  var broadcastSessionId: js.UndefOr[String] = js.undefined
  
  /** Output only. Current broadcast session's statistics. */
  var broadcastStats: js.UndefOr[BroadcastStats] = js.undefined
  
  /** Input only. Deprecated field, should not be used. */
  var ingestionId: js.UndefOr[String] = js.undefined
  
  /** Broadcast session's state information. */
  var sessionStateInfo: js.UndefOr[SessionStateInfo] = js.undefined
}
object BroadcastSessionInfo {
  
  inline def apply(): BroadcastSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastSessionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastSessionInfo] (val x: Self) extends AnyVal {
    
    inline def setBroadcastSessionId(value: String): Self = StObject.set(x, "broadcastSessionId", value.asInstanceOf[js.Any])
    
    inline def setBroadcastSessionIdUndefined: Self = StObject.set(x, "broadcastSessionId", js.undefined)
    
    inline def setBroadcastStats(value: BroadcastStats): Self = StObject.set(x, "broadcastStats", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStatsUndefined: Self = StObject.set(x, "broadcastStats", js.undefined)
    
    inline def setIngestionId(value: String): Self = StObject.set(x, "ingestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionIdUndefined: Self = StObject.set(x, "ingestionId", js.undefined)
    
    inline def setSessionStateInfo(value: SessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
  }
}
