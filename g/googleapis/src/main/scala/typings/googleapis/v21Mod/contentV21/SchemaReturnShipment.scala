package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnShipment extends StObject {
  
  var creationDate: js.UndefOr[String] = js.undefined
  
  var deliveryDate: js.UndefOr[String] = js.undefined
  
  var returnMethodType: js.UndefOr[String] = js.undefined
  
  var shipmentId: js.UndefOr[String] = js.undefined
  
  var shipmentTrackingInfos: js.UndefOr[js.Array[SchemaShipmentTrackingInfo]] = js.undefined
  
  var shippingDate: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object SchemaReturnShipment {
  
  inline def apply(): SchemaReturnShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnShipment]
  }
  
  extension [Self <: SchemaReturnShipment](x: Self) {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    inline def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    inline def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setShipmentTrackingInfos(value: js.Array[SchemaShipmentTrackingInfo]): Self = StObject.set(x, "shipmentTrackingInfos", value.asInstanceOf[js.Any])
    
    inline def setShipmentTrackingInfosUndefined: Self = StObject.set(x, "shipmentTrackingInfos", js.undefined)
    
    inline def setShipmentTrackingInfosVarargs(value: SchemaShipmentTrackingInfo*): Self = StObject.set(x, "shipmentTrackingInfos", js.Array(value :_*))
    
    inline def setShippingDate(value: String): Self = StObject.set(x, "shippingDate", value.asInstanceOf[js.Any])
    
    inline def setShippingDateUndefined: Self = StObject.set(x, "shippingDate", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
