package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitMatrix extends js.Object {
  val Dimension: Double
  val Height: Double
  val Width: Double
  var bits: js.Array[Double]
  var height: Double
  var rowSize: Double
  var width: Double
  def clear(): Unit
  def flip(x: Double, y: Double): Unit
  def get_Renamed(x: Double, y: Double): Boolean
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit
  def set_Renamed(x: Double, y: Double): Unit
}

object BitMatrix {
  @scala.inline
  def apply(
    Dimension: Double,
    Height: Double,
    Width: Double,
    bits: js.Array[Double],
    clear: () => Unit,
    flip: (Double, Double) => Unit,
    get_Renamed: (Double, Double) => Boolean,
    height: Double,
    rowSize: Double,
    setRegion: (Double, Double, Double, Double) => Unit,
    set_Renamed: (Double, Double) => Unit,
    width: Double
  ): BitMatrix = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), flip = js.Any.fromFunction2(flip), get_Renamed = js.Any.fromFunction2(get_Renamed), height = height.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], setRegion = js.Any.fromFunction4(setRegion), set_Renamed = js.Any.fromFunction2(set_Renamed), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitMatrix]
  }
}

