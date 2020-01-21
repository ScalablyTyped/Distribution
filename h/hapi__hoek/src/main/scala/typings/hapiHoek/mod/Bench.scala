package typings.hapiHoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "Bench")
@js.native
class Bench () extends js.Object {
  /** The starting timestamp expressed in the number of milliseconds since the epoch. */
  var ts: Double = js.native
  /** The time in milliseconds since the object was created. */
  def elapsed(): Double = js.native
  /** Reset the `ts` value to now. */
  def reset(): Unit = js.native
}

/* static members */
@JSImport("@hapi/hoek", "Bench")
@js.native
object Bench extends js.Object {
  /** The current time in milliseconds since the epoch. */
  def now(): Double = js.native
}

