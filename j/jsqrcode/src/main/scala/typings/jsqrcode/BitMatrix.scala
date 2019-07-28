package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrix")
@js.native
class BitMatrix protected () extends js.Object {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  val Dimension: Double = js.native
  val Height: Double = js.native
  val Width: Double = js.native
  var bits: js.Array[Double] = js.native
  var height: Double = js.native
  var rowSize: Double = js.native
  var width: Double = js.native
  def clear(): Unit = js.native
  def flip(x: Double, y: Double): Unit = js.native
  def get_Renamed(x: Double, y: Double): Boolean = js.native
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  def set_Renamed(x: Double, y: Double): Unit = js.native
}

