package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrdersList
  extends StObject
     with StandardParameters {
  
  /**
    * Obtains orders that match the acknowledgement status. When set to true,
    * obtains orders that have been acknowledged. When false, obtains orders
    * that have not been acknowledged. We recommend using this filter set to
    * false, in conjunction with the acknowledge call, such that only
    * un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of orders to return in the response, used for paging.
    * The default value is 25 orders per page, and the maximum allowed value is
    * 250 orders per page. Known issue: All List calls will return all Orders
    * without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The ordering of the returned list. The only supported value are
    * placedDate desc and placedDate asc for now, which returns orders sorted
    * by placement date. "placedDate desc" stands for listing orders by
    * placement date, from oldest to most recent. "placedDate asc" stands for
    * listing orders by placement date, from most recent to oldest. In future
    * releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains orders placed before this date (exclusively), in ISO 8601 format.
    */
  var placedDateEnd: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains orders placed after this date (inclusively), in ISO 8601 format.
    */
  var placedDateStart: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains orders that match any of the specified statuses. Multiple values
    * can be specified with comma separation. Additionally, please note that
    * active is a shortcut for pendingShipment and partiallyShipped, and
    * completed is a shortcut for shipped , partiallyDelivered, delivered,
    * partiallyReturned, returned, and canceled.
    */
  var statuses: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceOrdersList {
  
  inline def apply(): ParamsResourceOrdersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersList]
  }
  
  extension [Self <: ParamsResourceOrdersList](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPlacedDateEnd(value: String): Self = StObject.set(x, "placedDateEnd", value.asInstanceOf[js.Any])
    
    inline def setPlacedDateEndUndefined: Self = StObject.set(x, "placedDateEnd", js.undefined)
    
    inline def setPlacedDateStart(value: String): Self = StObject.set(x, "placedDateStart", value.asInstanceOf[js.Any])
    
    inline def setPlacedDateStartUndefined: Self = StObject.set(x, "placedDateStart", js.undefined)
    
    inline def setStatuses(value: js.Array[String]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: String*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
