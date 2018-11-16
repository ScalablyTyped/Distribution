package typings
package hoekLib.hoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoek", "Timer")
@js.native
class Timer () extends js.Object {
  /** The number of milliseconds elapsed since the epoch. */
  var ts: scala.Double = js.native
  /** The time (ms) elapsed since the timer was created. */
  def elapsed(): scala.Double = js.native
}

