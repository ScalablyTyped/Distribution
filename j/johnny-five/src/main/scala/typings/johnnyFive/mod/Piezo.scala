package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Piezo")
@js.native
class Piezo protected () extends js.Object {
  def this(option: Double) = this()
  def this(option: PiezoOption) = this()
  var id: String = js.native
  val isPlaying: Boolean = js.native
  val mode: Double = js.native
  var pin: Double = js.native
  def frequency(frequency: Double, duration: Double): Unit = js.native
  def noTone(): Unit = js.native
  def off(): Unit = js.native
  def play(tune: js.Any): Unit = js.native
  def play(tune: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def tone(frequency: Double, duration: Double): Unit = js.native
}

