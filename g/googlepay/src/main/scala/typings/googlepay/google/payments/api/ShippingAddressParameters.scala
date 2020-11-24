package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional shipping address parameters for the returned shipping address.
  */
@js.native
trait ShippingAddressParameters extends js.Object {
  
  /**
    * Allowed country codes for the shipping address.
    *
    * This list should be an array of ISO 3166-1 alpha-2 country codes
    * (e.g., `["US", "CA", "JP"]`).
    *
    * If omitted, a shipping address from any supported country may be
    * returned.
    */
  var allowedCountryCodes: js.Array[String] = js.native
  
  /**
    * Whether a phone number is additionally required from the buyer for
    * the shipping address (the phone number will only be returned if an
    * address is required, otherwise this field has no effect).
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.native
}
object ShippingAddressParameters {
  
  @scala.inline
  def apply(allowedCountryCodes: js.Array[String]): ShippingAddressParameters = {
    val __obj = js.Dynamic.literal(allowedCountryCodes = allowedCountryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddressParameters]
  }
  
  @scala.inline
  implicit class ShippingAddressParametersOps[Self <: ShippingAddressParameters] (val x: Self) extends AnyVal {
    
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
    def setAllowedCountryCodesVarargs(value: String*): Self = this.set("allowedCountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCountryCodes(value: js.Array[String]): Self = this.set("allowedCountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberRequired(value: `false` | `true`): Self = this.set("phoneNumberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberRequired: Self = this.set("phoneNumberRequired", js.undefined)
  }
}
