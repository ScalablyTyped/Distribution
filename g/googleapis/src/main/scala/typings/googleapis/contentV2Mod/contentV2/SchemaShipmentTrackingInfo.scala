package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShipmentTrackingInfo extends StObject {
  
  var carrier: js.UndefOr[String] = js.native
  
  var trackingNumber: js.UndefOr[String] = js.native
}
object SchemaShipmentTrackingInfo {
  
  @scala.inline
  def apply(): SchemaShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentTrackingInfo]
  }
  
  @scala.inline
  implicit class SchemaShipmentTrackingInfoMutableBuilder[Self <: SchemaShipmentTrackingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: String): Self = StObject.set(x, "trackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingNumberUndefined: Self = StObject.set(x, "trackingNumber", js.undefined)
  }
}
