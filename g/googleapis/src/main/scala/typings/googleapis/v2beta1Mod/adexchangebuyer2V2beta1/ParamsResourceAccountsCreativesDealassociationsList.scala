package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCreativesDealassociationsList
  extends StObject
     with StandardParameters {
  
  /**
    * The account to list the associations from. Specify "-" to list all
    * creatives the current user has access to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The creative ID to list the associations from. Specify "-" to list all
    * creatives under the above account.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Server may return fewer associations than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListDealAssociationsResponse.next_page_token returned from the previous
    * call to 'ListDealAssociations' method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An optional query string to filter deal associations. If no filter is
    * specified, all associations will be returned. Supported queries are: <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i>
    * <li>dealsId=<i>deals_id_string</i> <li>dealsStatus:{approved,
    * conditionally_approved, disapproved,                   not_checked}
    * <li>openAuctionStatus:{approved, conditionally_approved, disapproved,
    * not_checked} </ul> Example: 'dealsId=12345 AND dealsStatus:disapproved'
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCreativesDealassociationsList {
  
  inline def apply(): ParamsResourceAccountsCreativesDealassociationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCreativesDealassociationsList]
  }
  
  extension [Self <: ParamsResourceAccountsCreativesDealassociationsList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
