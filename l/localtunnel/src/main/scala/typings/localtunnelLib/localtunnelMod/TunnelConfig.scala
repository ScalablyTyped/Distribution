package typings
package localtunnelLib.localtunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TunnelConfig extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var local_host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var subdomain: js.UndefOr[java.lang.String] = js.undefined
}

object TunnelConfig {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    local_host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    subdomain: java.lang.String = null
  ): TunnelConfig = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (local_host != null) __obj.updateDynamic("local_host")(local_host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (subdomain != null) __obj.updateDynamic("subdomain")(subdomain)
    __obj.asInstanceOf[TunnelConfig]
  }
}

