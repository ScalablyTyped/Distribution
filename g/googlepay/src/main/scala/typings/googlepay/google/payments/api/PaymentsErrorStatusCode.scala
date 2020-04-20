package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains details about errors returned by client JavaScript
  * methods. Errors might not be displayed in a user-facing dialog.
  *
  * Options:
  *
  * - `BUYER_ACCOUNT_ERROR`:
  *   The current Google user is unable to provide payment information.
  *
  * - `DEVELOPER_ERROR`:
  *   A passed parameter is improperly formatted. An [error message may
  *   appear in the browser
  *   console](https://developer.mozilla.org/en-US/docs/Web/API/Console/error)
  *   for all configured environments.
  *
  * - `MERCHANT_ACCOUNT_ERROR`:
  *   The site accessing the Google Pay API does not have the right
  *   permission. This could be due to either an incorrect configuration or
  *   an incorrect merchant identifier set in the request. Check the
  *   `statusMessage` field for more details. If you continue to have
  *   trouble, please [contact
  *   support](https://developers.google.com/pay/api/web/support/how-to-get-help).
  *
  * - `INTERNAL_ERROR`:
  *   General server error.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR
  - typings.googlepay.googlepayStrings.DEVELOPER_ERROR
  - typings.googlepay.googlepayStrings.MERCHANT_ACCOUNT_ERROR
  - typings.googlepay.googlepayStrings.INTERNAL_ERROR
*/
trait PaymentsErrorStatusCode extends js.Object

object PaymentsErrorStatusCode {
  @scala.inline
  def BUYER_ACCOUNT_ERROR: typings.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR = "BUYER_ACCOUNT_ERROR".asInstanceOf[typings.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR]
  @scala.inline
  def DEVELOPER_ERROR: typings.googlepay.googlepayStrings.DEVELOPER_ERROR = "DEVELOPER_ERROR".asInstanceOf[typings.googlepay.googlepayStrings.DEVELOPER_ERROR]
  @scala.inline
  def INTERNAL_ERROR: typings.googlepay.googlepayStrings.INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[typings.googlepay.googlepayStrings.INTERNAL_ERROR]
  @scala.inline
  def MERCHANT_ACCOUNT_ERROR: typings.googlepay.googlepayStrings.MERCHANT_ACCOUNT_ERROR = "MERCHANT_ACCOUNT_ERROR".asInstanceOf[typings.googlepay.googlepayStrings.MERCHANT_ACCOUNT_ERROR]
}

