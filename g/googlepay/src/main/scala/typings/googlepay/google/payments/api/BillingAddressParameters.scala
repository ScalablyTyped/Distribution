package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional billing address parameters for the returned billing address.
  */
trait BillingAddressParameters extends StObject {
  
  /**
    * Billing address format.
    *
    * If omitted, defaults to [[BillingAddressFormat|`MIN`]].
    *
    * Note: you should only set format to [[BillingAddressFormat|`FULL`]]
    * when it is required to process the order. Additional form entry or
    * customer data requests can increase friction during the checkout
    * process and can lead to a lower conversion rate.
    */
  var format: BillingAddressFormat
  
  /**
    * Whether billing phone number required.
    *
    * If omitted, defaults to `false`.
    *
    * Note: you should only set this to `true` when a phone number
    * is required to process the order. Additional form entry or customer
    * data requests can increase friction during the checkout process and
    * can lead to a lower conversion rate.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.undefined
}
object BillingAddressParameters {
  
  inline def apply(format: BillingAddressFormat): BillingAddressParameters = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddressParameters]
  }
  
  extension [Self <: BillingAddressParameters](x: Self) {
    
    inline def setFormat(value: BillingAddressFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberRequired(value: `false` | `true`): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
  }
}
