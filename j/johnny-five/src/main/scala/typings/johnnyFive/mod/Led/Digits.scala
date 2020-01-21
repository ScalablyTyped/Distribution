package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led.Digits")
@js.native
class Digits protected () extends js.Object {
  def this(option: DigitsOption) = this()
  val devices: Double = js.native
  var digitOrder: Double = js.native
  val isMatrix: Boolean = js.native
  def brightness(index: Double, value: Double): Unit = js.native
  def brightness(value: Double): Unit = js.native
  def clear(): Unit = js.native
  def clear(index: Double): Unit = js.native
  def draw(index: Double, position: Double, character: Double): Unit = js.native
  def draw(position: Double, character: Double): Unit = js.native
  def off(): Unit = js.native
  def off(index: Double): Unit = js.native
  def on(): Unit = js.native
  def on(index: Double): Unit = js.native
}

