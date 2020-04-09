package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServerOptions extends js.Object {
  /**
    * If present, this should contain a key/cert combo representing a certificate
    * authority that your client trusts. See these instructions for how to
    * generate these files. You'll then need to configure your client to use this
    * proxy for https in addition to http. Once you've got all of that set up,
    * Hoxy will generate fake keys/cert combos for every hostname you visit,
    * caching them in memory for subsequent visits, thus allowing the proxy to
    * handle https requests as cleartext
    */
  var certAuthority: js.UndefOr[CertificateParams] = js.undefined
  /**
    *  If present, this proxy will run as a reverse proxy for the given server.
    *  This allows you to point your client directly at the proxy, instead of
    *  configuring it in the client's proxy settings.
    *  This value should take the form scheme://host:port.
    */
  var reverse: js.UndefOr[String] = js.undefined
  /**
    * Latency emulation
    */
  var slow: js.UndefOr[Slow] = js.undefined
  /**
    * Should only be used in combination with reverse. If present, causes Hoxy to
    * run as an https server. Passed as opts to https.createServer(opts, function)
    */
  var tls: js.UndefOr[CertificateParams] = js.undefined
  /**
    * If present, this proxy will in turn use another proxy.
    * This allows Hoxy to play well with other proxies.
    * This value should take the form host:port
    */
  var upstreamProxy: js.UndefOr[String] = js.undefined
}

object CreateServerOptions {
  @scala.inline
  def apply(
    certAuthority: CertificateParams = null,
    reverse: String = null,
    slow: Slow = null,
    tls: CertificateParams = null,
    upstreamProxy: String = null
  ): CreateServerOptions = {
    val __obj = js.Dynamic.literal()
    if (certAuthority != null) __obj.updateDynamic("certAuthority")(certAuthority.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (upstreamProxy != null) __obj.updateDynamic("upstreamProxy")(upstreamProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerOptions]
  }
}

