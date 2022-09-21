package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional shipping address parameters for the returned shipping address.
  */
trait ShippingAddressParameters extends StObject {
  
  /**
    * Allowed country codes for the shipping address.
    *
    * This list should be an array of ISO 3166-1 alpha-2 country codes
    * (e.g., `["US", "CA", "JP"]`).
    *
    * If omitted, a shipping address from any supported country may be
    * returned.
    */
  var allowedCountryCodes: js.Array[String]
  
  /**
    * Whether a phone number is additionally required from the buyer for
    * the shipping address (the phone number will only be returned if an
    * address is required, otherwise this field has no effect).
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.undefined
}
object ShippingAddressParameters {
  
  inline def apply(allowedCountryCodes: js.Array[String]): ShippingAddressParameters = {
    val __obj = js.Dynamic.literal(allowedCountryCodes = allowedCountryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddressParameters]
  }
  
  extension [Self <: ShippingAddressParameters](x: Self) {
    
    inline def setAllowedCountryCodes(value: js.Array[String]): Self = StObject.set(x, "allowedCountryCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedCountryCodesVarargs(value: String*): Self = StObject.set(x, "allowedCountryCodes", js.Array(value*))
    
    inline def setPhoneNumberRequired(value: `false` | `true`): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
  }
}
