package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingSessionInfo extends StObject {
  
  /** Input only. Deprecated field, should not be used. */
  var ownerEmail: js.UndefOr[String] = js.undefined
  
  /** A unique server-generated ID for the recording session. */
  var recordingSessionId: js.UndefOr[String] = js.undefined
  
  /** Recording session's state information. */
  var sessionStateInfo: js.UndefOr[SessionStateInfo] = js.undefined
}
object RecordingSessionInfo {
  
  inline def apply(): RecordingSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingSessionInfo]
  }
  
  extension [Self <: RecordingSessionInfo](x: Self) {
    
    inline def setOwnerEmail(value: String): Self = StObject.set(x, "ownerEmail", value.asInstanceOf[js.Any])
    
    inline def setOwnerEmailUndefined: Self = StObject.set(x, "ownerEmail", js.undefined)
    
    inline def setRecordingSessionId(value: String): Self = StObject.set(x, "recordingSessionId", value.asInstanceOf[js.Any])
    
    inline def setRecordingSessionIdUndefined: Self = StObject.set(x, "recordingSessionId", js.undefined)
    
    inline def setSessionStateInfo(value: SessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
  }
}
