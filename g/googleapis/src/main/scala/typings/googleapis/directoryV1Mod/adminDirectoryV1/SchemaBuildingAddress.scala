package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildingAddress extends StObject {
  
  /**
    * Unstructured address lines describing the lower levels of an address.
    */
  var addressLines: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Highest administrative subdivision which is used for postal addresses of a country or region.
    */
  var administrativeArea: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. BCP-47 language code of the contents of this address (if known).
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use addressLines.
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Postal code of the address.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. CLDR region code of the country/region of the address.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Sublocality of the address.
    */
  var sublocality: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildingAddress {
  
  inline def apply(): SchemaBuildingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingAddress]
  }
  
  extension [Self <: SchemaBuildingAddress](x: Self) {
    
    inline def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    inline def setAddressLinesNull: Self = StObject.set(x, "addressLines", null)
    
    inline def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    inline def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value*))
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaNull: Self = StObject.set(x, "administrativeArea", null)
    
    inline def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setSublocality(value: String): Self = StObject.set(x, "sublocality", value.asInstanceOf[js.Any])
    
    inline def setSublocalityNull: Self = StObject.set(x, "sublocality", null)
    
    inline def setSublocalityUndefined: Self = StObject.set(x, "sublocality", js.undefined)
  }
}
