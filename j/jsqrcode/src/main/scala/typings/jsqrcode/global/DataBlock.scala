package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataBlock")
@js.native
class DataBlock protected ()
  extends typings.jsqrcode.DataBlock {
  def this(numDataCodewords: Double, codewords: js.Array[Double]) = this()
}

/* static members */
@JSGlobal("DataBlock")
@js.native
object DataBlock extends js.Object {
  def getDataBlocks(
    rawCodewords: js.Array[Double],
    version: typings.jsqrcode.Version,
    ecLevel: typings.jsqrcode.ErrorCorrectionLevel
  ): js.Array[typings.jsqrcode.DataBlock] = js.native
}

