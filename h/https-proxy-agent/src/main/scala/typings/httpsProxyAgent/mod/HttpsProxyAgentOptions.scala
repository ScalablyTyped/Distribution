package typings.httpsProxyAgent.mod

import typings.agentBase.mod.AgentOptions
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'> ]:? std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'>[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.httpsProxyAgent.mod.BaseHttpsProxyAgentOptions because var conflicts: host, port. Inlined headers, secureProxy, path */ trait HttpsProxyAgentOptions extends AgentOptions {
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var secureProxy: js.UndefOr[Boolean] = js.undefined
}

object HttpsProxyAgentOptions {
  @scala.inline
  def apply(
    headers: OutgoingHttpHeaders = null,
    host: String = null,
    path: js.UndefOr[Null | String] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    secureProxy: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): HttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsProxyAgentOptions]
  }
}

