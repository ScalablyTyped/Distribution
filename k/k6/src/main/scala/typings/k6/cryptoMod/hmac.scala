package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "hmac")
@js.native
object hmac extends js.Object {
  def apply[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, data: String, outputEncoding: OE): Output[OE] = js.native
}

