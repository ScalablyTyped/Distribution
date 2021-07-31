package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiasettingsSetposdataprovider
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which to retrieve accessible Google My Business
    * accounts.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The country for which the POS data provider is selected.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as
    * accountId, then this account must be a multi-client account and accountId
    * must be the ID of a sub-account of this account.
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
  
  @scala.inline
  def apply(): ParamsResourceLiasettingsSetposdataprovider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsSetposdataprovider]
  }
  
  @scala.inline
  implicit class ParamsResourceLiasettingsSetposdataproviderMutableBuilder[Self <: ParamsResourceLiasettingsSetposdataprovider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    @scala.inline
    def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
