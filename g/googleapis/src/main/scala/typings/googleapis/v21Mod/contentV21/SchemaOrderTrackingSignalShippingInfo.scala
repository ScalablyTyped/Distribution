package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderTrackingSignalShippingInfo extends StObject {
  
  /**
    * The time when the shipment was actually delivered. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id or carrier_name.
    */
  var actualDeliveryTime: js.UndefOr[SchemaDateTime] = js.undefined
  
  /**
    * The name of the shipping carrier for the delivery. This field is required if one of the following fields is absent: earliest_delivery_promise_time, latest_delivery_promise_time, and actual_delivery_time.
    */
  var carrierName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service type for fulfillment, e.g., GROUND, FIRST_CLASS, etc.
    */
  var carrierServiceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The earliest delivery promised time. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id or carrier_name.
    */
  var earliestDeliveryPromiseTime: js.UndefOr[SchemaDateTime] = js.undefined
  
  /**
    * The latest delivery promised time. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id or carrier_name.
    */
  var latestDeliveryPromiseTime: js.UndefOr[SchemaDateTime] = js.undefined
  
  /**
    * The origin postal code, as a continuous string without spaces or dashes, e.g. "95016". This field will be anonymized in returned OrderTrackingSignal creation response.
    */
  var originPostalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [CLDR territory code] (http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) for the shipping origin.
    */
  var originRegionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The shipment ID. This field will be hashed in returned OrderTrackingSignal creation response.
    */
  var shipmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the shipment was shipped. Include the year and timezone string, if available.
    */
  var shippedTime: js.UndefOr[SchemaDateTime] = js.undefined
  
  /**
    * The status of the shipment.
    */
  var shippingStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tracking ID of the shipment. This field is required if one of the following fields is absent: earliest_delivery_promise_time, latest_delivery_promise_time, and actual_delivery_time.
    */
  var trackingId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderTrackingSignalShippingInfo {
  
  inline def apply(): SchemaOrderTrackingSignalShippingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderTrackingSignalShippingInfo]
  }
  
  extension [Self <: SchemaOrderTrackingSignalShippingInfo](x: Self) {
    
    inline def setActualDeliveryTime(value: SchemaDateTime): Self = StObject.set(x, "actualDeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setActualDeliveryTimeUndefined: Self = StObject.set(x, "actualDeliveryTime", js.undefined)
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameNull: Self = StObject.set(x, "carrierName", null)
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setCarrierServiceName(value: String): Self = StObject.set(x, "carrierServiceName", value.asInstanceOf[js.Any])
    
    inline def setCarrierServiceNameNull: Self = StObject.set(x, "carrierServiceName", null)
    
    inline def setCarrierServiceNameUndefined: Self = StObject.set(x, "carrierServiceName", js.undefined)
    
    inline def setEarliestDeliveryPromiseTime(value: SchemaDateTime): Self = StObject.set(x, "earliestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestDeliveryPromiseTimeUndefined: Self = StObject.set(x, "earliestDeliveryPromiseTime", js.undefined)
    
    inline def setLatestDeliveryPromiseTime(value: SchemaDateTime): Self = StObject.set(x, "latestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    inline def setLatestDeliveryPromiseTimeUndefined: Self = StObject.set(x, "latestDeliveryPromiseTime", js.undefined)
    
    inline def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginPostalCodeNull: Self = StObject.set(x, "originPostalCode", null)
    
    inline def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    inline def setOriginRegionCode(value: String): Self = StObject.set(x, "originRegionCode", value.asInstanceOf[js.Any])
    
    inline def setOriginRegionCodeNull: Self = StObject.set(x, "originRegionCode", null)
    
    inline def setOriginRegionCodeUndefined: Self = StObject.set(x, "originRegionCode", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdNull: Self = StObject.set(x, "shipmentId", null)
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setShippedTime(value: SchemaDateTime): Self = StObject.set(x, "shippedTime", value.asInstanceOf[js.Any])
    
    inline def setShippedTimeUndefined: Self = StObject.set(x, "shippedTime", js.undefined)
    
    inline def setShippingStatus(value: String): Self = StObject.set(x, "shippingStatus", value.asInstanceOf[js.Any])
    
    inline def setShippingStatusNull: Self = StObject.set(x, "shippingStatus", null)
    
    inline def setShippingStatusUndefined: Self = StObject.set(x, "shippingStatus", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
