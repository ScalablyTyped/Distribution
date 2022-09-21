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
  * - `book`:
  *   "Book with Google Pay" button.
  *
  * - `buy`:
  *   "Buy with Google Pay" button.
  *
  * - `checkout`:
  *   "Checkout with Google Pay" button.
  *
  * - `donate`:
  *   "Donate with Google Pay" button.
  *
  * - `order`:
  *   "Order with Google Pay" button.
  *
  * - `pay`:
  *   "Pay with Google Pay" button.
  *
  * - `plain`:
  *   "Google Pay" button without text.
  *
  * - `subscribe`:
  *   "Subscribe with Google Pay" button.
  *
  * - `long`:
  *   Same as "buy".
  *
  * - `short`:
  *   Same as "plain".
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.book
  - typings.googlepay.googlepayStrings.buy
  - typings.googlepay.googlepayStrings.checkout
  - typings.googlepay.googlepayStrings.donate
  - typings.googlepay.googlepayStrings.order
  - typings.googlepay.googlepayStrings.pay
  - typings.googlepay.googlepayStrings.plain
  - typings.googlepay.googlepayStrings.subscribe
  - typings.googlepay.googlepayStrings.long
  - typings.googlepay.googlepayStrings.short
*/
trait ButtonType extends StObject
object ButtonType {
  
  inline def book: typings.googlepay.googlepayStrings.book = "book".asInstanceOf[typings.googlepay.googlepayStrings.book]
  
  inline def buy: typings.googlepay.googlepayStrings.buy = "buy".asInstanceOf[typings.googlepay.googlepayStrings.buy]
  
  inline def checkout: typings.googlepay.googlepayStrings.checkout = "checkout".asInstanceOf[typings.googlepay.googlepayStrings.checkout]
  
  inline def donate: typings.googlepay.googlepayStrings.donate = "donate".asInstanceOf[typings.googlepay.googlepayStrings.donate]
  
  inline def long: typings.googlepay.googlepayStrings.long = "long".asInstanceOf[typings.googlepay.googlepayStrings.long]
  
  inline def order: typings.googlepay.googlepayStrings.order = "order".asInstanceOf[typings.googlepay.googlepayStrings.order]
  
  inline def pay: typings.googlepay.googlepayStrings.pay = "pay".asInstanceOf[typings.googlepay.googlepayStrings.pay]
  
  inline def plain: typings.googlepay.googlepayStrings.plain = "plain".asInstanceOf[typings.googlepay.googlepayStrings.plain]
  
  inline def short: typings.googlepay.googlepayStrings.short = "short".asInstanceOf[typings.googlepay.googlepayStrings.short]
  
  inline def subscribe: typings.googlepay.googlepayStrings.subscribe = "subscribe".asInstanceOf[typings.googlepay.googlepayStrings.subscribe]
}
