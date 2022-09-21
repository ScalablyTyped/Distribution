package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersAccountsFiltersetsBidresponseerrorsList
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the filter set that should be applied to the requested metrics. For example: - For a bidder-level filter set for bidder 123: `bidders/123/filterSets/abc` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123/filterSets/abc` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    */
  var filterSetName: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of ListBidResponseErrorsResponse.nextPageToken returned from the previous call to the bidResponseErrors.list method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersAccountsFiltersetsBidresponseerrorsList {
  
  inline def apply(): ParamsResourceBiddersAccountsFiltersetsBidresponseerrorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersAccountsFiltersetsBidresponseerrorsList]
  }
  
  extension [Self <: ParamsResourceBiddersAccountsFiltersetsBidresponseerrorsList](x: Self) {
    
    inline def setFilterSetName(value: String): Self = StObject.set(x, "filterSetName", value.asInstanceOf[js.Any])
    
    inline def setFilterSetNameUndefined: Self = StObject.set(x, "filterSetName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
