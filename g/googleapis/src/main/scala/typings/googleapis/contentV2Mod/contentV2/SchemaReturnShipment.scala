package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnShipment extends StObject {
  
  /**
    * The date of creation of the shipment, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date of delivery of the shipment, in ISO 8601 format.
    */
  var deliveryDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the return method. Acceptable values are: - "`byMail`" - "`contactCustomerSupport`" - "`returnless`"
    */
  var returnMethodType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipment ID generated by Google.
    */
  var shipmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tracking information of the shipment. One return shipment might be handled by several shipping carriers sequentially.
    */
  var shipmentTrackingInfos: js.UndefOr[js.Array[SchemaShipmentTrackingInfo]] = js.undefined
  
  /**
    * The date of shipping of the shipment, in ISO 8601 format.
    */
  var shippingDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the shipment. Acceptable values are: - "`completed`" - "`new`" - "`shipped`" - "`undeliverable`" - "`pending`"
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnShipment {
  
  inline def apply(): SchemaReturnShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnShipment]
  }
  
  extension [Self <: SchemaReturnShipment](x: Self) {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDateNull: Self = StObject.set(x, "deliveryDate", null)
    
    inline def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    inline def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    inline def setReturnMethodTypeNull: Self = StObject.set(x, "returnMethodType", null)
    
    inline def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdNull: Self = StObject.set(x, "shipmentId", null)
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setShipmentTrackingInfos(value: js.Array[SchemaShipmentTrackingInfo]): Self = StObject.set(x, "shipmentTrackingInfos", value.asInstanceOf[js.Any])
    
    inline def setShipmentTrackingInfosUndefined: Self = StObject.set(x, "shipmentTrackingInfos", js.undefined)
    
    inline def setShipmentTrackingInfosVarargs(value: SchemaShipmentTrackingInfo*): Self = StObject.set(x, "shipmentTrackingInfos", js.Array(value*))
    
    inline def setShippingDate(value: String): Self = StObject.set(x, "shippingDate", value.asInstanceOf[js.Any])
    
    inline def setShippingDateNull: Self = StObject.set(x, "shippingDate", null)
    
    inline def setShippingDateUndefined: Self = StObject.set(x, "shippingDate", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
