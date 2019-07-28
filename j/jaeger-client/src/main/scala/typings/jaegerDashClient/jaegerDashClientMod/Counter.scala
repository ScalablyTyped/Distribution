package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  // Adds the given value to the counter.
  def increment(delta: Double): Unit
}

object Counter {
  @scala.inline
  def apply(increment: Double => Unit): Counter = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment))
  
    __obj.asInstanceOf[Counter]
  }
}

