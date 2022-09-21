package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemShippingDetails extends StObject {
  
  /**
    * Required. The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Details of the shipping method.
    */
  var method: js.UndefOr[SchemaOrderLineItemShippingDetailsMethod] = js.undefined
  
  /**
    * The promised time in minutes in which the order will be ready for pickup. This only applies to buy-online-pickup-in-store same-day order.
    */
  var pickupPromiseInMinutes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of shipment. Indicates whether `deliveryDetails` or `pickupDetails` is applicable for this shipment. Acceptable values are: - "`delivery`" - "`pickup`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderLineItemShippingDetails {
  
  inline def apply(): SchemaOrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetails]
  }
  
  extension [Self <: SchemaOrderLineItemShippingDetails](x: Self) {
    
    inline def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    inline def setDeliverByDateNull: Self = StObject.set(x, "deliverByDate", null)
    
    inline def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    inline def setMethod(value: SchemaOrderLineItemShippingDetailsMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPickupPromiseInMinutes(value: Double): Self = StObject.set(x, "pickupPromiseInMinutes", value.asInstanceOf[js.Any])
    
    inline def setPickupPromiseInMinutesNull: Self = StObject.set(x, "pickupPromiseInMinutes", null)
    
    inline def setPickupPromiseInMinutesUndefined: Self = StObject.set(x, "pickupPromiseInMinutes", js.undefined)
    
    inline def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    inline def setShipByDateNull: Self = StObject.set(x, "shipByDate", null)
    
    inline def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
