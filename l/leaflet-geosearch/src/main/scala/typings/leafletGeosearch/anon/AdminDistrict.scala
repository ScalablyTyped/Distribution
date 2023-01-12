package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminDistrict extends StObject {
  
  var adminDistrict: String
  
  var adminDistrict2: String
  
  var countryRegion: String
  
  var formattedAddress: String
  
  var locality: String
}
object AdminDistrict {
  
  inline def apply(
    adminDistrict: String,
    adminDistrict2: String,
    countryRegion: String,
    formattedAddress: String,
    locality: String
  ): AdminDistrict = {
    val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDistrict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminDistrict] (val x: Self) extends AnyVal {
    
    inline def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
    
    inline def setAdminDistrict2(value: String): Self = StObject.set(x, "adminDistrict2", value.asInstanceOf[js.Any])
    
    inline def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
  }
}
