package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductShipping extends StObject {
  
  /**
    * The CLDR territory code of the country to which an item will ship.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location where the shipping is applicable, represented by a location group name.
    */
  var locationGroupName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numeric ID of a location that the shipping rate applies to as defined in the AdWords API.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum handling time (inclusive) between when the order is received and shipped in business days. 0 means that the order is shipped on the same day as it's received if it happens before the cut-off time. Both maxHandlingTime and maxTransitTime are required if providing shipping speeds.
    */
  var maxHandlingTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum transit time (inclusive) between when the order has shipped and when it's delivered in business days. 0 means that the order is delivered on the same day as it ships. Both maxHandlingTime and maxTransitTime are required if providing shipping speeds.
    */
  var maxTransitTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum handling time (inclusive) between when the order is received and shipped in business days. 0 means that the order is shipped on the same day as it's received if it happens before the cut-off time. minHandlingTime can only be present together with maxHandlingTime; but it's not required if maxHandlingTime is present.
    */
  var minHandlingTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum transit time (inclusive) between when the order has shipped and when it's delivered in business days. 0 means that the order is delivered on the same day as it ships. minTransitTime can only be present together with maxTransitTime; but it's not required if maxTransitTime is present.
    */
  var minTransitTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a * wildcard, a range between two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fixed shipping price, represented as a number.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The geographic region to which a shipping rate applies.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A free-form description of the service class or delivery speed.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductShipping {
  
  inline def apply(): SchemaProductShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductShipping]
  }
  
  extension [Self <: SchemaProductShipping](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocationGroupName(value: String): Self = StObject.set(x, "locationGroupName", value.asInstanceOf[js.Any])
    
    inline def setLocationGroupNameNull: Self = StObject.set(x, "locationGroupName", null)
    
    inline def setLocationGroupNameUndefined: Self = StObject.set(x, "locationGroupName", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setMaxHandlingTime(value: String): Self = StObject.set(x, "maxHandlingTime", value.asInstanceOf[js.Any])
    
    inline def setMaxHandlingTimeNull: Self = StObject.set(x, "maxHandlingTime", null)
    
    inline def setMaxHandlingTimeUndefined: Self = StObject.set(x, "maxHandlingTime", js.undefined)
    
    inline def setMaxTransitTime(value: String): Self = StObject.set(x, "maxTransitTime", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeNull: Self = StObject.set(x, "maxTransitTime", null)
    
    inline def setMaxTransitTimeUndefined: Self = StObject.set(x, "maxTransitTime", js.undefined)
    
    inline def setMinHandlingTime(value: String): Self = StObject.set(x, "minHandlingTime", value.asInstanceOf[js.Any])
    
    inline def setMinHandlingTimeNull: Self = StObject.set(x, "minHandlingTime", null)
    
    inline def setMinHandlingTimeUndefined: Self = StObject.set(x, "minHandlingTime", js.undefined)
    
    inline def setMinTransitTime(value: String): Self = StObject.set(x, "minTransitTime", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeNull: Self = StObject.set(x, "minTransitTime", null)
    
    inline def setMinTransitTimeUndefined: Self = StObject.set(x, "minTransitTime", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
