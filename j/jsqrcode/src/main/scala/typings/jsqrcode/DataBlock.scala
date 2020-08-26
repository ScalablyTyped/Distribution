package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataBlock extends js.Object {
  val Codewords: js.Array[Double] = js.native
  val NumDataCodewords: Double = js.native
  var codewords: js.Array[Double] = js.native
  var numDataCodewords: Double = js.native
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
  @scala.inline
  implicit class DataBlockOps[Self <: DataBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodewordsVarargs(value: Double*): Self = this.set("Codewords", js.Array(value :_*))
    @scala.inline
    def setCodewords(value: js.Array[Double]): Self = this.set("Codewords", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumDataCodewords(value: Double): Self = this.set("NumDataCodewords", value.asInstanceOf[js.Any])
  }
  
}

