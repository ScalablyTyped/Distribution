package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnShippingLabel extends StObject {
  
  /**
    * Name of the carrier.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL for the return shipping label in PDF format
    */
  var labelUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tracking id of this return label.
    */
  var trackingId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnShippingLabel {
  
  inline def apply(): SchemaReturnShippingLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnShippingLabel]
  }
  
  extension [Self <: SchemaReturnShippingLabel](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setLabelUri(value: String): Self = StObject.set(x, "labelUri", value.asInstanceOf[js.Any])
    
    inline def setLabelUriNull: Self = StObject.set(x, "labelUri", null)
    
    inline def setLabelUriUndefined: Self = StObject.set(x, "labelUri", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
