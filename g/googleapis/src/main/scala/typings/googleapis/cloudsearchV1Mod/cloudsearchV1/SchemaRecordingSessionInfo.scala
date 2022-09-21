package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecordingSessionInfo extends StObject {
  
  /**
    * Input only. Deprecated field, should not be used.
    */
  var ownerEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique server-generated ID for the recording session.
    */
  var recordingSessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Recording session's state information.
    */
  var sessionStateInfo: js.UndefOr[SchemaSessionStateInfo] = js.undefined
}
object SchemaRecordingSessionInfo {
  
  inline def apply(): SchemaRecordingSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecordingSessionInfo]
  }
  
  extension [Self <: SchemaRecordingSessionInfo](x: Self) {
    
    inline def setOwnerEmail(value: String): Self = StObject.set(x, "ownerEmail", value.asInstanceOf[js.Any])
    
    inline def setOwnerEmailNull: Self = StObject.set(x, "ownerEmail", null)
    
    inline def setOwnerEmailUndefined: Self = StObject.set(x, "ownerEmail", js.undefined)
    
    inline def setRecordingSessionId(value: String): Self = StObject.set(x, "recordingSessionId", value.asInstanceOf[js.Any])
    
    inline def setRecordingSessionIdNull: Self = StObject.set(x, "recordingSessionId", null)
    
    inline def setRecordingSessionIdUndefined: Self = StObject.set(x, "recordingSessionId", js.undefined)
    
    inline def setSessionStateInfo(value: SchemaSessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
  }
}
