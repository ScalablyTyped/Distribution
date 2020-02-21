package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/client", "header")
@js.native
object header extends js.Object {
  def apply(uri: String, method: String): Header_ = js.native
  def apply(uri: String, method: String, options: HeaderOptions): Header_ = js.native
}

