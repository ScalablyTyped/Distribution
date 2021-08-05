package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersUpdateLineItemShippingDetailsRequest extends StObject {
  
  /** Updated delivery by date, in ISO 8601 format. If not specified only ship by date is updated. Provided date should be within 1 year timeframe and can not be a date in the past. */
  var deliverByDate: js.UndefOr[String] = js.undefined
  
  /** The ID of the line item to set metadata. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** The ID of the product to set metadata. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Updated ship by date, in ISO 8601 format. If not specified only deliver by date is updated. Provided date should be within 1 year timeframe and can not be a date in the past. */
  var shipByDate: js.UndefOr[String] = js.undefined
}
object OrdersUpdateLineItemShippingDetailsRequest {
  
  inline def apply(): OrdersUpdateLineItemShippingDetailsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsRequest]
  }
  
  extension [Self <: OrdersUpdateLineItemShippingDetailsRequest](x: Self) {
    
    inline def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    inline def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    inline def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
  }
}
