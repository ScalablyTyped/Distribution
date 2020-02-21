package typings.hapiHawk.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/crypto", "calculatePayloadHash")
@js.native
object calculatePayloadHash extends js.Object {
  def apply(payload: String, algorithm: String, contentType: String): String = js.native
}

