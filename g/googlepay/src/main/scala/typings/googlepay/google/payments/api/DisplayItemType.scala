package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait DisplayItemType extends StObject
object DisplayItemType {
  
  inline def DISCOUNT: typings.googlepay.googlepayStrings.DISCOUNT = "DISCOUNT".asInstanceOf[typings.googlepay.googlepayStrings.DISCOUNT]
  
  inline def LINE_ITEM: typings.googlepay.googlepayStrings.LINE_ITEM = "LINE_ITEM".asInstanceOf[typings.googlepay.googlepayStrings.LINE_ITEM]
  
  inline def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_OPTION]
  
  inline def SUBTOTAL: typings.googlepay.googlepayStrings.SUBTOTAL = "SUBTOTAL".asInstanceOf[typings.googlepay.googlepayStrings.SUBTOTAL]
  
  inline def TAX: typings.googlepay.googlepayStrings.TAX = "TAX".asInstanceOf[typings.googlepay.googlepayStrings.TAX]
}
