package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspiciousActivity extends StObject {
  
  /** The email of the user this alert was created for. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Required. The list of security events. */
  var events: js.UndefOr[js.Array[SuspiciousActivitySecurityDetail]] = js.undefined
}
object SuspiciousActivity {
  
  inline def apply(): SuspiciousActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspiciousActivity]
  }
  
  extension [Self <: SuspiciousActivity](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents(value: js.Array[SuspiciousActivitySecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SuspiciousActivitySecurityDetail*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
