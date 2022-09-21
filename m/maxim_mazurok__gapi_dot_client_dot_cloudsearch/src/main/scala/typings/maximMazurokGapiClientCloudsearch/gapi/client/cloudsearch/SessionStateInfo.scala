package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStateInfo extends StObject {
  
  /** Output only. The ack info of the session. */
  var ackInfo: js.UndefOr[AckInfo] = js.undefined
  
  /** Immutable. The language configuration used by this session. When empty, captions will be disabled. It's a required field for transcription sessions. */
  var languageConfig: js.UndefOr[LanguageConfig] = js.undefined
  
  /** Output only. The device id of the actor is set if the current state is a result of a user action, is empty otherwise. */
  var lastActorDeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The max end time of the session, at this time the session will be force stopped/terminated. Clients are expected to use this timestamp to warn users about the force
    * stop.
    */
  var maxEndTime: js.UndefOr[String] = js.undefined
  
  /** State of the session. */
  var sessionState: js.UndefOr[String] = js.undefined
  
  /** Output only. The reason the session was transitioned to STOPPED state. */
  var sessionStopReason: js.UndefOr[String] = js.undefined
}
object SessionStateInfo {
  
  inline def apply(): SessionStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionStateInfo]
  }
  
  extension [Self <: SessionStateInfo](x: Self) {
    
    inline def setAckInfo(value: AckInfo): Self = StObject.set(x, "ackInfo", value.asInstanceOf[js.Any])
    
    inline def setAckInfoUndefined: Self = StObject.set(x, "ackInfo", js.undefined)
    
    inline def setLanguageConfig(value: LanguageConfig): Self = StObject.set(x, "languageConfig", value.asInstanceOf[js.Any])
    
    inline def setLanguageConfigUndefined: Self = StObject.set(x, "languageConfig", js.undefined)
    
    inline def setLastActorDeviceId(value: String): Self = StObject.set(x, "lastActorDeviceId", value.asInstanceOf[js.Any])
    
    inline def setLastActorDeviceIdUndefined: Self = StObject.set(x, "lastActorDeviceId", js.undefined)
    
    inline def setMaxEndTime(value: String): Self = StObject.set(x, "maxEndTime", value.asInstanceOf[js.Any])
    
    inline def setMaxEndTimeUndefined: Self = StObject.set(x, "maxEndTime", js.undefined)
    
    inline def setSessionState(value: String): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
    
    inline def setSessionStopReason(value: String): Self = StObject.set(x, "sessionStopReason", value.asInstanceOf[js.Any])
    
    inline def setSessionStopReasonUndefined: Self = StObject.set(x, "sessionStopReason", js.undefined)
  }
}
