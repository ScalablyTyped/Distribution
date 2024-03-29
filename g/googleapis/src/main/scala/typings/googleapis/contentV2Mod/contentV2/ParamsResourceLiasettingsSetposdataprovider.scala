package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiasettingsSetposdataprovider
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which to retrieve accessible Google My Business accounts.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The country for which the POS data provider is selected.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of POS data provider.
    */
  var posDataProviderId: js.UndefOr[String] = js.undefined
  
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLiasettingsSetposdataprovider {
  
  inline def apply(): ParamsResourceLiasettingsSetposdataprovider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsSetposdataprovider]
  }
  
  extension [Self <: ParamsResourceLiasettingsSetposdataprovider](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    inline def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    inline def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
