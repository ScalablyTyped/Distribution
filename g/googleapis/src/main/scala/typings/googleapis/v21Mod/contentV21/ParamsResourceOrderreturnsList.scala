package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreturnsList
  extends StObject
     with StandardParameters {
  
  /**
    * Obtains order returns that match the acknowledgement status. When set to true, obtains order returns that have been acknowledged. When false, obtains order returns that have not been acknowledged. When not provided, obtains order returns regardless of their acknowledgement status. We recommend using this filter set to `false`, in conjunction with the `acknowledge` call, such that only un-acknowledged order returns are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Obtains order returns created before this date (inclusively), in ISO 8601 format.
    */
  var createdEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains order returns created after this date (inclusively), in ISO 8601 format.
    */
  var createdStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains order returns with the specified order ids. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number.
    */
  var googleOrderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The maximum number of order returns to return in the response, used for paging. The default value is 25 returns per page, and the maximum allowed value is 250 returns per page.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the account that manages the order. This cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Return the results in the specified order.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Obtains order returns that match any shipment state provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment states.
    */
  var shipmentStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Obtains order returns that match any shipment status provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment statuses.
    */
  var shipmentStatus: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Obtains order returns with the specified tracking numbers. If this parameter is provided, createdStartDate, createdEndDate, shipmentType, shipmentStatus, shipmentState and acknowledged parameters must be not set. Note: if googleOrderId and shipmentTrackingNumber parameters are provided, the obtained results will include all order returns that either match the specified order id or the specified tracking number.
    */
  var shipmentTrackingNumbers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Obtains order returns that match any shipment type provided in this parameter. When this parameter is not provided, order returns are obtained regardless of their shipment types.
    */
  var shipmentTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceOrderreturnsList {
  
  inline def apply(): ParamsResourceOrderreturnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreturnsList]
  }
  
  extension [Self <: ParamsResourceOrderreturnsList](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    inline def setCreatedEndDate(value: String): Self = StObject.set(x, "createdEndDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedEndDateUndefined: Self = StObject.set(x, "createdEndDate", js.undefined)
    
    inline def setCreatedStartDate(value: String): Self = StObject.set(x, "createdStartDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedStartDateUndefined: Self = StObject.set(x, "createdStartDate", js.undefined)
    
    inline def setGoogleOrderIds(value: js.Array[String]): Self = StObject.set(x, "googleOrderIds", value.asInstanceOf[js.Any])
    
    inline def setGoogleOrderIdsUndefined: Self = StObject.set(x, "googleOrderIds", js.undefined)
    
    inline def setGoogleOrderIdsVarargs(value: String*): Self = StObject.set(x, "googleOrderIds", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setShipmentStates(value: js.Array[String]): Self = StObject.set(x, "shipmentStates", value.asInstanceOf[js.Any])
    
    inline def setShipmentStatesUndefined: Self = StObject.set(x, "shipmentStates", js.undefined)
    
    inline def setShipmentStatesVarargs(value: String*): Self = StObject.set(x, "shipmentStates", js.Array(value*))
    
    inline def setShipmentStatus(value: js.Array[String]): Self = StObject.set(x, "shipmentStatus", value.asInstanceOf[js.Any])
    
    inline def setShipmentStatusUndefined: Self = StObject.set(x, "shipmentStatus", js.undefined)
    
    inline def setShipmentStatusVarargs(value: String*): Self = StObject.set(x, "shipmentStatus", js.Array(value*))
    
    inline def setShipmentTrackingNumbers(value: js.Array[String]): Self = StObject.set(x, "shipmentTrackingNumbers", value.asInstanceOf[js.Any])
    
    inline def setShipmentTrackingNumbersUndefined: Self = StObject.set(x, "shipmentTrackingNumbers", js.undefined)
    
    inline def setShipmentTrackingNumbersVarargs(value: String*): Self = StObject.set(x, "shipmentTrackingNumbers", js.Array(value*))
    
    inline def setShipmentTypes(value: js.Array[String]): Self = StObject.set(x, "shipmentTypes", value.asInstanceOf[js.Any])
    
    inline def setShipmentTypesUndefined: Self = StObject.set(x, "shipmentTypes", js.undefined)
    
    inline def setShipmentTypesVarargs(value: String*): Self = StObject.set(x, "shipmentTypes", js.Array(value*))
  }
}
