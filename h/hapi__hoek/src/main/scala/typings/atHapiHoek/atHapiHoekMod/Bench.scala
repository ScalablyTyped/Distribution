package typings.atHapiHoek.atHapiHoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "Bench")
@js.native
class Bench () extends js.Object {
  /** The number of milliseconds on the node clock elapsed since the epoch. */
  var ts: Double = js.native
  /** The time (ms) elapsed since the timer was created. */
  def elapsed(): Double = js.native
}

