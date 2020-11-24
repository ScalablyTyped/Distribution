package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported methods for controlling the size of the Google Pay button.
  *
  * Options:
  *
  * - `static`:
  *   Default behavior. The button has a fixed width and height.
  *
  * - `fill`:
  *   The button fills its container.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.static
  - typings.googlepay.googlepayStrings.fill
*/
trait ButtonSizeMode extends js.Object
object ButtonSizeMode {
  
  @scala.inline
  def fill: typings.googlepay.googlepayStrings.fill = "fill".asInstanceOf[typings.googlepay.googlepayStrings.fill]
  
  @scala.inline
  def static: typings.googlepay.googlepayStrings.static = "static".asInstanceOf[typings.googlepay.googlepayStrings.static]
}
