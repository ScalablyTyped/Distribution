package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led")
@js.native
class Led protected () extends js.Object {
  def this(option: LedOption) = this()
  def this(option: scala.Double) = this()
  var id: java.lang.String = js.native
  var pin: scala.Double = js.native
  def blink(): scala.Unit = js.native
  def blink(ms: scala.Double): scala.Unit = js.native
  def brightness(`val`: scala.Double): scala.Unit = js.native
  def fade(brightness: scala.Double, ms: scala.Double): scala.Unit = js.native
  def fadeIn(ms: scala.Double): scala.Unit = js.native
  def fadeOut(ms: scala.Double): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def pulse(ms: scala.Double): scala.Unit = js.native
  def stop(ms: scala.Double): scala.Unit = js.native
  def strobe(ms: scala.Double): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

