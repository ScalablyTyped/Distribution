package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarehouseBasedDeliveryTime extends StObject {
  
  /** Required. Carrier, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be retrieved through the `listSupportedCarriers` method. */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for a carrier can be retrieved through the `listSupportedCarriers` method. The name of
    * the service must be in the eddSupportedServices list.
    */
  var carrierService: js.UndefOr[String] = js.undefined
  
  /** Shipping origin's state. */
  var originAdministrativeArea: js.UndefOr[String] = js.undefined
  
  /** Shipping origin's city. */
  var originCity: js.UndefOr[String] = js.undefined
  
  /** Shipping origin's country represented as a [CLDR territory code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml). */
  var originCountry: js.UndefOr[String] = js.undefined
  
  /** Shipping origin. */
  var originPostalCode: js.UndefOr[String] = js.undefined
  
  /** Shipping origin's street address. */
  var originStreetAddress: js.UndefOr[String] = js.undefined
  
  /** The name of the warehouse. Warehouse name need to be matched with name. If warehouseName is set, the below fields will be ignored. The warehouse info will be read from warehouse. */
  var warehouseName: js.UndefOr[String] = js.undefined
}
object WarehouseBasedDeliveryTime {
  
  inline def apply(): WarehouseBasedDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarehouseBasedDeliveryTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarehouseBasedDeliveryTime] (val x: Self) extends AnyVal {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierService(value: String): Self = StObject.set(x, "carrierService", value.asInstanceOf[js.Any])
    
    inline def setCarrierServiceUndefined: Self = StObject.set(x, "carrierService", js.undefined)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setOriginAdministrativeArea(value: String): Self = StObject.set(x, "originAdministrativeArea", value.asInstanceOf[js.Any])
    
    inline def setOriginAdministrativeAreaUndefined: Self = StObject.set(x, "originAdministrativeArea", js.undefined)
    
    inline def setOriginCity(value: String): Self = StObject.set(x, "originCity", value.asInstanceOf[js.Any])
    
    inline def setOriginCityUndefined: Self = StObject.set(x, "originCity", js.undefined)
    
    inline def setOriginCountry(value: String): Self = StObject.set(x, "originCountry", value.asInstanceOf[js.Any])
    
    inline def setOriginCountryUndefined: Self = StObject.set(x, "originCountry", js.undefined)
    
    inline def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    inline def setOriginStreetAddress(value: String): Self = StObject.set(x, "originStreetAddress", value.asInstanceOf[js.Any])
    
    inline def setOriginStreetAddressUndefined: Self = StObject.set(x, "originStreetAddress", js.undefined)
    
    inline def setWarehouseName(value: String): Self = StObject.set(x, "warehouseName", value.asInstanceOf[js.Any])
    
    inline def setWarehouseNameUndefined: Self = StObject.set(x, "warehouseName", js.undefined)
  }
}
