package typings.hapiHawk.cryptoMod

import typings.hapiHawk.clientMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/crypto", "calculateTsMac")
@js.native
object calculateTsMac extends js.Object {
  def apply(ts: String, credentials: Credentials): String = js.native
}

