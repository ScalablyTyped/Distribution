package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickupServicesPickupService extends StObject {
  
  /** The name of the carrier (e.g., `"UPS"`). Always present. */
  var carrierName: js.UndefOr[String] = js.undefined
  
  /** The CLDR country code of the carrier (e.g., "US"). Always present. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The name of the pickup service (e.g., `"Access point"`). Always present. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object PickupServicesPickupService {
  
  inline def apply(): PickupServicesPickupService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickupServicesPickupService]
  }
  
  extension [Self <: PickupServicesPickupService](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
