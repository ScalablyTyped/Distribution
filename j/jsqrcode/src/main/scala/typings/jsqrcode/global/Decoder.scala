package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Decoder")
@js.native
object Decoder extends js.Object {
  var rsDecoder: typings.jsqrcode.ReedSolomonDecoder = js.native
  def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = js.native
  def decode(bits: typings.jsqrcode.BitMatrix): typings.jsqrcode.QRCodeDataBlockReader = js.native
}

