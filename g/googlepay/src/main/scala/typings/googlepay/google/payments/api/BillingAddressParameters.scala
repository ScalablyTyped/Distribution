package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional billing address parameters for the returned billing address.
  */
@js.native
trait BillingAddressParameters extends js.Object {
  
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
  var format: BillingAddressFormat = js.native
  
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
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.native
}
object BillingAddressParameters {
  
  @scala.inline
  def apply(format: BillingAddressFormat): BillingAddressParameters = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddressParameters]
  }
  
  @scala.inline
  implicit class BillingAddressParametersOps[Self <: BillingAddressParameters] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: BillingAddressFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberRequired(value: `false` | `true`): Self = this.set("phoneNumberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberRequired: Self = this.set("phoneNumberRequired", js.undefined)
  }
}
