package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mobile suspicious activity alert. Derived from audit logs.
  */
@js.native
trait SchemaSuspiciousActivity extends StObject {
  
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaSuspiciousActivitySecurityDetail]] = js.native
}
object SchemaSuspiciousActivity {
  
  @scala.inline
  def apply(): SchemaSuspiciousActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivity]
  }
  
  @scala.inline
  implicit class SchemaSuspiciousActivityMutableBuilder[Self <: SchemaSuspiciousActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaSuspiciousActivitySecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaSuspiciousActivitySecurityDetail*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
