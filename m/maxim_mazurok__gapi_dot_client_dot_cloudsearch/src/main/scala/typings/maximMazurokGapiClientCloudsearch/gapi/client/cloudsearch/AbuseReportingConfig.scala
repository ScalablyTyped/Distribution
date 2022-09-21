package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbuseReportingConfig extends StObject {
  
  /** Whether the current call may include video recordings in its abuse reports. */
  var recordingAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current call may include user generated content (chat, polls, Q&A...) in its abuse reports. */
  var writtenUgcAllowed: js.UndefOr[Boolean] = js.undefined
}
object AbuseReportingConfig {
  
  inline def apply(): AbuseReportingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbuseReportingConfig]
  }
  
  extension [Self <: AbuseReportingConfig](x: Self) {
    
    inline def setRecordingAllowed(value: Boolean): Self = StObject.set(x, "recordingAllowed", value.asInstanceOf[js.Any])
    
    inline def setRecordingAllowedUndefined: Self = StObject.set(x, "recordingAllowed", js.undefined)
    
    inline def setWrittenUgcAllowed(value: Boolean): Self = StObject.set(x, "writtenUgcAllowed", value.asInstanceOf[js.Any])
    
    inline def setWrittenUgcAllowedUndefined: Self = StObject.set(x, "writtenUgcAllowed", js.undefined)
  }
}
