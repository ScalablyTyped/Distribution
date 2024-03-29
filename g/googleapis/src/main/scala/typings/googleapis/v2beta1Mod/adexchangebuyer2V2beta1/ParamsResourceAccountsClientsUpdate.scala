package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsClientsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to update a client for. (required)
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique numerical account ID of the client to update. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClient] = js.undefined
}
object ParamsResourceAccountsClientsUpdate {
  
  inline def apply(): ParamsResourceAccountsClientsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsUpdate]
  }
  
  extension [Self <: ParamsResourceAccountsClientsUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    inline def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    inline def setRequestBody(value: SchemaClient): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
