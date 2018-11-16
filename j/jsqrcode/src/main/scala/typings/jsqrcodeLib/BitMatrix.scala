package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrix")
@js.native
class BitMatrix protected () extends js.Object {
  def this(width: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  val Dimension: scala.Double = js.native
  val Height: scala.Double = js.native
  val Width: scala.Double = js.native
  var bits: js.Array[scala.Double] = js.native
  var height: scala.Double = js.native
  var rowSize: scala.Double = js.native
  var width: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def flip(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def get_Renamed(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def setRegion(left: scala.Double, top: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def set_Renamed(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

