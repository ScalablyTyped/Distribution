package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsClientsList extends StandardParameters {
  
  /**
    * Unique numerical account ID of the sponsor buyer to list the clients for.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Requested page size. The server may return fewer clients than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListClientsResponse.nextPageToken
    * returned from the previous call to the accounts.clients.list method.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Optional unique identifier (from the standpoint of an Ad Exchange sponsor
    * buyer partner) of the client to return. If specified, at most one client
    * will be returned in the response.
    */
  var partnerClientId: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsClientsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsClientsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsClientsListMutableBuilder[Self <: ParamsResourceAccountsClientsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPartnerClientId(value: String): Self = StObject.set(x, "partnerClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerClientIdUndefined: Self = StObject.set(x, "partnerClientId", js.undefined)
  }
}
