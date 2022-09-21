package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWarehouseBasedDeliveryTime extends StObject {
  
  /**
    * Required. Carrier, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be retrieved via the `listSupportedCarriers` method.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for a carrier can be retrieved via the `listSupportedCarriers` method. The name of the service must be in the eddSupportedServices list.
    */
  var carrierService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin's state.
    */
  var originAdministrativeArea: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin's city.
    */
  var originCity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin's country represented as a [CLDR territory code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml).
    */
  var originCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin.
    */
  var originPostalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin's street address
    */
  var originStreetAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the warehouse. Warehouse name need to be matched with name. If warehouseName is set, the below fields will be ignored. The warehouse info will be read from warehouse.
    */
  var warehouseName: js.UndefOr[String | Null] = js.undefined
}
object SchemaWarehouseBasedDeliveryTime {
  
  inline def apply(): SchemaWarehouseBasedDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWarehouseBasedDeliveryTime]
  }
  
  extension [Self <: SchemaWarehouseBasedDeliveryTime](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    inline def setCarrierService(value: String): Self = StObject.set(x, "carrierService", value.asInstanceOf[js.Any])
    
    inline def setCarrierServiceNull: Self = StObject.set(x, "carrierService", null)
    
    inline def setCarrierServiceUndefined: Self = StObject.set(x, "carrierService", js.undefined)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setOriginAdministrativeArea(value: String): Self = StObject.set(x, "originAdministrativeArea", value.asInstanceOf[js.Any])
    
    inline def setOriginAdministrativeAreaNull: Self = StObject.set(x, "originAdministrativeArea", null)
    
    inline def setOriginAdministrativeAreaUndefined: Self = StObject.set(x, "originAdministrativeArea", js.undefined)
    
    inline def setOriginCity(value: String): Self = StObject.set(x, "originCity", value.asInstanceOf[js.Any])
    
    inline def setOriginCityNull: Self = StObject.set(x, "originCity", null)
    
    inline def setOriginCityUndefined: Self = StObject.set(x, "originCity", js.undefined)
    
    inline def setOriginCountry(value: String): Self = StObject.set(x, "originCountry", value.asInstanceOf[js.Any])
    
    inline def setOriginCountryNull: Self = StObject.set(x, "originCountry", null)
    
    inline def setOriginCountryUndefined: Self = StObject.set(x, "originCountry", js.undefined)
    
    inline def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginPostalCodeNull: Self = StObject.set(x, "originPostalCode", null)
    
    inline def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    inline def setOriginStreetAddress(value: String): Self = StObject.set(x, "originStreetAddress", value.asInstanceOf[js.Any])
    
    inline def setOriginStreetAddressNull: Self = StObject.set(x, "originStreetAddress", null)
    
    inline def setOriginStreetAddressUndefined: Self = StObject.set(x, "originStreetAddress", js.undefined)
    
    inline def setWarehouseName(value: String): Self = StObject.set(x, "warehouseName", value.asInstanceOf[js.Any])
    
    inline def setWarehouseNameNull: Self = StObject.set(x, "warehouseName", null)
    
    inline def setWarehouseNameUndefined: Self = StObject.set(x, "warehouseName", js.undefined)
  }
}
