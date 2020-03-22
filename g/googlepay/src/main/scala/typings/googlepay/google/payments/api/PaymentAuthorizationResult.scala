package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callback result for a payment authorization update.
  */
trait PaymentAuthorizationResult extends js.Object {
  /**
    * Error for the last PaymentData, will be displayed to the user.
    */
  var error: js.UndefOr[PaymentDataError] = js.undefined
  /**
    * Represents the state of the transaction after callback is performed.
    */
  var transactionState: TransactionState
}

object PaymentAuthorizationResult {
  @scala.inline
  def apply(transactionState: TransactionState, error: PaymentDataError = null): PaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(transactionState = transactionState.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentAuthorizationResult]
  }
}

