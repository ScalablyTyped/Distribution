package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional billing address parameters for the returned billing address.
  */
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
  @scala.inline
  def apply(format: BillingAddressFormat, phoneNumberRequired: `false` | `true` = null): BillingAddressParameters = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (phoneNumberRequired != null) __obj.updateDynamic("phoneNumberRequired")(phoneNumberRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddressParameters]
  }
}

