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
    httpDashProxyLib.httpDashProxyLibNumbers.`false` | java.lang.String | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  /** URL string to be parsed with the url module. */
  var forward: js.UndefOr[httpDashProxyLib.ProxyTargetUrl] = js.undefined
  /** object with extra headers to be added to target requests. */
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
  /** Explicitly specify if we are proxying to another proxy. */
  var toProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** If you want to proxy websockets. */
  var ws: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds x- forward headers. */
  var xfwd: js.UndefOr[scala.Boolean] = js.undefined
}

