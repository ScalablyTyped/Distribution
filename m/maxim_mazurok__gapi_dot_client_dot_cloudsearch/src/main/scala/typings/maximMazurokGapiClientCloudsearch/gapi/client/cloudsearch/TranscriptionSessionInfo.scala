package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionSessionInfo extends StObject {
  
  /** Transcription session's state information. */
  var sessionStateInfo: js.UndefOr[SessionStateInfo] = js.undefined
  
  /** A unique server-generated ID for the transcription session. */
  var transcriptionSessionId: js.UndefOr[String] = js.undefined
}
object TranscriptionSessionInfo {
  
  inline def apply(): TranscriptionSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionSessionInfo]
  }
  
  extension [Self <: TranscriptionSessionInfo](x: Self) {
    
    inline def setSessionStateInfo(value: SessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
    
    inline def setTranscriptionSessionId(value: String): Self = StObject.set(x, "transcriptionSessionId", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionSessionIdUndefined: Self = StObject.set(x, "transcriptionSessionId", js.undefined)
  }
}
