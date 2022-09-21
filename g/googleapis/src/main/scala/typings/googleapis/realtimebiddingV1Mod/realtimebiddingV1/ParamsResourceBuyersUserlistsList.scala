package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersUserlistsList
  extends StObject
     with StandardParameters {
  
  /**
    * The number of results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation page token (as received from a previous response).
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the parent buyer for the user lists to be returned that must follow the pattern `buyers/{buyerAccountId\}`, where `{buyerAccountId\}` represents the account ID of the buyer who owns user lists. For a bidder accessing user lists on behalf of a child seat buyer , `{buyerAccountId\}` should represent the account ID of the child seat buyer.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersUserlistsList {
  
  inline def apply(): ParamsResourceBuyersUserlistsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersUserlistsList]
  }
  
  extension [Self <: ParamsResourceBuyersUserlistsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
