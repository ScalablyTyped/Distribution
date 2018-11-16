package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaymentDataRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var emailRequired: js.UndefOr[scala.Boolean] = js.undefined
  var merchantInfo: MerchantInfo
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.undefined
  var shippingAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
  var transactionInfo: TransactionInfo
}

