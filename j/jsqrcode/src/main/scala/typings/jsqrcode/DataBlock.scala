package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataBlock")
@js.native
class DataBlock protected () extends js.Object {
  def this(numDataCodewords: Double, codewords: js.Array[Double]) = this()
  val Codewords: js.Array[Double] = js.native
  val NumDataCodewords: Double = js.native
  var codewords: js.Array[Double] = js.native
  var numDataCodewords: Double = js.native
}

/* static members */
@JSGlobal("DataBlock")
@js.native
object DataBlock extends js.Object {
  def getDataBlocks(rawCodewords: js.Array[Double], version: Version, ecLevel: ErrorCorrectionLevel): js.Array[DataBlock] = js.native
}

