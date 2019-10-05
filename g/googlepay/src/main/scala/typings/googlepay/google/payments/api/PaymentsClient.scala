package typings.googlepay.google.payments.api

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.payments.api.PaymentsClient")
@js.native
class PaymentsClient protected () extends js.Object {
  def this(paymentOptions: PaymentOptions) = this()
  def createButton(request: ButtonOptions): HTMLElement = js.native
  def isReadyToPay(request: IsReadyToPayRequest): js.Promise[IsReadyToPayResponse] = js.native
  def loadPaymentData(request: PaymentDataRequest): js.Promise[PaymentData] = js.native
  def prefetchPaymentData(request: PaymentDataRequest): Unit = js.native
}

