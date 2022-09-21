package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranscriptionSessionInfo extends StObject {
  
  /**
    * Transcription session's state information.
    */
  var sessionStateInfo: js.UndefOr[SchemaSessionStateInfo] = js.undefined
  
  /**
    * A unique server-generated ID for the transcription session.
    */
  var transcriptionSessionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranscriptionSessionInfo {
  
  inline def apply(): SchemaTranscriptionSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranscriptionSessionInfo]
  }
  
  extension [Self <: SchemaTranscriptionSessionInfo](x: Self) {
    
    inline def setSessionStateInfo(value: SchemaSessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
    
    inline def setTranscriptionSessionId(value: String): Self = StObject.set(x, "transcriptionSessionId", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionSessionIdNull: Self = StObject.set(x, "transcriptionSessionId", null)
    
    inline def setTranscriptionSessionIdUndefined: Self = StObject.set(x, "transcriptionSessionId", js.undefined)
  }
}
