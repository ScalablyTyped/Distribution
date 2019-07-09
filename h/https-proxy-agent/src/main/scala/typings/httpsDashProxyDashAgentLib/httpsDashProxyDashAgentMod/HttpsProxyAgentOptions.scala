package typings
package httpsDashProxyDashAgentLib.httpsDashProxyDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsProxyAgentOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var host: java.lang.String
  var port: scala.Double
  var secureProxy: js.UndefOr[scala.Boolean] = js.undefined
}

object HttpsProxyAgentOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    secureProxy: js.UndefOr[scala.Boolean] = js.undefined
  ): HttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy)
    __obj.asInstanceOf[HttpsProxyAgentOptions]
  }
}

