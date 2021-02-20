package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait City extends StObject {
  
  var city: String = js.native
  
  var country: String = js.native
  
  var countryCode: String = js.native
  
  var county: String = js.native
  
  var district: String = js.native
  
  var house: String = js.native
  
  var postalCode: String = js.native
  
  var stateCode: String = js.native
  
  var street: String = js.native
  
  var text: String = js.native
}
object City {
  
  @scala.inline
  def apply(
    city: String,
    country: String,
    countryCode: String,
    county: String,
    district: String,
    house: String,
    postalCode: String,
    stateCode: String,
    street: String,
    text: String
  ): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], house = house.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateCode = stateCode.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit class CityMutableBuilder[Self <: City] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouse(value: String): Self = StObject.set(x, "house", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateCode(value: String): Self = StObject.set(x, "stateCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
