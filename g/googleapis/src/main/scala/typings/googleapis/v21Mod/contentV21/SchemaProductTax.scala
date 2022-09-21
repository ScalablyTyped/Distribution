package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductTax extends StObject {
  
  /**
    * The country within which the item is taxed, specified as a CLDR territory code.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numeric ID of a location that the tax rate applies to as defined in the AdWords API.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using * wildcard, a range between two ZIP codes or two ZIP code prefixes of equal length. Examples: 94114, 94*, 94002-95460, 94*-95*.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The percentage of tax rate that applies to the item price.
    */
  var rate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The geographic region to which the tax rate applies.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Should be set to true if tax is charged on shipping.
    */
  var taxShip: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaProductTax {
  
  inline def apply(): SchemaProductTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductTax]
  }
  
  extension [Self <: SchemaProductTax](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateNull: Self = StObject.set(x, "rate", null)
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTaxShip(value: Boolean): Self = StObject.set(x, "taxShip", value.asInstanceOf[js.Any])
    
    inline def setTaxShipNull: Self = StObject.set(x, "taxShip", null)
    
    inline def setTaxShipUndefined: Self = StObject.set(x, "taxShip", js.undefined)
  }
}
