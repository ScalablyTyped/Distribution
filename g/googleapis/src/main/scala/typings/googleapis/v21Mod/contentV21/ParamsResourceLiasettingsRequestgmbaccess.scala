package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiasettingsRequestgmbaccess
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which Business Profile access is requested.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the Business Profile.
    */
  var gmbEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLiasettingsRequestgmbaccess {
  
  inline def apply(): ParamsResourceLiasettingsRequestgmbaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsRequestgmbaccess]
  }
  
  extension [Self <: ParamsResourceLiasettingsRequestgmbaccess](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    inline def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
