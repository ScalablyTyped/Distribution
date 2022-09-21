package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnShippingLabel extends StObject {
  
  /** Name of the carrier. */
  var carrier: js.UndefOr[String] = js.undefined
  
  /** The URL for the return shipping label in PDF format */
  var labelUri: js.UndefOr[String] = js.undefined
  
  /** The tracking id of this return label. */
  var trackingId: js.UndefOr[String] = js.undefined
}
object ReturnShippingLabel {
  
  inline def apply(): ReturnShippingLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnShippingLabel]
  }
  
  extension [Self <: ReturnShippingLabel](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setLabelUri(value: String): Self = StObject.set(x, "labelUri", value.asInstanceOf[js.Any])
    
    inline def setLabelUriUndefined: Self = StObject.set(x, "labelUri", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
