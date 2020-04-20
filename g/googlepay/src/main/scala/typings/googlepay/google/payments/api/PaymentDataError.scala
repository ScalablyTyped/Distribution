package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an error in PaymentData.
  */
trait PaymentDataError extends js.Object {
  /**
    * Intent of where the error occurs. Only data that specified in the
    * callback intent will be returned so an exception will be thrown if
    * the intent does not fall into one of the provided intents in
    * PaymentRequest.
    *
    * This field is required.
    */
  var intent: CallbackIntent
  /**
    * Custom user visible error that will be displayed in a dialog.
    *
    * This field is required.
    */
  var message: String
  /**
    * Predifined error reason
    *
    * This field is required.
    */
  var reason: ErrorReason
}

object PaymentDataError {
  @scala.inline
  def apply(intent: CallbackIntent, message: String, reason: ErrorReason): PaymentDataError = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataError]
  }
}

