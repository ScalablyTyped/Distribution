package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaymentData extends ApiVersion {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodData: PaymentMethodData
  var shippingAddress: js.UndefOr[Address] = js.undefined
}

