package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReadyToPayRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var existingPaymentMethodRequired: js.UndefOr[scala.Boolean] = js.undefined
}

