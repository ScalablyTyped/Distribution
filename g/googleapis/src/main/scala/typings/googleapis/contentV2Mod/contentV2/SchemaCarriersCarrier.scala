package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCarriersCarrier extends StObject {
  
  /**
    * The CLDR country code of the carrier (e.g., "US"). Always present.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of services supported for EDD (Estimated Delivery Date) calculation. This is the list of valid values for WarehouseBasedDeliveryTime.carrierService.
    */
  var eddServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the carrier (e.g., `"UPS"`). Always present.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of supported services (e.g., `"ground"`) for that carrier. Contains at least one service. This is the list of valid values for CarrierRate.carrierService.
    */
  var services: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCarriersCarrier {
  
  inline def apply(): SchemaCarriersCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarriersCarrier]
  }
  
  extension [Self <: SchemaCarriersCarrier](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setEddServices(value: js.Array[String]): Self = StObject.set(x, "eddServices", value.asInstanceOf[js.Any])
    
    inline def setEddServicesNull: Self = StObject.set(x, "eddServices", null)
    
    inline def setEddServicesUndefined: Self = StObject.set(x, "eddServices", js.undefined)
    
    inline def setEddServicesVarargs(value: String*): Self = StObject.set(x, "eddServices", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
