package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionInfo extends StObject {
  
  /** [Output-only] // [Preview] Id of the session. */
  var sessionId: js.UndefOr[String] = js.undefined
}
object SessionInfo {
  
  inline def apply(): SessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionInfo]
  }
  
  extension [Self <: SessionInfo](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
