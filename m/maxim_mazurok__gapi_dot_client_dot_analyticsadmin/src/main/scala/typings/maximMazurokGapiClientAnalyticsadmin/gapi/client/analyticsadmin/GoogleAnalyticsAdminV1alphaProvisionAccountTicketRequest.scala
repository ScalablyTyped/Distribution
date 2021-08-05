package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest extends StObject {
  
  /** The account to create. */
  var account: js.UndefOr[GoogleAnalyticsAdminV1alphaAccount] = js.undefined
  
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in Developers Console as a Redirect URI */
  var redirectUri: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest](x: Self) {
    
    inline def setAccount(value: GoogleAnalyticsAdminV1alphaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
