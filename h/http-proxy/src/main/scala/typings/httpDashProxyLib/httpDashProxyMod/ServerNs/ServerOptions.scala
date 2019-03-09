package typings
package httpDashProxyLib.httpDashProxyMod.ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  /** Object to be passed to http(s).request. */
  var agent: js.UndefOr[js.Any] = js.undefined
  /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
  var auth: js.UndefOr[java.lang.String] = js.undefined
  /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
  var autoRewrite: js.UndefOr[scala.Boolean] = js.undefined
  /** Buffer */
  var buffer: js.UndefOr[nodeLib.streamMod.Stream] = js.undefined
  /** Changes the origin of the host header to the target URL. */
  var changeOrigin: js.UndefOr[scala.Boolean] = js.undefined
  /** rewrites domain of set-cookie headers. */
  var cookieDomainRewrite: js.UndefOr[
    httpDashProxyLib.httpDashProxyLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  /** rewrites path of set-cookie headers. Default: false */
  var cookiePathRewrite: js.UndefOr[
    httpDashProxyLib.httpDashProxyLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  /** Specify whether you want to follow redirects. Default: false */
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /** URL string to be parsed with the url module. */
  var forward: js.UndefOr[httpDashProxyLib.ProxyTargetUrl] = js.undefined
  /** object with extra headers to be added to target requests. */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
  var hostRewrite: js.UndefOr[java.lang.String] = js.undefined
  /** Specify whether you want to ignore the proxy path of the incoming request. */
  var ignorePath: js.UndefOr[scala.Boolean] = js.undefined
  /** Local interface string to bind for outgoing connections. */
  var localAddress: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify whether you want to prepend the target's path to the proxy path. */
  var prependPath: js.UndefOr[scala.Boolean] = js.undefined
  /** specify whether you want to keep letter case of response header key */
  var preserveHeaderKeyCase: js.UndefOr[scala.Boolean] = js.undefined
  /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
  var protocolRewrite: js.UndefOr[java.lang.String] = js.undefined
  /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
  var proxyTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Verify SSL certificate. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
  var selfHandleResponse: js.UndefOr[scala.Boolean] = js.undefined
  /** Object to be passed to https.createServer(). */
  var ssl: js.UndefOr[js.Any] = js.undefined
  /** URL string to be parsed with the url module. */
  var target: js.UndefOr[httpDashProxyLib.ProxyTargetUrl] = js.undefined
  /** Timeout (in milliseconds) for incoming requests */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** Explicitly specify if we are proxying to another proxy. */
  var toProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** If you want to proxy websockets. */
  var ws: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds x- forward headers. */
  var xfwd: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    agent: js.Any = null,
    auth: java.lang.String = null,
    autoRewrite: js.UndefOr[scala.Boolean] = js.undefined,
    buffer: nodeLib.streamMod.Stream = null,
    changeOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    cookieDomainRewrite: httpDashProxyLib.httpDashProxyLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    cookiePathRewrite: httpDashProxyLib.httpDashProxyLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    followRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    forward: httpDashProxyLib.ProxyTargetUrl = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    hostRewrite: java.lang.String = null,
    ignorePath: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: js.UndefOr[scala.Boolean] = js.undefined,
    prependPath: js.UndefOr[scala.Boolean] = js.undefined,
    preserveHeaderKeyCase: js.UndefOr[scala.Boolean] = js.undefined,
    protocolRewrite: java.lang.String = null,
    proxyTimeout: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    selfHandleResponse: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.Any = null,
    target: httpDashProxyLib.ProxyTargetUrl = null,
    timeout: scala.Int | scala.Double = null,
    toProxy: js.UndefOr[scala.Boolean] = js.undefined,
    ws: js.UndefOr[scala.Boolean] = js.undefined,
    xfwd: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (!js.isUndefined(autoRewrite)) __obj.updateDynamic("autoRewrite")(autoRewrite)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin)
    if (cookieDomainRewrite != null) __obj.updateDynamic("cookieDomainRewrite")(cookieDomainRewrite.asInstanceOf[js.Any])
    if (cookiePathRewrite != null) __obj.updateDynamic("cookiePathRewrite")(cookiePathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite)
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath)
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(prependPath)) __obj.updateDynamic("prependPath")(prependPath)
    if (!js.isUndefined(preserveHeaderKeyCase)) __obj.updateDynamic("preserveHeaderKeyCase")(preserveHeaderKeyCase)
    if (protocolRewrite != null) __obj.updateDynamic("protocolRewrite")(protocolRewrite)
    if (proxyTimeout != null) __obj.updateDynamic("proxyTimeout")(proxyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(selfHandleResponse)) __obj.updateDynamic("selfHandleResponse")(selfHandleResponse)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxy)) __obj.updateDynamic("toProxy")(toProxy)
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws)
    if (!js.isUndefined(xfwd)) __obj.updateDynamic("xfwd")(xfwd)
    __obj.asInstanceOf[ServerOptions]
  }
}

