package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataMask")
@js.native
abstract class DataMask () extends js.Object {
  def isMasked(i: Double, j: Double): Boolean = js.native
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}

/* static members */
@JSGlobal("DataMask")
@js.native
object DataMask extends js.Object {
  var DATA_MASKS: js.Array[DataMask] = js.native
  def forReference(reference: Double): DataMask = js.native
}

