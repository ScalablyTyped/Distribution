package typings.httpsProxyAgent.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHttpsProxyAgentOptions extends js.Object {
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var host: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[String | Double | Null] = js.undefined
  var secureProxy: js.UndefOr[Boolean] = js.undefined
}

object BaseHttpsProxyAgentOptions {
  @scala.inline
  def apply(
    headers: OutgoingHttpHeaders = null,
    host: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    port: js.UndefOr[Null | String | Double] = js.undefined,
    secureProxy: js.UndefOr[Boolean] = js.undefined
  ): BaseHttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHttpsProxyAgentOptions]
  }
}

