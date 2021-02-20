package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShipmentTrackingInfo extends StObject {
  
  /**
    * The shipping carrier that handles the package. Acceptable values are: - "`boxtal`" - "`bpost`" - "`chronopost`" - "`colisPrive`" - "`colissimo`" - "`cxt`" - "`deliv`" - "`dhl`" -
    * "`dpd`" - "`dynamex`" - "`eCourier`" - "`easypost`" - "`efw`" - "`fedex`" - "`fedexSmartpost`" - "`geodis`" - "`gls`" - "`googleCourier`" - "`gsx`" - "`jdLogistics`" - "`laPoste`" -
    * "`lasership`" - "`manual`" - "`mpx`" - "`onTrac`" - "`other`" - "`tnt`" - "`uds`" - "`ups`" - "`usps`"
    */
  var carrier: js.UndefOr[String] = js.native
  
  /** The tracking number for the package. */
  var trackingNumber: js.UndefOr[String] = js.native
}
object ShipmentTrackingInfo {
  
  @scala.inline
  def apply(): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
  
  @scala.inline
  implicit class ShipmentTrackingInfoMutableBuilder[Self <: ShipmentTrackingInfo] (val x: Self) extends AnyVal {
    
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
