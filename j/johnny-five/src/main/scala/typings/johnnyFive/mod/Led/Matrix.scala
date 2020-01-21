package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led.Matrix")
@js.native
class Matrix protected () extends js.Object {
  def this(option: MatrixIC2Option) = this()
  def this(option: MatrixOption) = this()
  val devices: Double = js.native
  val isMatrix: Boolean = js.native
  def brightness(index: Double, value: Double): Unit = js.native
  def brightness(value: Double): Unit = js.native
  def clear(): Unit = js.native
  def clear(index: Double): Unit = js.native
  def column(index: Double, row: Double, `val`: Double): Unit = js.native
  def column(row: Double, `val`: Double): Unit = js.native
  def draw(index: Double, position: Double, character: Double): Unit = js.native
  def draw(position: Double, character: Double): Unit = js.native
  def led(index: Double, row: Double, col: Double, state: js.Any): Unit = js.native
  def led(row: Double, col: Double, state: js.Any): Unit = js.native
  def off(): Unit = js.native
  def off(index: Double): Unit = js.native
  def on(): Unit = js.native
  def on(index: Double): Unit = js.native
  def row(index: Double, row: Double, `val`: Double): Unit = js.native
  def row(row: Double, `val`: Double): Unit = js.native
}

