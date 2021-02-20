package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReturnShipment extends StObject {
  
  var creationDate: js.UndefOr[String] = js.native
  
  var deliveryDate: js.UndefOr[String] = js.native
  
  var returnMethodType: js.UndefOr[String] = js.native
  
  var shipmentId: js.UndefOr[String] = js.native
  
  var shipmentTrackingInfos: js.UndefOr[js.Array[SchemaShipmentTrackingInfo]] = js.native
  
  var shippingDate: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object SchemaReturnShipment {
  
  @scala.inline
  def apply(): SchemaReturnShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnShipment]
  }
  
  @scala.inline
  implicit class SchemaReturnShipmentMutableBuilder[Self <: SchemaReturnShipment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    @scala.inline
    def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    @scala.inline
    def setShipmentTrackingInfos(value: js.Array[SchemaShipmentTrackingInfo]): Self = StObject.set(x, "shipmentTrackingInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentTrackingInfosUndefined: Self = StObject.set(x, "shipmentTrackingInfos", js.undefined)
    
    @scala.inline
    def setShipmentTrackingInfosVarargs(value: SchemaShipmentTrackingInfo*): Self = StObject.set(x, "shipmentTrackingInfos", js.Array(value :_*))
    
    @scala.inline
    def setShippingDate(value: String): Self = StObject.set(x, "shippingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingDateUndefined: Self = StObject.set(x, "shippingDate", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
