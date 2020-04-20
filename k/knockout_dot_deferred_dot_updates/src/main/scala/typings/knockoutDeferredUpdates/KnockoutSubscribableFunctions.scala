package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observables
trait KnockoutSubscribableFunctions[T] extends js.Object {
  var deferUpdates: Boolean
}

object KnockoutSubscribableFunctions {
  @scala.inline
  def apply[T](deferUpdates: Boolean): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
}

