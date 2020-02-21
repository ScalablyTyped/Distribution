package typings.hapiHawk.cryptoMod

import typings.hapiHawk.clientMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/crypto", "calculateMac")
@js.native
object calculateMac extends js.Object {
  def apply(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
}

