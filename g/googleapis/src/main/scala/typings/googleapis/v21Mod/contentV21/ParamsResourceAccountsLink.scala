package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsLink
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account that should be linked.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountsLinkRequest] = js.undefined
}
object ParamsResourceAccountsLink {
  
  inline def apply(): ParamsResourceAccountsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsLink]
  }
  
  extension [Self <: ParamsResourceAccountsLink](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaAccountsLinkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
