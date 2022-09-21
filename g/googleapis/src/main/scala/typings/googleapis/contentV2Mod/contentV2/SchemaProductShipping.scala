package typings.googleapis.contentV2Mod.contentV2

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
