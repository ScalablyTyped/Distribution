package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains details about errors returned by client JavaScript
  * methods. Errors might not be displayed in a user-facing dialog.
  */
trait PaymentsError extends js.Object {
  /**
    * Short code that describes the type of error.
    */
  var statusCode: PaymentsErrorStatusCode | String
  /**
    * Developer-facing message that describes the error encountered and
    * possible steps to correct it.
    */
  var statusMessage: String
}

object PaymentsError {
  @scala.inline
  def apply(statusCode: PaymentsErrorStatusCode | String, statusMessage: String): PaymentsError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaymentsError]
  }
}

