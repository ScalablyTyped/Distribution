package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Piezo")
@js.native
class Piezo protected () extends js.Object {
  def this(option: PiezoOption) = this()
  def this(option: scala.Double) = this()
  var id: java.lang.String = js.native
  val isPlaying: scala.Boolean = js.native
  val mode: scala.Double = js.native
  var pin: scala.Double = js.native
  def frequency(frequency: scala.Double, duration: scala.Double): scala.Unit = js.native
  def noTone(): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def play(tune: js.Any): scala.Unit = js.native
  def play(tune: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def tone(frequency: scala.Double, duration: scala.Double): scala.Unit = js.native
}

