package typings.knockoutDotDeferredDotUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Deferred extender
trait KnockoutExtenders extends js.Object {
  def deferred(target: js.Any, value: Boolean): js.Any
}

object KnockoutExtenders {
  @scala.inline
  def apply(deferred: (js.Any, Boolean) => js.Any): KnockoutExtenders = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred))
  
    __obj.asInstanceOf[KnockoutExtenders]
  }
}

