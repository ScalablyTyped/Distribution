package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "parse")
@js.native
object parse extends js.Object {
  def apply(addr: String): IPv4 | IPv6 = js.native
}

