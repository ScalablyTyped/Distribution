package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported methods for presenting the Google Pay button.
  *
  * Options:
  *
  * - `long`:
  *   "Buy with Google Pay" button. A translated button label may
  *   appear if a language specified in the viewer's browser matches an
  *   [available
  *   language](https://developers.google.com/pay/api/web/guides/brand-guidelines#payment-buttons-assets).
  *
  * - `short`:
  *   Google Pay payment button without the "Buy with" text.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.long
  - typings.googlepay.googlepayStrings.short
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.googlepay.googlepayStrings.long = this.cast("long")
  @scala.inline
  def short: typings.googlepay.googlepayStrings.short = this.cast("short")
}

