package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersFiltersetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the owner (bidder or account) of the filter sets to be listed. For example: - For a bidder-level filter set for bidder 123: `bidders/123` - For an account-level filter set for the buyer account representing bidder 123: `bidders/123/accounts/123` - For an account-level filter set for the child seat buyer account 456 whose bidder is 123: `bidders/123/accounts/456`
    */
  var ownerName: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of ListFilterSetsResponse.nextPageToken returned from the previous call to the accounts.filterSets.list method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersFiltersetsList {
  
  inline def apply(): ParamsResourceBiddersFiltersetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersFiltersetsList]
  }
  
  extension [Self <: ParamsResourceBiddersFiltersetsList](x: Self) {
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
