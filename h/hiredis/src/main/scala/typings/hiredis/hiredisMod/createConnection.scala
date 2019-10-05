package typings.hiredis.hiredisMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hiredis", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(port: Double, host: String): Socket = js.native
}

