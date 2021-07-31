package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersAccountsFiltersetsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether the filter set is transient, or should be persisted indefinitely.
    * By default, filter sets are not transient. If transient, it will be
    * available for at least 1 hour after creation.
    */
  var isTransient: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the owner (bidder or account) of the filter set to be created.
    * For example:  - For a bidder-level filter set for bidder 123:
    * `bidders/123`  - For an account-level filter set for the buyer account
    * representing bidder   123: `bidders/123/accounts/123`  - For an
    * account-level filter set for the child seat buyer account 456   whose
    * bidder is 123: `bidders/123/accounts/456`
    */
  var ownerName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFilterSet] = js.undefined
}
object ParamsResourceBiddersAccountsFiltersetsCreate {
  
  @scala.inline
  def apply(): ParamsResourceBiddersAccountsFiltersetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersAccountsFiltersetsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceBiddersAccountsFiltersetsCreateMutableBuilder[Self <: ParamsResourceBiddersAccountsFiltersetsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFilterSet): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
