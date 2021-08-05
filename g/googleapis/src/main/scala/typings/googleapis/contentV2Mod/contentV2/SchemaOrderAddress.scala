package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderAddress extends StObject {
  
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Strings representing the lines of the printed label for mailing the
    * order, for example: John Smith 1600 Amphitheatre Parkway Mountain View,
    * CA, 94043 United States
    */
  var fullAddress: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the address is a post office box.
    */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * City, town or commune. May also include dependent localities or
    * sublocalities (e.g. neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Postal Code or ZIP (e.g. &quot;94043&quot;).
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the recipient.
    */
  var recipientName: js.UndefOr[String] = js.undefined
  
  /**
    * Top-level administrative subdivision of the country. For example, a state
    * like California (&quot;CA&quot;) or a province like Quebec
    * (&quot;QC&quot;).
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Street-level part of the address.
    */
  var streetAddress: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaOrderAddress {
  
  inline def apply(): SchemaOrderAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderAddress]
  }
  
  extension [Self <: SchemaOrderAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setFullAddress(value: js.Array[String]): Self = StObject.set(x, "fullAddress", value.asInstanceOf[js.Any])
    
    inline def setFullAddressUndefined: Self = StObject.set(x, "fullAddress", js.undefined)
    
    inline def setFullAddressVarargs(value: String*): Self = StObject.set(x, "fullAddress", js.Array(value :_*))
    
    inline def setIsPostOfficeBox(value: Boolean): Self = StObject.set(x, "isPostOfficeBox", value.asInstanceOf[js.Any])
    
    inline def setIsPostOfficeBoxUndefined: Self = StObject.set(x, "isPostOfficeBox", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStreetAddress(value: js.Array[String]): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setStreetAddressVarargs(value: String*): Self = StObject.set(x, "streetAddress", js.Array(value :_*))
  }
}
