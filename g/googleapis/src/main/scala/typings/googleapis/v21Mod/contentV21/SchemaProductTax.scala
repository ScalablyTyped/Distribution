package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductTax extends StObject {
  
  /**
    * The country within which the item is taxed, specified as a CLDR territory
    * code.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The numeric ID of a location that the tax rate applies to as defined in
    * the AdWords API.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP
    * code, a ZIP code prefix using * wildcard, a range between two ZIP codes
    * or two ZIP code prefixes of equal length. Examples: 94114, 94*,
    * 94002-95460, 94*-95*.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The percentage of tax rate that applies to the item price.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /**
    * The geographic region to which the tax rate applies.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Set to true if tax is charged on shipping.
    */
  var taxShip: js.UndefOr[Boolean] = js.native
}
object SchemaProductTax {
  
  @scala.inline
  def apply(): SchemaProductTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductTax]
  }
  
  @scala.inline
  implicit class SchemaProductTaxMutableBuilder[Self <: SchemaProductTax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTaxShip(value: Boolean): Self = StObject.set(x, "taxShip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxShipUndefined: Self = StObject.set(x, "taxShip", js.undefined)
  }
}
