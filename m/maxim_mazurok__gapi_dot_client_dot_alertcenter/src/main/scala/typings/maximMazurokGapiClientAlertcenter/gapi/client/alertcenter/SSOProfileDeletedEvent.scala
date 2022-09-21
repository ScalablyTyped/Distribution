package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSOProfileDeletedEvent extends StObject {
  
  /** sso profile name which got deleted */
  var inboundSsoProfileName: js.UndefOr[String] = js.undefined
}
object SSOProfileDeletedEvent {
  
  inline def apply(): SSOProfileDeletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSOProfileDeletedEvent]
  }
  
  extension [Self <: SSOProfileDeletedEvent](x: Self) {
    
    inline def setInboundSsoProfileName(value: String): Self = StObject.set(x, "inboundSsoProfileName", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileNameUndefined: Self = StObject.set(x, "inboundSsoProfileName", js.undefined)
  }
}
