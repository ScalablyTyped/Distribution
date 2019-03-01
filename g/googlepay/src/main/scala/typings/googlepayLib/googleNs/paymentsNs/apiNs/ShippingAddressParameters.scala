package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddressParameters extends js.Object {
  var allowedCountryCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var phoneNumberRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object ShippingAddressParameters {
  @scala.inline
  def apply(
    allowedCountryCodes: js.Array[java.lang.String] = null,
    phoneNumberRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): ShippingAddressParameters = {
    val __obj = js.Dynamic.literal()
    if (allowedCountryCodes != null) __obj.updateDynamic("allowedCountryCodes")(allowedCountryCodes)
    if (!js.isUndefined(phoneNumberRequired)) __obj.updateDynamic("phoneNumberRequired")(phoneNumberRequired)
    __obj.asInstanceOf[ShippingAddressParameters]
  }
}

