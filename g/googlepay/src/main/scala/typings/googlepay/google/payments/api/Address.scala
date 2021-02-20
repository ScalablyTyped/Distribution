package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a user's address.
  */
@js.native
trait Address extends StObject {
  
  /**
    * The first line of the address.
    *
    * Will be set to empty string if the address does not have a first
    * line.
    *
    * @default ""
    */
  var address1: js.UndefOr[String] = js.native
  
  /**
    * The second line of the address.
    *
    * Will be set to empty string if the address does not have a second
    * line.
    *
    * @default ""
    */
  var address2: js.UndefOr[String] = js.native
  
  /**
    * The third line of the address.
    *
    * Will be set to empty string if the address does not have a third
    * line.
    *
    * @default ""
    */
  var address3: js.UndefOr[String] = js.native
  
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String = js.native
  
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String = js.native
  
  /**
    * The locality (e.g. city or town).
    */
  var locality: String = js.native
  
  /**
    * Name of the recipient at this address.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The phone number.
    *
    * This field will only be present if the caller requested that a phone
    * number be returned.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    */
  var postalCode: String = js.native
  
  /**
    * The sorting code.
    *
    * Note: some regions do not have sorting codes. In those cases
    * this field will be set to an empty string.
    */
  var sortingCode: js.UndefOr[String] = js.native
}
object Address {
  
  @scala.inline
  def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    @scala.inline
    def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    @scala.inline
    def setAddress3(value: String): Self = StObject.set(x, "address3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress3Undefined: Self = StObject.set(x, "address3", js.undefined)
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingCodeUndefined: Self = StObject.set(x, "sortingCode", js.undefined)
  }
}
