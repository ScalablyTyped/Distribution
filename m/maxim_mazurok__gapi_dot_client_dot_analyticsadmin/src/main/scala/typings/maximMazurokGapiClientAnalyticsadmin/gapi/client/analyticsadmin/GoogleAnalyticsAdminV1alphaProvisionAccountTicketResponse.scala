package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse extends StObject {
  
  /** The param to be passed in the ToS link. */
  var accountTicketId: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse](x: Self) {
    
    inline def setAccountTicketId(value: String): Self = StObject.set(x, "accountTicketId", value.asInstanceOf[js.Any])
    
    inline def setAccountTicketIdUndefined: Self = StObject.set(x, "accountTicketId", js.undefined)
  }
}
