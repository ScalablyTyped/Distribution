package typings.httpsDashProxyDashAgent.httpsDashProxyDashAgentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsProxyAgentOptions
  extends /* key */ StringDictionary[js.Any] {
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var host: String
  var port: Double
  var secureProxy: js.UndefOr[Boolean] = js.undefined
}

object HttpsProxyAgentOptions {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    headers: StringDictionary[String] = null,
    secureProxy: js.UndefOr[Boolean] = js.undefined
  ): HttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(secureProxy)) __obj.updateDynamic("secureProxy")(secureProxy)
    __obj.asInstanceOf[HttpsProxyAgentOptions]
  }
}

