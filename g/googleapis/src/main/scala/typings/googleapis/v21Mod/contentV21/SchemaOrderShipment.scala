package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderShipment extends StObject {
  
  /**
    * The carrier handling the shipment.  Acceptable values for US are:   -
    * &quot;gsx&quot;  - &quot;ups&quot;  - &quot;usps&quot;  -
    * &quot;fedex&quot;  - &quot;dhl&quot;  - &quot;ecourier&quot;  -
    * &quot;cxt&quot;  - &quot;google&quot;  - &quot;ontrac&quot;  -
    * &quot;emsy&quot;  - &quot;ont&quot;  - &quot;deliv&quot;  -
    * &quot;dynamex&quot;  - &quot;lasership&quot;  - &quot;mpx&quot;  -
    * &quot;uds&quot;    Acceptable values for FR are:   -
    * &quot;colissimo&quot;  - &quot;chronopost&quot;
    */
  var carrier: js.UndefOr[String] = js.native
  
  /**
    * Date on which the shipment has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format.
    * Present only if status is delivered
    */
  var deliveryDate: js.UndefOr[String] = js.native
  
  /**
    * The ID of the shipment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The line items that are shipped.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderShipmentLineItemShipment]] = js.native
  
  /**
    * The status of the shipment.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}
object SchemaOrderShipment {
  
  @scala.inline
  def apply(): SchemaOrderShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderShipment]
  }
  
  @scala.inline
  implicit class SchemaOrderShipmentMutableBuilder[Self <: SchemaOrderShipment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[SchemaOrderShipmentLineItemShipment]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: SchemaOrderShipmentLineItemShipment*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
