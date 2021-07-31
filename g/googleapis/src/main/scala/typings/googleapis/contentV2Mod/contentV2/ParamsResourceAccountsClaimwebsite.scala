package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsClaimwebsite
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account whose website is claimed.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as
    * accountId, then this account must be a multi-client account and accountId
    * must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Only available to selected merchants. When set to True, this flag removes
    * any existing claim on the requested website by another account and
    * replaces it with a claim from this account.
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceAccountsClaimwebsite {
  
  @scala.inline
  def apply(): ParamsResourceAccountsClaimwebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClaimwebsite]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsClaimwebsiteMutableBuilder[Self <: ParamsResourceAccountsClaimwebsite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
