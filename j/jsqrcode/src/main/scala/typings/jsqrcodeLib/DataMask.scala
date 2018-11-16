package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataMask")
@js.native
abstract class DataMask () extends js.Object {
  def isMasked(i: scala.Double, j: scala.Double): scala.Boolean = js.native
  def unmaskBitMatrix(bits: js.Array[scala.Double], dimension: scala.Double): scala.Unit = js.native
}

@JSGlobal("DataMask")
@js.native
object DataMask extends js.Object {
  var DATA_MASKS: js.Array[jsqrcodeLib.DataMask] = js.native
  def forReference(reference: scala.Double): jsqrcodeLib.DataMask = js.native
}

