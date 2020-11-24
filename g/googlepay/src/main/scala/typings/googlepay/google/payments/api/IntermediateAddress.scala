package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Limited information about user address for developer callbacks.
  */
@js.native
trait IntermediateAddress extends js.Object {
  
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
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    *
    * Also note: The returned postal code may vary based on the user's
    * geographic region. For Canada and United Kingdom, this contains only
    * the first three characters. For US, the this contain the first five
    * digits.
    */
  var postalCode: String = js.native
}
object IntermediateAddress {
  
  @scala.inline
  def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): IntermediateAddress = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateAddress]
  }
  
  @scala.inline
  implicit class IntermediateAddressOps[Self <: IntermediateAddress] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
  }
}
