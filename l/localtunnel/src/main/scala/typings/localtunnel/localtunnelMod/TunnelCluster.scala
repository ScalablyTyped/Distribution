package typings.localtunnel.localtunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TunnelCluster extends js.Object {
  var domain: String
}

object TunnelCluster {
  @scala.inline
  def apply(domain: String): TunnelCluster = {
    val __obj = js.Dynamic.literal(domain = domain)
  
    __obj.asInstanceOf[TunnelCluster]
  }
}

