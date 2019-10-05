package typings.johnnyDashFive.johnnyDashFiveMod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led.RGB")
@js.native
class RGB protected () extends js.Object {
  def this(option: RGBOption) = this()
  var blue: typings.johnnyDashFive.johnnyDashFiveMod.Led = js.native
  var green: typings.johnnyDashFive.johnnyDashFiveMod.Led = js.native
  val isAnode: Boolean = js.native
  var red: typings.johnnyDashFive.johnnyDashFiveMod.Led = js.native
  def color(value: String): Unit = js.native
  def fadeIn(ms: Double): Unit = js.native
  def fadeOut(ms: Double): Unit = js.native
  def intensity(value: Double): Unit = js.native
  def off(): Unit = js.native
  def on(): Unit = js.native
  def pulse(ms: Double): Unit = js.native
  def stop(ms: Double): Unit = js.native
  def strobe(ms: Double): Unit = js.native
  def toggle(): Unit = js.native
}

