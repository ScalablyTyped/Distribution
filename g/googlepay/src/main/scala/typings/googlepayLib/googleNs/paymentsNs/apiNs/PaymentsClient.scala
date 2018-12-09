package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.payments.api.PaymentsClient")
@js.native
class PaymentsClient protected () extends js.Object {
  def this(paymentOptions: PaymentOptions) = this()
  def createButton(request: ButtonOptions): stdLib.HTMLElement = js.native
  def isReadyToPay(request: IsReadyToPayRequest): js.Promise[IsReadyToPayResponse] = js.native
  def loadPaymentData(request: PaymentDataRequest): js.Promise[PaymentData] = js.native
  def prefetchPaymentData(request: PaymentDataRequest): scala.Unit = js.native
}

