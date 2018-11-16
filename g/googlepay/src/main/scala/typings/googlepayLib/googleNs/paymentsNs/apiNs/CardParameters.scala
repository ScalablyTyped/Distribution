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

