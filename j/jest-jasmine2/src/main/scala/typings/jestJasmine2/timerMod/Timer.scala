package typings.jestJasmine2.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def elapsed(): Double
  def start(): Unit
}

object Timer {
  @scala.inline
  def apply(elapsed: () => Double, start: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(elapsed = js.Any.fromFunction0(elapsed), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Timer]
  }
}

