package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeasurementPartnerAdvertiserLink extends StObject {
  
  /**
    * .
    */
  var linkStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Measurement partner used for tag wrapping.
    */
  var measurementPartner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * .
    */
  var partnerAdvertiserId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMeasurementPartnerAdvertiserLink {
  
  inline def apply(): SchemaMeasurementPartnerAdvertiserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeasurementPartnerAdvertiserLink]
  }
  
  extension [Self <: SchemaMeasurementPartnerAdvertiserLink](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusNull: Self = StObject.set(x, "linkStatus", null)
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerNull: Self = StObject.set(x, "measurementPartner", null)
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setPartnerAdvertiserId(value: String): Self = StObject.set(x, "partnerAdvertiserId", value.asInstanceOf[js.Any])
    
    inline def setPartnerAdvertiserIdNull: Self = StObject.set(x, "partnerAdvertiserId", null)
    
    inline def setPartnerAdvertiserIdUndefined: Self = StObject.set(x, "partnerAdvertiserId", js.undefined)
  }
}
