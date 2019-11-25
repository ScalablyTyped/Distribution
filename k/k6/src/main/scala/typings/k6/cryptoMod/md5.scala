package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "md5")
@js.native
object md5 extends js.Object {
  def apply[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
}

