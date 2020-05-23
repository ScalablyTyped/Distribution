package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrix")
@js.native
class BitMatrix protected ()
  extends typings.jsqrcode.BitMatrix {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  /* CompleteClass */
  override val Dimension: Double = js.native
  /* CompleteClass */
  override val Height: Double = js.native
  /* CompleteClass */
  override val Width: Double = js.native
  /* CompleteClass */
  override var bits: js.Array[Double] = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var rowSize: Double = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def flip(x: Double, y: Double): Unit = js.native
  /* CompleteClass */
  override def get_Renamed(x: Double, y: Double): Boolean = js.native
  /* CompleteClass */
  override def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  /* CompleteClass */
  override def set_Renamed(x: Double, y: Double): Unit = js.native
}

