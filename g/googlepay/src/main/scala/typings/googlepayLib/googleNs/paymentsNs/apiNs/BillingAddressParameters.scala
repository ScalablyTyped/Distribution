package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAddressParameters extends js.Object {
  var format: js.UndefOr[BillingAddressFormat] = js.undefined
  var phoneNumberRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object BillingAddressParameters {
  @scala.inline
  def apply(format: BillingAddressFormat = null, phoneNumberRequired: js.UndefOr[scala.Boolean] = js.undefined): BillingAddressParameters = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(phoneNumberRequired)) __obj.updateDynamic("phoneNumberRequired")(phoneNumberRequired)
    __obj.asInstanceOf[BillingAddressParameters]
  }
}

