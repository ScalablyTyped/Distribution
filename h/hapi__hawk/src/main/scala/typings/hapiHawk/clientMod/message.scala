package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/client", "message")
@js.native
object message extends js.Object {
  def apply(host: String, port: Double, message: String): Message_ = js.native
  def apply(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
}

