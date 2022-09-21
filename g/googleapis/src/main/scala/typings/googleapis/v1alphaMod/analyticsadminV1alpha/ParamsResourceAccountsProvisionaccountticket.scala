package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsProvisionaccountticket
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest] = js.undefined
}
object ParamsResourceAccountsProvisionaccountticket {
  
  inline def apply(): ParamsResourceAccountsProvisionaccountticket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProvisionaccountticket]
  }
  
  extension [Self <: ParamsResourceAccountsProvisionaccountticket](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
