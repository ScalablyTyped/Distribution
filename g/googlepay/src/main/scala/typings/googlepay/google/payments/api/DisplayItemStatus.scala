package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string of a display item status.
  *
  * Options:
  *
  * - `FINAL`:
  *   DisplayItem is final and the item displays the value in price.
  *
  * - `PENDING`:
  *   DisplayItem does not display value in price but instead display as
  *   "pending".
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.FINAL
  - typings.googlepay.googlepayStrings.PENDING
*/
trait DisplayItemStatus extends StObject
object DisplayItemStatus {
  
  inline def FINAL: typings.googlepay.googlepayStrings.FINAL = "FINAL".asInstanceOf[typings.googlepay.googlepayStrings.FINAL]
  
  inline def PENDING: typings.googlepay.googlepayStrings.PENDING = "PENDING".asInstanceOf[typings.googlepay.googlepayStrings.PENDING]
}
