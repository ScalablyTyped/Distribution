package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShipmentTrackingInfo extends StObject {
  
  var carrier: js.UndefOr[String] = js.undefined
  
  var trackingNumber: js.UndefOr[String] = js.undefined
}
object SchemaShipmentTrackingInfo {
  
  inline def apply(): SchemaShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentTrackingInfo]
  }
  
  extension [Self <: SchemaShipmentTrackingInfo](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setTrackingNumber(value: String): Self = StObject.set(x, "trackingNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackingNumberUndefined: Self = StObject.set(x, "trackingNumber", js.undefined)
  }
}
