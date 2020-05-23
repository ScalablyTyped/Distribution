package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataMask")
@js.native
abstract class DataMask ()
  extends typings.jsqrcode.DataMask {
  /* CompleteClass */
  override def isMasked(i: Double, j: Double): Boolean = js.native
  /* CompleteClass */
  override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}

/* static members */
@JSGlobal("DataMask")
@js.native
object DataMask extends js.Object {
  var DATA_MASKS: js.Array[typings.jsqrcode.DataMask] = js.native
  def forReference(reference: Double): typings.jsqrcode.DataMask = js.native
}

