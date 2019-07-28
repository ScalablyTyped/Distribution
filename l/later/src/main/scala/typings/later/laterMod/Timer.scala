package typings.later.laterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  /**
    * Clear the timer and end execution.
    */
  def clear(): Unit
}

object Timer {
  @scala.inline
  def apply(clear: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[Timer]
  }
}

