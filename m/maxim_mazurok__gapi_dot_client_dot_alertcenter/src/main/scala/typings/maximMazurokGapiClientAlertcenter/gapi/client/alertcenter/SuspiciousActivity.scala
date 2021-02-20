package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspiciousActivity extends StObject {
  
  /** The email of the user this alert was created for. */
  var email: js.UndefOr[String] = js.native
  
  /** Required. The list of security events. */
  var events: js.UndefOr[js.Array[SuspiciousActivitySecurityDetail]] = js.native
}
object SuspiciousActivity {
  
  @scala.inline
  def apply(): SuspiciousActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspiciousActivity]
  }
  
  @scala.inline
  implicit class SuspiciousActivityMutableBuilder[Self <: SuspiciousActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SuspiciousActivitySecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SuspiciousActivitySecurityDetail*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
