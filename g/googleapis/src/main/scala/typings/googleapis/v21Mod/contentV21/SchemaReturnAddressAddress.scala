package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnAddressAddress extends StObject {
  
  /**
    * CLDR country code (for example, "US").
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * City, town or commune. May also include dependent localities or sublocalities (for example, neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal code or ZIP (for example, "94043").
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the recipient to address returns to.
    */
  var recipientName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC").
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Street-level part of the address. May be up to two lines, each line specified as an array element.
    */
  var streetAddress: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaReturnAddressAddress {
  
  inline def apply(): SchemaReturnAddressAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnAddressAddress]
  }
  
  extension [Self <: SchemaReturnAddressAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameNull: Self = StObject.set(x, "recipientName", null)
    
    inline def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStreetAddress(value: js.Array[String]): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setStreetAddressVarargs(value: String*): Self = StObject.set(x, "streetAddress", js.Array(value*))
  }
}
