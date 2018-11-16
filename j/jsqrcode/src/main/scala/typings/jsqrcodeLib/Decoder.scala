package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Decoder")
@js.native
object Decoder extends js.Object {
  var rsDecoder: jsqrcodeLib.ReedSolomonDecoder = js.native
  def correctErrors(codewordBytes: js.Array[scala.Double], numDataCodewords: scala.Double): scala.Unit = js.native
  def decode(bits: jsqrcodeLib.BitMatrix): jsqrcodeLib.QRCodeDataBlockReader = js.native
}

