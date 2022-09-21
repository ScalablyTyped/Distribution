package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCreativesList
  extends StObject
     with StandardParameters {
  
  /**
    * When specified, only creatives for the given account ids are returned.
    */
  var accountId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * When specified, only creatives for the given buyer creative ids are returned.
    */
  var buyerCreativeId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * When specified, only creatives having the given status are returned.
    */
  var statusFilter: js.UndefOr[String] = js.undefined
}
object ParamsResourceCreativesList {
  
  inline def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  
  extension [Self <: ParamsResourceCreativesList](x: Self) {
    
    inline def setAccountId(value: js.Array[Double]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountIdVarargs(value: Double*): Self = StObject.set(x, "accountId", js.Array(value*))
    
    inline def setBuyerCreativeId(value: js.Array[String]): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    inline def setBuyerCreativeIdVarargs(value: String*): Self = StObject.set(x, "buyerCreativeId", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStatusFilter(value: String): Self = StObject.set(x, "statusFilter", value.asInstanceOf[js.Any])
    
    inline def setStatusFilterUndefined: Self = StObject.set(x, "statusFilter", js.undefined)
  }
}
