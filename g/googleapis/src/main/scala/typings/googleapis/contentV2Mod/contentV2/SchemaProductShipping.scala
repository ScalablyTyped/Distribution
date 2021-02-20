package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductShipping extends StObject {
  
  /**
    * The CLDR territory code of the country to which an item will ship.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The location where the shipping is applicable, represented by a location
    * group name.
    */
  var locationGroupName: js.UndefOr[String] = js.native
  
  /**
    * The numeric ID of a location that the shipping rate applies to as defined
    * in the AdWords API.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The postal code range that the shipping rate applies to, represented by a
    * postal code, a postal code prefix followed by a * wildcard, a range
    * between two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Fixed shipping price, represented as a number.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The geographic region to which a shipping rate applies.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * A free-form description of the service class or delivery speed.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaProductShipping {
  
  @scala.inline
  def apply(): SchemaProductShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductShipping]
  }
  
  @scala.inline
  implicit class SchemaProductShippingMutableBuilder[Self <: SchemaProductShipping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setLocationGroupName(value: String): Self = StObject.set(x, "locationGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationGroupNameUndefined: Self = StObject.set(x, "locationGroupName", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
