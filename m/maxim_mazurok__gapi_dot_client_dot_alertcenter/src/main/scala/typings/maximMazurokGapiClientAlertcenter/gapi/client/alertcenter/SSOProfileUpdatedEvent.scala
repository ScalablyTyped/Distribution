package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSOProfileUpdatedEvent extends StObject {
  
  /** changes made to sso profile */
  var inboundSsoProfileChanges: js.UndefOr[String] = js.undefined
  
  /** sso profile name which got updated */
  var inboundSsoProfileName: js.UndefOr[String] = js.undefined
}
object SSOProfileUpdatedEvent {
  
  inline def apply(): SSOProfileUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSOProfileUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSOProfileUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setInboundSsoProfileChanges(value: String): Self = StObject.set(x, "inboundSsoProfileChanges", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileChangesUndefined: Self = StObject.set(x, "inboundSsoProfileChanges", js.undefined)
    
    inline def setInboundSsoProfileName(value: String): Self = StObject.set(x, "inboundSsoProfileName", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileNameUndefined: Self = StObject.set(x, "inboundSsoProfileName", js.undefined)
  }
}
