package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the creative status for which to retrieve a breakdown by
    * detail. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    * Details are only available for statuses 10, 14, 15, 17, 18, 19, 86,
    * and 87.
    */
  var creativeStatusId: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the filter set that should be applied to the requested metrics.
    * For example:  - For a bidder-level filter set for bidder 123:
    * `bidders/123/filterSets/abc`  - For an account-level filter set for the
    * buyer account representing bidder   123:
    * `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter
    * set for the child seat buyer account 456   whose bidder is 123:
    * `bidders/123/accounts/456/filterSets/abc`
    */
  var filterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListCreativeStatusBreakdownByDetailResponse.nextPageToken returned from
    * the previous call to the filteredBids.details.list method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsList {
  
  @scala.inline
  def apply(): ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsList]
  }
  
  @scala.inline
  implicit class ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsListMutableBuilder[Self <: ParamsResourceBiddersAccountsFiltersetsFilteredbidsDetailsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCreativeStatusId(value: Double): Self = StObject.set(x, "creativeStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusIdUndefined: Self = StObject.set(x, "creativeStatusId", js.undefined)
    
    @scala.inline
    def setFilterSetName(value: String): Self = StObject.set(x, "filterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSetNameUndefined: Self = StObject.set(x, "filterSetName", js.undefined)
    
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
