package typings.k6.cryptoMod

import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/crypto", "randomBytes")
@js.native
object randomBytes extends js.Object {
  def apply(size: Double): bytes = js.native
}

