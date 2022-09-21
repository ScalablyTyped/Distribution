package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderShipment extends StObject {
  
  /**
    * The carrier handling the shipment. For supported carriers, Google includes the carrier name and tracking URL in emails to customers. For select supported carriers, Google also
    * automatically updates the shipment status based on the provided shipment ID. *Note:* You can also use unsupported carriers, but emails to customers won't include the carrier name or
    * tracking URL, and there will be no automatic order status updates. Supported carriers for "US" are: - "`ups`" (United Parcel Service) *automatic status updates* - "`usps`" (United
    * States Postal Service) *automatic status updates* - "`fedex`" (FedEx) *automatic status updates * - "`dhl`" (DHL eCommerce) *automatic status updates* (US only) - "`ontrac`"
    * (OnTrac) *automatic status updates * - "`dhl express`" (DHL Express) - "`deliv`" (Deliv) - "`dynamex`" (TForce) - "`lasership`" (LaserShip) - "`mpx`" (Military Parcel Xpress) -
    * "`uds`" (United Delivery Service) - "`efw`" (Estes Forwarding Worldwide) - "`jd logistics`" (JD Logistics) - "`yunexpress`" (YunExpress) - "`china post`" (China Post) - "`china
    * ems`" (China Post Express Mail Service) - "`singapore post`" (Singapore Post) - "`pos malaysia`" (Pos Malaysia) - "`postnl`" (PostNL) - "`ptt`" (PTT Turkish Post) - "`eub`"
    * (ePacket) - "`chukou1`" (Chukou1 Logistics) - "`bestex`" (Best Express) - "`canada post`" (Canada Post) - "`purolator`" (Purolator) - "`canpar`" (Canpar) - "`india post`" (India
    * Post) - "`blue dart`" (Blue Dart) - "`delhivery`" (Delhivery) - "`dtdc`" (DTDC) - "`tpc india`" (TPC India) - "`lso`" (Lone Star Overnight) - "`tww`" (Team Worldwide) -
    * "`deliver-it`" (Deliver-IT) - "`cdl last mile`" (CDL Last Mile) Supported carriers for FR are: - "`la poste`" (La Poste) *automatic status updates * - "`colissimo`" (Colissimo by La
    * Poste) *automatic status updates* - "`ups`" (United Parcel Service) *automatic status updates * - "`chronopost`" (Chronopost by La Poste) - "`gls`" (General Logistics Systems
    * France) - "`dpd`" (DPD Group by GeoPost) - "`bpost`" (Belgian Post Group) - "`colis prive`" (Colis Privé) - "`boxtal`" (Boxtal) - "`geodis`" (GEODIS) - "`tnt`" (TNT) - "`db
    * schenker`" (DB Schenker) - "`aramex`" (Aramex)
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /** Date on which the shipment has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /** Date on which the shipment has been delivered, in ISO 8601 format. Present only if `status` is `delivered` */
  var deliveryDate: js.UndefOr[String] = js.undefined
  
  /** The ID of the shipment. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The line items that are shipped. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  
  /** Delivery details of the shipment if scheduling is needed. */
  var scheduledDeliveryDetails: js.UndefOr[OrderShipmentScheduledDeliveryDetails] = js.undefined
  
  /** The shipment group ID of the shipment. This is set in shiplineitems request. */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
  
  /** The status of the shipment. Acceptable values are: - "`delivered`" - "`readyForPickup`" - "`shipped`" - "`undeliverable`" */
  var status: js.UndefOr[String] = js.undefined
  
  /** The tracking ID for the shipment. */
  var trackingId: js.UndefOr[String] = js.undefined
}
object OrderShipment {
  
  inline def apply(): OrderShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipment]
  }
  
  extension [Self <: OrderShipment](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setScheduledDeliveryDetails(value: OrderShipmentScheduledDeliveryDetails): Self = StObject.set(x, "scheduledDeliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setScheduledDeliveryDetailsUndefined: Self = StObject.set(x, "scheduledDeliveryDetails", js.undefined)
    
    inline def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    inline def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
