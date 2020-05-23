package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataMask100")
@js.native
class DataMask100 ()
  extends typings.jsqrcode.DataMask100 {
  /* CompleteClass */
  override def isMasked(i: Double, j: Double): Boolean = js.native
  /* CompleteClass */
  override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}

