package typings.koaDashProxies.koaDashProxiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.httpDashProxy.httpDashProxyBooleans.`false`
import typings.httpDashProxy.httpDashProxyMod.ProxyTargetUrl
import typings.httpDashProxy.httpDashProxyMod.ServerOptions
import typings.koa.koaMod.DefaultContext
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ServerOptions {
  var events: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.undefined
  var logs: js.UndefOr[Boolean] = js.undefined
  var rewrite: js.UndefOr[js.Function2[/* url */ String, /* ctx */ DefaultContext, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: js.Any = null,
    auth: String = null,
    autoRewrite: js.UndefOr[Boolean] = js.undefined,
    buffer: Stream = null,
    changeOrigin: js.UndefOr[Boolean] = js.undefined,
    cookieDomainRewrite: `false` | String | StringDictionary[String] = null,
    cookiePathRewrite: `false` | String | StringDictionary[String] = null,
    events: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    forward: ProxyTargetUrl = null,
    headers: StringDictionary[String] = null,
    hostRewrite: String = null,
    ignorePath: js.UndefOr[Boolean] = js.undefined,
    localAddress: js.UndefOr[Boolean] = js.undefined,
    logs: js.UndefOr[Boolean] = js.undefined,
    prependPath: js.UndefOr[Boolean] = js.undefined,
    preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined,
    protocolRewrite: String = null,
    proxyTimeout: Int | Double = null,
    rewrite: (/* url */ String, /* ctx */ DefaultContext) => String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    selfHandleResponse: js.UndefOr[Boolean] = js.undefined,
    ssl: js.Any = null,
    target: ProxyTargetUrl = null,
    timeout: Int | Double = null,
    toProxy: js.UndefOr[Boolean] = js.undefined,
    ws: js.UndefOr[Boolean] = js.undefined,
    xfwd: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRewrite)) __obj.updateDynamic("autoRewrite")(autoRewrite.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin.asInstanceOf[js.Any])
    if (cookieDomainRewrite != null) __obj.updateDynamic("cookieDomainRewrite")(cookieDomainRewrite.asInstanceOf[js.Any])
    if (cookiePathRewrite != null) __obj.updateDynamic("cookiePathRewrite")(cookiePathRewrite.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(logs)) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (!js.isUndefined(prependPath)) __obj.updateDynamic("prependPath")(prependPath.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHeaderKeyCase)) __obj.updateDynamic("preserveHeaderKeyCase")(preserveHeaderKeyCase.asInstanceOf[js.Any])
    if (protocolRewrite != null) __obj.updateDynamic("protocolRewrite")(protocolRewrite.asInstanceOf[js.Any])
    if (proxyTimeout != null) __obj.updateDynamic("proxyTimeout")(proxyTimeout.asInstanceOf[js.Any])
    if (rewrite != null) __obj.updateDynamic("rewrite")(js.Any.fromFunction2(rewrite))
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(selfHandleResponse)) __obj.updateDynamic("selfHandleResponse")(selfHandleResponse.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxy)) __obj.updateDynamic("toProxy")(toProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    if (!js.isUndefined(xfwd)) __obj.updateDynamic("xfwd")(xfwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

