package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderAddress extends StObject {
  
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.native
  
  /** Strings representing the lines of the printed label for mailing the order, for example: John Smith 1600 Amphitheatre Parkway Mountain View, CA, 94043 United States */
  var fullAddress: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.native
  
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[String] = js.native
  
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[String] = js.native
  
  /** Name of the recipient. */
  var recipientName: js.UndefOr[String] = js.native
  
  /** Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC"). */
  var region: js.UndefOr[String] = js.native
  
  /** Street-level part of the address. */
  var streetAddress: js.UndefOr[js.Array[String]] = js.native
}
object TestOrderAddress {
  
  @scala.inline
  def apply(): TestOrderAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderAddress]
  }
  
  @scala.inline
  implicit class TestOrderAddressMutableBuilder[Self <: TestOrderAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setFullAddress(value: js.Array[String]): Self = StObject.set(x, "fullAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullAddressUndefined: Self = StObject.set(x, "fullAddress", js.undefined)
    
    @scala.inline
    def setFullAddressVarargs(value: String*): Self = StObject.set(x, "fullAddress", js.Array(value :_*))
    
    @scala.inline
    def setIsPostOfficeBox(value: Boolean): Self = StObject.set(x, "isPostOfficeBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPostOfficeBoxUndefined: Self = StObject.set(x, "isPostOfficeBox", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: js.Array[String]): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    @scala.inline
    def setStreetAddressVarargs(value: String*): Self = StObject.set(x, "streetAddress", js.Array(value :_*))
  }
}
