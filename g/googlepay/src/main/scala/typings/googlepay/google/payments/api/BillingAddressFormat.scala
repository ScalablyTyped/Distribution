package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Billing address format enum string.
  *
  * Options:
  *
  * - `MIN`:
  *   Minimal billing address
  *
  *   When this format is used, the billing address returned will only
  *   contain the following fields:
  *
  *   - [[Address.name|`name`]]
  *   - [[Address.countryCode|`countryCode`]]
  *   - [[Address.postalCode|`postalCode`]]
  *   - [[Address.phoneNumber|`phoneNumber`]] if
  *     [[BillingAddressParameters.phoneNumberRequired|`BillingAddressParameters.phoneNumberRequired`]]
  *     is set to `true`.
  *
  *   Note: some countries do not use postal codes. The postal code field
  *   will be empty in those countries.
  *
  * - `FULL`:
  *   Full billing address
  *
  *   All the fields in [[Address|`Address`]] will
  *   be returned, with the possible exception of
  *   [[Address.phoneNumber|`Address.phoneNumber`]] which will only be
  *   returned if
  *   [[BillingAddressParameters.phoneNumberRequired|`BillingAddressParameters.phoneNumberRequired`]]
  *   is set to `true`.
  *
  *   Only select this format when it is required to process the order.
  *   Additional form entry or customer data requests can increase friction
  *   during the checkout process and can lead to a lower conversion rate.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.MIN
  - typings.googlepay.googlepayStrings.FULL
*/
trait BillingAddressFormat extends js.Object

object BillingAddressFormat {
  @scala.inline
  def FULL: typings.googlepay.googlepayStrings.FULL = this.cast("FULL")
  @scala.inline
  def MIN: typings.googlepay.googlepayStrings.MIN = this.cast("MIN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

