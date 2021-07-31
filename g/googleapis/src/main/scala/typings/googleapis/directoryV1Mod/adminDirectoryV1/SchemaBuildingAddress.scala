package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the postal address of a building in Directory API.
  */
trait SchemaBuildingAddress extends StObject {
  
  /**
    * Unstructured address lines describing the lower levels of an address.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known).
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town. In regions of the world where
    * localities are not well defined or do not fit into this structure well,
    * leave locality empty and use addressLines.
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. CLDR region code of the country/region of the address.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Sublocality of the address.
    */
  var sublocality: js.UndefOr[String] = js.undefined
}
object SchemaBuildingAddress {
  
  @scala.inline
  def apply(): SchemaBuildingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingAddress]
  }
  
  @scala.inline
  implicit class SchemaBuildingAddressMutableBuilder[Self <: SchemaBuildingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setSublocality(value: String): Self = StObject.set(x, "sublocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublocalityUndefined: Self = StObject.set(x, "sublocality", js.undefined)
  }
}
