package typings.localtunnel.localtunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TunnelConfig extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var local_host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var subdomain: js.UndefOr[String] = js.undefined
}

object TunnelConfig {
  @scala.inline
  def apply(
    host: String = null,
    local_host: String = null,
    port: Int | Double = null,
    subdomain: String = null
  ): TunnelConfig = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (local_host != null) __obj.updateDynamic("local_host")(local_host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (subdomain != null) __obj.updateDynamic("subdomain")(subdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TunnelConfig]
  }
}

