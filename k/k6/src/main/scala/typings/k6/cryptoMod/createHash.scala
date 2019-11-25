package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "createHash")
@js.native
object createHash extends js.Object {
  def apply(algorithm: Algorithm): Hasher = js.native
}

