package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalData extends StObject {
  
  var AdditionalData: js.Array[Key]
  
  var City: String
  
  var Country: String
  
  var County: String
  
  var District: String
  
  var HouseNumber: String
  
  var Label: String
  
  var PostalCode: String
  
  var State: String
  
  var Street: String
}
object AdditionalData {
  
  inline def apply(
    AdditionalData: js.Array[Key],
    City: String,
    Country: String,
    County: String,
    District: String,
    HouseNumber: String,
    Label: String,
    PostalCode: String,
    State: String,
    Street: String
  ): AdditionalData = {
    val __obj = js.Dynamic.literal(AdditionalData = AdditionalData.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], County = County.asInstanceOf[js.Any], District = District.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalData]
  }
  
  extension [Self <: AdditionalData](x: Self) {
    
    inline def setAdditionalData(value: js.Array[Key]): Self = StObject.set(x, "AdditionalData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDataVarargs(value: Key*): Self = StObject.set(x, "AdditionalData", js.Array(value :_*))
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCounty(value: String): Self = StObject.set(x, "County", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "District", value.asInstanceOf[js.Any])
    
    inline def setHouseNumber(value: String): Self = StObject.set(x, "HouseNumber", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
  }
}
