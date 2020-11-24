package typings.leafletGeosearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminDistrict extends js.Object {
  
  var adminDistrict: String = js.native
  
  var adminDistrict2: String = js.native
  
  var countryRegion: String = js.native
  
  var formattedAddress: String = js.native
  
  var landmark: String = js.native
  
  var locality: String = js.native
  
  var neighborhood: String = js.native
}
object AdminDistrict {
  
  @scala.inline
  def apply(
    adminDistrict: String,
    adminDistrict2: String,
    countryRegion: String,
    formattedAddress: String,
    landmark: String,
    locality: String,
    neighborhood: String
  ): AdminDistrict = {
    val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], landmark = landmark.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDistrict]
  }
  
  @scala.inline
  implicit class AdminDistrictOps[Self <: AdminDistrict] (val x: Self) extends AnyVal {
    
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
    def setAdminDistrict(value: String): Self = this.set("adminDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminDistrict2(value: String): Self = this.set("adminDistrict2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryRegion(value: String): Self = this.set("countryRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmark(value: String): Self = this.set("landmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborhood(value: String): Self = this.set("neighborhood", value.asInstanceOf[js.Any])
  }
}
