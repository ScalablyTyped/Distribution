package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the postal address of a building in Directory API.
  */
@js.native
trait SchemaBuildingAddress extends js.Object {
  
  /**
    * Unstructured address lines describing the lower levels of an address.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town. In regions of the world where
    * localities are not well defined or do not fit into this structure well,
    * leave locality empty and use addressLines.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * Optional. Postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Required. CLDR region code of the country/region of the address.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. Sublocality of the address.
    */
  var sublocality: js.UndefOr[String] = js.native
}
object SchemaBuildingAddress {
  
  @scala.inline
  def apply(): SchemaBuildingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingAddress]
  }
  
  @scala.inline
  implicit class SchemaBuildingAddressOps[Self <: SchemaBuildingAddress] (val x: Self) extends AnyVal {
    
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
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setSublocality(value: String): Self = this.set("sublocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublocality: Self = this.set("sublocality", js.undefined)
  }
}
