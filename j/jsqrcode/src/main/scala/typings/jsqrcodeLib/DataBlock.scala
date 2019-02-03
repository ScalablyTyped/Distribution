package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataBlock")
@js.native
class DataBlock protected () extends js.Object {
  def this(numDataCodewords: scala.Double, codewords: js.Array[scala.Double]) = this()
  val Codewords: js.Array[scala.Double] = js.native
  val NumDataCodewords: scala.Double = js.native
  var codewords: js.Array[scala.Double] = js.native
  var numDataCodewords: scala.Double = js.native
}

/* static members */
@JSGlobal("DataBlock")
@js.native
object DataBlock extends js.Object {
  def getDataBlocks(
    rawCodewords: js.Array[scala.Double],
    version: jsqrcodeLib.Version,
    ecLevel: jsqrcodeLib.ErrorCorrectionLevel
  ): js.Array[jsqrcodeLib.DataBlock] = js.native
}

