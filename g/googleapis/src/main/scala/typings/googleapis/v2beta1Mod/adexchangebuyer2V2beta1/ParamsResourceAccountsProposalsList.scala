package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

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
    * An optional PQL filter query used to query for proposals. Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER.
    */
  var filterSyntax: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token as returned from ListProposalsResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsProposalsList {
  
  inline def apply(): ParamsResourceAccountsProposalsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProposalsList]
  }
  
  extension [Self <: ParamsResourceAccountsProposalsList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterSyntax(value: String): Self = StObject.set(x, "filterSyntax", value.asInstanceOf[js.Any])
    
    inline def setFilterSyntaxUndefined: Self = StObject.set(x, "filterSyntax", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
