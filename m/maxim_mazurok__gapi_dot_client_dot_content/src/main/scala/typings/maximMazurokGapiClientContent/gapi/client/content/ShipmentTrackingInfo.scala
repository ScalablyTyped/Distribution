package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShipmentTrackingInfo extends StObject {
  
  /**
    * The shipping carrier that handles the package. Acceptable values are: - "`boxtal`" - "`bpost`" - "`chronopost`" - "`colisPrive`" - "`colissimo`" - "`cxt`" - "`deliv`" - "`dhl`" -
    * "`dpd`" - "`dynamex`" - "`eCourier`" - "`easypost`" - "`efw`" - "`fedex`" - "`fedexSmartpost`" - "`geodis`" - "`gls`" - "`googleCourier`" - "`gsx`" - "`jdLogistics`" - "`laPoste`" -
    * "`lasership`" - "`manual`" - "`mpx`" - "`onTrac`" - "`other`" - "`tnt`" - "`uds`" - "`ups`" - "`usps`"
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /** The tracking number for the package. */
  var trackingNumber: js.UndefOr[String] = js.undefined
}
object ShipmentTrackingInfo {
  
  inline def apply(): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
  
  extension [Self <: ShipmentTrackingInfo](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setTrackingNumber(value: String): Self = StObject.set(x, "trackingNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackingNumberUndefined: Self = StObject.set(x, "trackingNumber", js.undefined)
  }
}
