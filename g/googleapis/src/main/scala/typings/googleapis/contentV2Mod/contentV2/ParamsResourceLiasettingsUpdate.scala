package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiasettingsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which to get or update LIA settings.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLiaSettings] = js.undefined
}
object ParamsResourceLiasettingsUpdate {
  
  inline def apply(): ParamsResourceLiasettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsUpdate]
  }
  
  extension [Self <: ParamsResourceLiasettingsUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaLiaSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
