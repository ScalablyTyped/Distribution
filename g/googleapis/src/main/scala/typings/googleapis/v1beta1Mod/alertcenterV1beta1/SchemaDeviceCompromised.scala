package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mobile device compromised alert. Derived from audit logs.
  */
trait SchemaDeviceCompromised extends StObject {
  
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaDeviceCompromisedSecurityDetail]] = js.undefined
}
object SchemaDeviceCompromised {
  
  @scala.inline
  def apply(): SchemaDeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromised]
  }
  
  @scala.inline
  implicit class SchemaDeviceCompromisedMutableBuilder[Self <: SchemaDeviceCompromised] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaDeviceCompromisedSecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaDeviceCompromisedSecurityDetail*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
