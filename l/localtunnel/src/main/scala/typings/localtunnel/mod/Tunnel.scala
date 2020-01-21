package typings.localtunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tunnel extends js.Object {
  var tunnel_cluster: TunnelCluster = js.native
  var url: String = js.native
  def close(): Unit = js.native
  def open(err: String): Unit = js.native
  def open(err: String, tunnel: Tunnel): Unit = js.native
}

