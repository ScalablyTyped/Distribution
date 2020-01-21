package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "sha512_256")
@js.native
object sha512256 extends js.Object {
  def apply[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
}

