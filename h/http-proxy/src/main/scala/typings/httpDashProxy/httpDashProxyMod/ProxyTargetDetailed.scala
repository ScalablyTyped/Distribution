package typings.httpDashProxy.httpDashProxyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyTargetDetailed extends js.Object {
  var ca: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var host: String
  var hostname: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[Buffer | String] = js.undefined
  var port: Double
  var protocol: js.UndefOr[String] = js.undefined
  var secureProtocol: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
}

object ProxyTargetDetailed {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    ca: String = null,
    cert: String = null,
    ciphers: String = null,
    hostname: String = null,
    key: String = null,
    passphrase: String = null,
    pfx: Buffer | String = null,
    protocol: String = null,
    secureProtocol: String = null,
    socketPath: String = null
  ): ProxyTargetDetailed = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyTargetDetailed]
  }
}

