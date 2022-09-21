package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompromised extends StObject {
  
  /** The email of the user this alert was created for. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Required. The list of security events. */
  var events: js.UndefOr[js.Array[DeviceCompromisedSecurityDetail]] = js.undefined
}
object DeviceCompromised {
  
  inline def apply(): DeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompromised]
  }
  
  extension [Self <: DeviceCompromised](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents(value: js.Array[DeviceCompromisedSecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: DeviceCompromisedSecurityDetail*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
