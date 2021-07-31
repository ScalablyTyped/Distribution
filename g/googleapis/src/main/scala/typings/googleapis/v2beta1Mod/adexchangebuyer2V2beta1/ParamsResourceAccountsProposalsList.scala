package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsProposalsList
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * An optional PQL filter query used to query for proposals.  Nested
    * repeated fields, such as proposal.deals.targetingCriterion, cannot be
    * filtered.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Syntax the filter is written in. Current implementation defaults to PQL
    * but in the future it will be LIST_FILTER.
    */
  var filterSyntax: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token as returned from ListProposalsResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsProposalsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsProposalsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProposalsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsProposalsListMutableBuilder[Self <: ParamsResourceAccountsProposalsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSyntax(value: String): Self = StObject.set(x, "filterSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSyntaxUndefined: Self = StObject.set(x, "filterSyntax", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
