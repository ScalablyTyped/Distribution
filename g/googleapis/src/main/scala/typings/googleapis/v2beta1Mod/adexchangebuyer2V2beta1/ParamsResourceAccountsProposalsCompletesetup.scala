package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsProposalsCompletesetup
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the proposal to mark as setup completed.
    */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCompleteSetupRequest] = js.undefined
}
object ParamsResourceAccountsProposalsCompletesetup {
  
  inline def apply(): ParamsResourceAccountsProposalsCompletesetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProposalsCompletesetup]
  }
  
  extension [Self <: ParamsResourceAccountsProposalsCompletesetup](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setRequestBody(value: SchemaCompleteSetupRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
