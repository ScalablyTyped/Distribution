package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led")
@js.native
class Led protected () extends js.Object {
  def this(option: Double) = this()
  def this(option: LedOption) = this()
  var id: String = js.native
  var pin: Double = js.native
  def blink(): Unit = js.native
  def blink(ms: Double): Unit = js.native
  def brightness(`val`: Double): Unit = js.native
  def fade(brightness: Double, ms: Double): Unit = js.native
  def fadeIn(ms: Double): Unit = js.native
  def fadeOut(ms: Double): Unit = js.native
  def off(): Unit = js.native
  def on(): Unit = js.native
  def pulse(ms: Double): Unit = js.native
  def stop(ms: Double): Unit = js.native
  def strobe(ms: Double): Unit = js.native
  def toggle(): Unit = js.native
}

