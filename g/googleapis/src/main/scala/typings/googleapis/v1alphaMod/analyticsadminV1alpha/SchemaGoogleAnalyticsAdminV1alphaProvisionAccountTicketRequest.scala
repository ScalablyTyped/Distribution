package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest extends StObject {
  
  /**
    * The account to create.
    */
  var account: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccount] = js.undefined
  
  /**
    * Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in Developers Console as a Redirect URI
    */
  var redirectUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest](x: Self) {
    
    inline def setAccount(value: SchemaGoogleAnalyticsAdminV1alphaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriNull: Self = StObject.set(x, "redirectUri", null)
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
