package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBlock extends js.Object {
  val Codewords: js.Array[Double]
  val NumDataCodewords: Double
  var codewords: js.Array[Double]
  var numDataCodewords: Double
}

object DataBlock {
  @scala.inline
  def apply(
    Codewords: js.Array[Double],
    NumDataCodewords: Double,
    codewords: js.Array[Double],
    numDataCodewords: Double
  ): DataBlock = {
    val __obj = js.Dynamic.literal(Codewords = Codewords.asInstanceOf[js.Any], NumDataCodewords = NumDataCodewords.asInstanceOf[js.Any], codewords = codewords.asInstanceOf[js.Any], numDataCodewords = numDataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBlock]
  }
}

