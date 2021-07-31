package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported methods for presenting the Google Pay button.
  *
  * A translated button label may appear if a language specified in the
  * viewer's browser matches an [available
  * language](https://developers.google.com/pay/api/web/guides/brand-guidelines#payment-buttons-assets).
  *
  *
  * Options:
  *
  * - `buy`:
  *   "Buy with Google Pay" button.
  *
  * - `donate`:
  *   "Donate with Google Pay" button.
  *
  * - `plain`:
  *   "Google Pay" button without text.
  *
  * - `long`:
  *   Same as "buy".
  *
  * - `short`:
  *   Same as "plain".
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.buy
  - typings.googlepay.googlepayStrings.donate
  - typings.googlepay.googlepayStrings.plain
  - typings.googlepay.googlepayStrings.long
  - typings.googlepay.googlepayStrings.short
*/
trait ButtonType extends StObject
object ButtonType {
  
  @scala.inline
  def buy: typings.googlepay.googlepayStrings.buy = "buy".asInstanceOf[typings.googlepay.googlepayStrings.buy]
  
  @scala.inline
  def donate: typings.googlepay.googlepayStrings.donate = "donate".asInstanceOf[typings.googlepay.googlepayStrings.donate]
  
  @scala.inline
  def long: typings.googlepay.googlepayStrings.long = "long".asInstanceOf[typings.googlepay.googlepayStrings.long]
  
  @scala.inline
  def plain: typings.googlepay.googlepayStrings.plain = "plain".asInstanceOf[typings.googlepay.googlepayStrings.plain]
  
  @scala.inline
  def short: typings.googlepay.googlepayStrings.short = "short".asInstanceOf[typings.googlepay.googlepayStrings.short]
}
