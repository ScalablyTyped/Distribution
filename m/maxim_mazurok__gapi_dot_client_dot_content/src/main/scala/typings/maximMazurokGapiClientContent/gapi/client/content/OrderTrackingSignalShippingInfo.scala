package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderTrackingSignalShippingInfo extends js.Object {
  
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
  implicit class OrderTrackingSignalShippingInfoOps[Self <: OrderTrackingSignalShippingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActualDeliveryTime(value: DateTime): Self = this.set("actualDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualDeliveryTime: Self = this.set("actualDeliveryTime", js.undefined)
    
    @scala.inline
    def setCarrierName(value: String): Self = this.set("carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierName: Self = this.set("carrierName", js.undefined)
    
    @scala.inline
    def setCarrierServiceName(value: String): Self = this.set("carrierServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierServiceName: Self = this.set("carrierServiceName", js.undefined)
    
    @scala.inline
    def setEarliestDeliveryPromiseTime(value: DateTime): Self = this.set("earliestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarliestDeliveryPromiseTime: Self = this.set("earliestDeliveryPromiseTime", js.undefined)
    
    @scala.inline
    def setLatestDeliveryPromiseTime(value: DateTime): Self = this.set("latestDeliveryPromiseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDeliveryPromiseTime: Self = this.set("latestDeliveryPromiseTime", js.undefined)
    
    @scala.inline
    def setOriginPostalCode(value: String): Self = this.set("originPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginPostalCode: Self = this.set("originPostalCode", js.undefined)
    
    @scala.inline
    def setOriginRegionCode(value: String): Self = this.set("originRegionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginRegionCode: Self = this.set("originRegionCode", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    
    @scala.inline
    def setShippedTime(value: DateTime): Self = this.set("shippedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippedTime: Self = this.set("shippedTime", js.undefined)
    
    @scala.inline
    def setShippingStatus(value: String): Self = this.set("shippingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingStatus: Self = this.set("shippingStatus", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
}
