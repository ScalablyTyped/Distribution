package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Decoder")
@js.native
object Decoder extends js.Object {
  
  def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = js.native
  
  def decode(bits: typings.jsqrcode.BitMatrix): typings.jsqrcode.QRCodeDataBlockReader = js.native
  
  var rsDecoder: typings.jsqrcode.ReedSolomonDecoder = js.native
}
