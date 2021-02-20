package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderTrackingSignalShippingInfo extends StObject {
  
  /**
    * The time when the shipment was actually delivered. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id
    * or carrier_name.
    */
  var actualDeliveryTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the shipping carrier for the delivery. This field is required if one of the following fields is absent: earliest_delivery_promise_time, latest_delivery_promise_time, and
    * actual_delivery_time.
    */
  var carrierName: js.UndefOr[String] = js.native
  
  /** The service type for fulfillment, e.g., GROUND, FIRST_CLASS, etc. */
  var carrierServiceName: js.UndefOr[String] = js.native
  
  /**
    * The earliest delivery promised time. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id or
    * carrier_name.
    */
  var earliestDeliveryPromiseTime: js.UndefOr[DateTime] = js.native
  
  /** The latest delivery promised time. Include the year and timezone string, if available. This field is required, if one of the following fields is absent: tracking_id or carrier_name. */
  var latestDeliveryPromiseTime: js.UndefOr[DateTime] = js.native
  
  /** The origin postal code, as a continuous string without spaces or dashes, e.g. "95016". */
  var originPostalCode: js.UndefOr[String] = js.native
  
  /** The [CLDR territory code] (http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) for the shipping origin. */
  var originRegionCode: js.UndefOr[String] = js.native
  
  /** Required. The shipment ID. */
  var shipmentId: js.UndefOr[String] = js.native
  
  /** The time when the shipment was shipped. Include the year and timezone string, if available. */
  var shippedTime: js.UndefOr[DateTime] = js.native
  
  /** The status of the shipment. */
  var shippingStatus: js.UndefOr[String] = js.native
  
  /**
    * The tracking ID of the shipment. This field is required if one of the following fields is absent: earliest_delivery_promise_time, latest_delivery_promise_time, and
    * actual_delivery_time.
    */
  var trackingId: js.UndefOr[String] = js.native
}
object OrderTrackingSignalShippingInfo {
  
  @scala.inline
  def apply(): OrderTrackingSignalShippingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalShippingInfo]
  }
  
  @scala.inline
  implicit class OrderTrackingSignalShippingInfoMutableBuilder[Self <: OrderTrackingSignalShippingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualDeliveryTime(value: DateTime): Self = StObject.set(x, "actualDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualDeliveryTimeUndefined: Self = StObject.set(x, "actualDeliveryTime", js.undefined)
    
    @scala.inline
    def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    @scala.inline
    def setCarrierServiceName(value: String): Self = StObject.set(x, "carrierServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierServiceNameUndefined: Self = StObject.set(x, "carrierServiceName", js.undefined)
    
    @scala.inline
    def setEarliestDeliveryPromiseTime(value: DateTime): Self = StObject.set(x, "earliestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestDeliveryPromiseTimeUndefined: Self = StObject.set(x, "earliestDeliveryPromiseTime", js.undefined)
    
    @scala.inline
    def setLatestDeliveryPromiseTime(value: DateTime): Self = StObject.set(x, "latestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDeliveryPromiseTimeUndefined: Self = StObject.set(x, "latestDeliveryPromiseTime", js.undefined)
    
    @scala.inline
    def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    @scala.inline
    def setOriginRegionCode(value: String): Self = StObject.set(x, "originRegionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRegionCodeUndefined: Self = StObject.set(x, "originRegionCode", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    @scala.inline
    def setShippedTime(value: DateTime): Self = StObject.set(x, "shippedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippedTimeUndefined: Self = StObject.set(x, "shippedTime", js.undefined)
    
    @scala.inline
    def setShippingStatus(value: String): Self = StObject.set(x, "shippingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingStatusUndefined: Self = StObject.set(x, "shippingStatus", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
