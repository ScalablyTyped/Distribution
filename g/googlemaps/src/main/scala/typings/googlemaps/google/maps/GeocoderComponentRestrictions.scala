package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderComponentRestrictions extends js.Object {
  
  var administrativeArea: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String | js.Array[String]] = js.native
  
  var locality: js.UndefOr[String] = js.native
  
  var postalCode: js.UndefOr[String] = js.native
  
  var route: js.UndefOr[String] = js.native
}
object GeocoderComponentRestrictions {
  
  @scala.inline
  def apply(): GeocoderComponentRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderComponentRestrictions]
  }
  
  @scala.inline
  implicit class GeocoderComponentRestrictionsOps[Self <: GeocoderComponentRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    
    @scala.inline
    def setCountryVarargs(value: String*): Self = this.set("country", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
}
