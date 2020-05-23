package typings.localtunnel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined localtunnel.localtunnel.TunnelConfig & {  port  :number} */
trait TunnelConfigportnumber extends js.Object {
  var allow_invalid_cert: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var local_ca: js.UndefOr[String] = js.undefined
  var local_cert: js.UndefOr[String] = js.undefined
  var local_host: js.UndefOr[String] = js.undefined
  var local_https: js.UndefOr[Boolean] = js.undefined
  var local_key: js.UndefOr[String] = js.undefined
  var port: Double
  var subdomain: js.UndefOr[String] = js.undefined
}

object TunnelConfigportnumber {
  @scala.inline
  def apply(
    port: Double,
    allow_invalid_cert: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    local_ca: String = null,
    local_cert: String = null,
    local_host: String = null,
    local_https: js.UndefOr[Boolean] = js.undefined,
    local_key: String = null,
    subdomain: String = null
  ): TunnelConfigportnumber = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_invalid_cert)) __obj.updateDynamic("allow_invalid_cert")(allow_invalid_cert.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (local_ca != null) __obj.updateDynamic("local_ca")(local_ca.asInstanceOf[js.Any])
    if (local_cert != null) __obj.updateDynamic("local_cert")(local_cert.asInstanceOf[js.Any])
    if (local_host != null) __obj.updateDynamic("local_host")(local_host.asInstanceOf[js.Any])
    if (!js.isUndefined(local_https)) __obj.updateDynamic("local_https")(local_https.get.asInstanceOf[js.Any])
    if (local_key != null) __obj.updateDynamic("local_key")(local_key.asInstanceOf[js.Any])
    if (subdomain != null) __obj.updateDynamic("subdomain")(subdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TunnelConfigportnumber]
  }
}

