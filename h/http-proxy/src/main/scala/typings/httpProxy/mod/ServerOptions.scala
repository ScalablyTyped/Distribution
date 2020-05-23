package typings.httpProxy.mod

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.httpProxyBooleans.`false`
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  /** Object to be passed to http(s).request. */
  var agent: js.UndefOr[js.Any] = js.undefined
  /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
  var auth: js.UndefOr[String] = js.undefined
  /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
  var autoRewrite: js.UndefOr[Boolean] = js.undefined
  /** Buffer */
  var buffer: js.UndefOr[Stream] = js.undefined
  /** Changes the origin of the host header to the target URL. */
  var changeOrigin: js.UndefOr[Boolean] = js.undefined
  /** rewrites domain of set-cookie headers. */
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
  /** rewrites path of set-cookie headers. Default: false */
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
  /** Specify whether you want to follow redirects. Default: false */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /** URL string to be parsed with the url module. */
  var forward: js.UndefOr[ProxyTargetUrl] = js.undefined
  /** object with extra headers to be added to target requests. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
  var hostRewrite: js.UndefOr[String] = js.undefined
  /** Specify whether you want to ignore the proxy path of the incoming request. */
  var ignorePath: js.UndefOr[Boolean] = js.undefined
  /** Local interface string to bind for outgoing connections. */
  var localAddress: js.UndefOr[String] = js.undefined
  /** Specify whether you want to prepend the target's path to the proxy path. */
  var prependPath: js.UndefOr[Boolean] = js.undefined
  /** specify whether you want to keep letter case of response header key */
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined
  /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
  var protocolRewrite: js.UndefOr[String] = js.undefined
  /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
  var proxyTimeout: js.UndefOr[Double] = js.undefined
  /** Verify SSL certificate. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
  var selfHandleResponse: js.UndefOr[Boolean] = js.undefined
  /** Object to be passed to https.createServer(). */
  var ssl: js.UndefOr[js.Any] = js.undefined
  /** URL string to be parsed with the url module. */
  var target: js.UndefOr[ProxyTarget] = js.undefined
  /** Timeout (in milliseconds) for incoming requests */
  var timeout: js.UndefOr[Double] = js.undefined
  /** Explicitly specify if we are proxying to another proxy. */
  var toProxy: js.UndefOr[Boolean] = js.undefined
  /** If you want to proxy websockets. */
  var ws: js.UndefOr[Boolean] = js.undefined
  /** Adds x- forward headers. */
  var xfwd: js.UndefOr[Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    agent: js.Any = null,
    auth: String = null,
    autoRewrite: js.UndefOr[Boolean] = js.undefined,
    buffer: Stream = null,
    changeOrigin: js.UndefOr[Boolean] = js.undefined,
    cookieDomainRewrite: `false` | String | StringDictionary[String] = null,
    cookiePathRewrite: `false` | String | StringDictionary[String] = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    forward: ProxyTargetUrl = null,
    headers: StringDictionary[String] = null,
    hostRewrite: String = null,
    ignorePath: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    prependPath: js.UndefOr[Boolean] = js.undefined,
    preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined,
    protocolRewrite: String = null,
    proxyTimeout: js.UndefOr[Double] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    selfHandleResponse: js.UndefOr[Boolean] = js.undefined,
    ssl: js.Any = null,
    target: ProxyTarget = null,
    timeout: js.UndefOr[Double] = js.undefined,
    toProxy: js.UndefOr[Boolean] = js.undefined,
    ws: js.UndefOr[Boolean] = js.undefined,
    xfwd: js.UndefOr[Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRewrite)) __obj.updateDynamic("autoRewrite")(autoRewrite.get.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin.get.asInstanceOf[js.Any])
    if (cookieDomainRewrite != null) __obj.updateDynamic("cookieDomainRewrite")(cookieDomainRewrite.asInstanceOf[js.Any])
    if (cookiePathRewrite != null) __obj.updateDynamic("cookiePathRewrite")(cookiePathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.get.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(prependPath)) __obj.updateDynamic("prependPath")(prependPath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHeaderKeyCase)) __obj.updateDynamic("preserveHeaderKeyCase")(preserveHeaderKeyCase.get.asInstanceOf[js.Any])
    if (protocolRewrite != null) __obj.updateDynamic("protocolRewrite")(protocolRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyTimeout)) __obj.updateDynamic("proxyTimeout")(proxyTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selfHandleResponse)) __obj.updateDynamic("selfHandleResponse")(selfHandleResponse.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxy)) __obj.updateDynamic("toProxy")(toProxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xfwd)) __obj.updateDynamic("xfwd")(xfwd.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

