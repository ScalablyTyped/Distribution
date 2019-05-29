package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  // Adds the given value to the counter.
  def increment(delta: scala.Double): scala.Unit
}

object Counter {
  @scala.inline
  def apply(increment: scala.Double => scala.Unit): Counter = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment))
  
    __obj.asInstanceOf[Counter]
  }
}

