package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observables
trait KnockoutSubscribableFunctions[T] extends js.Object {
  var deferUpdates: scala.Boolean
}

object KnockoutSubscribableFunctions {
  @scala.inline
  def apply[T](deferUpdates: scala.Boolean): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates)
  
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
}

