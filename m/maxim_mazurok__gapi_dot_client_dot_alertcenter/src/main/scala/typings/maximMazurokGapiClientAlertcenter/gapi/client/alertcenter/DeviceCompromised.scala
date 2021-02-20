package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceCompromised extends StObject {
  
  /** The email of the user this alert was created for. */
  var email: js.UndefOr[String] = js.native
  
  /** Required. The list of security events. */
  var events: js.UndefOr[js.Array[DeviceCompromisedSecurityDetail]] = js.native
}
object DeviceCompromised {
  
  @scala.inline
  def apply(): DeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompromised]
  }
  
  @scala.inline
  implicit class DeviceCompromisedMutableBuilder[Self <: DeviceCompromised] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[DeviceCompromisedSecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: DeviceCompromisedSecurityDetail*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
