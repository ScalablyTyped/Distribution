package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderComponentRestrictions extends StObject {
  
  var administrativeArea: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var locality: js.UndefOr[String] = js.undefined
  
  var postalCode: js.UndefOr[String] = js.undefined
  
  var route: js.UndefOr[String] = js.undefined
}
object GeocoderComponentRestrictions {
  
  @scala.inline
  def apply(): GeocoderComponentRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderComponentRestrictions]
  }
  
  @scala.inline
  implicit class GeocoderComponentRestrictionsMutableBuilder[Self <: GeocoderComponentRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value :_*))
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
