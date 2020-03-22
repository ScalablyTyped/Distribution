package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported environment names to run Google Pay.
  *
  * Options:
  *
  * - `PRODUCTION`:
  *   Used to return chargeable payment methods when a valid Google
  *   merchant ID is specified and configured for the domain.
  *
  * - `TEST`:
  *   Dummy payment methods that are suitable for testing (default).
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PRODUCTION
  - typings.googlepay.googlepayStrings.TEST
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  def PRODUCTION: typings.googlepay.googlepayStrings.PRODUCTION = this.cast("PRODUCTION")
  @scala.inline
  def TEST: typings.googlepay.googlepayStrings.TEST = this.cast("TEST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

