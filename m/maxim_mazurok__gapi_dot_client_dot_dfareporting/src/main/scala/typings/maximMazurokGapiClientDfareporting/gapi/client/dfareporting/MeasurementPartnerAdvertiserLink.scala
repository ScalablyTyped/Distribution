package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementPartnerAdvertiserLink extends StObject {
  
  /** . */
  var linkStatus: js.UndefOr[String] = js.undefined
  
  /** Measurement partner used for tag wrapping. */
  var measurementPartner: js.UndefOr[String] = js.undefined
  
  /** . */
  var partnerAdvertiserId: js.UndefOr[String] = js.undefined
}
object MeasurementPartnerAdvertiserLink {
  
  inline def apply(): MeasurementPartnerAdvertiserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementPartnerAdvertiserLink]
  }
  
  extension [Self <: MeasurementPartnerAdvertiserLink](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setPartnerAdvertiserId(value: String): Self = StObject.set(x, "partnerAdvertiserId", value.asInstanceOf[js.Any])
    
    inline def setPartnerAdvertiserIdUndefined: Self = StObject.set(x, "partnerAdvertiserId", js.undefined)
  }
}
