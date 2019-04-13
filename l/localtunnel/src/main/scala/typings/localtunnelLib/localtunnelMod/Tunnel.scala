package typings
package localtunnelLib.localtunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tunnel extends js.Object {
  var tunnel_cluster: TunnelCluster = js.native
  var url: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def open(err: java.lang.String): scala.Unit = js.native
  def open(err: java.lang.String, tunnel: Tunnel): scala.Unit = js.native
}

