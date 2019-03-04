package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Deferred extender
trait KnockoutExtenders extends js.Object {
  def deferred(target: js.Any, value: scala.Boolean): js.Any
}

object KnockoutExtenders {
  @scala.inline
  def apply(deferred: js.Function2[js.Any, scala.Boolean, js.Any]): KnockoutExtenders = {
    val __obj = js.Dynamic.literal(deferred = deferred)
  
    __obj.asInstanceOf[KnockoutExtenders]
  }
}

