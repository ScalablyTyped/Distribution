package typings.localtunnel.localtunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("localtunnel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(port: Double, callback: TunnelCallback): Tunnel = js.native
  def apply(port: Double, opt: TunnelConfig, callback: TunnelCallback): Tunnel = js.native
}

