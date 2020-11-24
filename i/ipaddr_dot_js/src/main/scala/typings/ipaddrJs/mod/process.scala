package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipaddr.js", "process")
@js.native
object process extends js.Object {
  
  def apply(addr: String): IPv4 | IPv6 = js.native
}
