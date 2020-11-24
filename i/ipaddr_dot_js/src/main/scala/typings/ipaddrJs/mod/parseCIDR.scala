package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipaddr.js", "parseCIDR")
@js.native
object parseCIDR extends js.Object {
  
  def apply(mask: String): js.Tuple2[IPv4 | IPv6, Double] = js.native
}
