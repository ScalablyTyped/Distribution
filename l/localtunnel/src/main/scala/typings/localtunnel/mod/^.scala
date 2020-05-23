package typings.localtunnel.mod

import typings.localtunnel.anon.TunnelConfigportnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("localtunnel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(opts: TunnelConfigportnumber, callback: TunnelCallback): Tunnel = js.native
  def apply(port: Double): js.Promise[Tunnel] = js.native
  def apply(port: Double, opts: TunnelConfig): js.Promise[Tunnel] = js.native
  def apply(port: Double, opts: TunnelConfig, callback: TunnelCallback): Tunnel = js.native
  def apply(port: TunnelConfigportnumber): js.Promise[Tunnel] = js.native
}

