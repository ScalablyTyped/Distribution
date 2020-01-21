package typings.hoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoek", "Timer")
@js.native
class Timer () extends js.Object {
  /** The number of milliseconds elapsed since the epoch. */
  var ts: Double = js.native
  /** The time (ms) elapsed since the timer was created. */
  def elapsed(): Double = js.native
}

