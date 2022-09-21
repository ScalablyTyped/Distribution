package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPickupServicesPickupService extends StObject {
  
  /**
    * The name of the carrier (e.g., `"UPS"`). Always present.
    */
  var carrierName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CLDR country code of the carrier (e.g., "US"). Always present.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the pickup service (e.g., `"Access point"`). Always present.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPickupServicesPickupService {
  
  inline def apply(): SchemaPickupServicesPickupService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPickupServicesPickupService]
  }
  
  extension [Self <: SchemaPickupServicesPickupService](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameNull: Self = StObject.set(x, "carrierName", null)
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
