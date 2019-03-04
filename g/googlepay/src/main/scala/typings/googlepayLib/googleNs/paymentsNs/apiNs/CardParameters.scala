package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardParameters extends js.Object {
  var allowPrepaidCards: js.UndefOr[scala.Boolean] = js.undefined
  var allowedAuthMethods: js.Array[AllowedAuthMethod]
  var allowedCardNetworks: js.Array[AllowedCardNetwork]
  var billingAddressParameters: js.UndefOr[BillingAddressParameters] = js.undefined
  var billingAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object CardParameters {
  @scala.inline
  def apply(
    allowedAuthMethods: js.Array[AllowedAuthMethod],
    allowedCardNetworks: js.Array[AllowedCardNetwork],
    allowPrepaidCards: js.UndefOr[scala.Boolean] = js.undefined,
    billingAddressParameters: BillingAddressParameters = null,
    billingAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): CardParameters = {
    val __obj = js.Dynamic.literal(allowedAuthMethods = allowedAuthMethods, allowedCardNetworks = allowedCardNetworks)
    if (!js.isUndefined(allowPrepaidCards)) __obj.updateDynamic("allowPrepaidCards")(allowPrepaidCards)
    if (billingAddressParameters != null) __obj.updateDynamic("billingAddressParameters")(billingAddressParameters)
    if (!js.isUndefined(billingAddressRequired)) __obj.updateDynamic("billingAddressRequired")(billingAddressRequired)
    __obj.asInstanceOf[CardParameters]
  }
}

