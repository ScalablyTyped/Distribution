package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum string of a display item.
  *
  * Options:
  *
  * - `LINE_ITEM`:
  *   Regular line item.
  *
  * - `SUBTOTAL`:
  *   Subtotal of all regular items.
  *
  * - `TAX`:
  *   Item for the collected tax.
  *
  * - `DISCOUNT`:
  *   Item for a discount.
  *
  * - `SHIPPING_OPTION`:
  *   Item for shipping option.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.LINE_ITEM
  - typings.googlepay.googlepayStrings.SUBTOTAL
  - typings.googlepay.googlepayStrings.TAX
  - typings.googlepay.googlepayStrings.DISCOUNT
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION
*/
trait DisplayItemType extends js.Object

object DisplayItemType {
  @scala.inline
  def DISCOUNT: typings.googlepay.googlepayStrings.DISCOUNT = this.cast("DISCOUNT")
  @scala.inline
  def LINE_ITEM: typings.googlepay.googlepayStrings.LINE_ITEM = this.cast("LINE_ITEM")
  @scala.inline
  def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = this.cast("SHIPPING_OPTION")
  @scala.inline
  def SUBTOTAL: typings.googlepay.googlepayStrings.SUBTOTAL = this.cast("SUBTOTAL")
  @scala.inline
  def TAX: typings.googlepay.googlepayStrings.TAX = this.cast("TAX")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

