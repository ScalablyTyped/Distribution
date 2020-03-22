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
    host: String = null,
    path: String = null,
    port: String | Double = null,
    secureProxy: js.UndefOr[Boolean] = js.undefined
  ): BaseHttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHttpsProxyAgentOptions]
  }
}

