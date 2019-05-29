package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  // Records the time passed in.
  def record(value: scala.Double): scala.Unit
}

object Timer {
  @scala.inline
  def apply(record: scala.Double => scala.Unit): Timer = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
  
    __obj.asInstanceOf[Timer]
  }
}

