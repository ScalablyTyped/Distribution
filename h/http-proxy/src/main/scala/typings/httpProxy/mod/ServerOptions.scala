package typings.httpProxy.mod

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.httpProxyBooleans.`false`
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  /** Object to be passed to http(s).request. */
  var agent: js.UndefOr[js.Any] = js.native
  /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
  var auth: js.UndefOr[String] = js.native
  /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
  var autoRewrite: js.UndefOr[Boolean] = js.native
  /** Buffer */
  var buffer: js.UndefOr[Stream] = js.native
  /** Changes the origin of the host header to the target URL. */
  var changeOrigin: js.UndefOr[Boolean] = js.native
  /** rewrites domain of set-cookie headers. */
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  /** rewrites path of set-cookie headers. Default: false */
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  /** Specify whether you want to follow redirects. Default: false */
  var followRedirects: js.UndefOr[Boolean] = js.native
  /** URL string to be parsed with the url module. */
  var forward: js.UndefOr[ProxyTargetUrl] = js.native
  /** object with extra headers to be added to target requests. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
  var hostRewrite: js.UndefOr[String] = js.native
  /** Specify whether you want to ignore the proxy path of the incoming request. */
  var ignorePath: js.UndefOr[Boolean] = js.native
  /** Local interface string to bind for outgoing connections. */
  var localAddress: js.UndefOr[String] = js.native
  /** Specify whether you want to prepend the target's path to the proxy path. */
  var prependPath: js.UndefOr[Boolean] = js.native
  /** specify whether you want to keep letter case of response header key */
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
  /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
  var protocolRewrite: js.UndefOr[String] = js.native
  /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
  var proxyTimeout: js.UndefOr[Double] = js.native
  /** Verify SSL certificate. */
  var secure: js.UndefOr[Boolean] = js.native
  /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
  var selfHandleResponse: js.UndefOr[Boolean] = js.native
  /** Object to be passed to https.createServer(). */
  var ssl: js.UndefOr[js.Any] = js.native
  /** URL string to be parsed with the url module. */
  var target: js.UndefOr[ProxyTarget] = js.native
  /** Timeout (in milliseconds) for incoming requests */
  var timeout: js.UndefOr[Double] = js.native
  /** Explicitly specify if we are proxying to another proxy. */
  var toProxy: js.UndefOr[Boolean] = js.native
  /** If you want to proxy websockets. */
  var ws: js.UndefOr[Boolean] = js.native
  /** Adds x- forward headers. */
  var xfwd: js.UndefOr[Boolean] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAutoRewrite(value: Boolean): Self = this.set("autoRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRewrite: Self = this.set("autoRewrite", js.undefined)
    @scala.inline
    def setBuffer(value: Stream): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setChangeOrigin(value: Boolean): Self = this.set("changeOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeOrigin: Self = this.set("changeOrigin", js.undefined)
    @scala.inline
    def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = this.set("cookieDomainRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieDomainRewrite: Self = this.set("cookieDomainRewrite", js.undefined)
    @scala.inline
    def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = this.set("cookiePathRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookiePathRewrite: Self = this.set("cookiePathRewrite", js.undefined)
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    @scala.inline
    def setForward(value: ProxyTargetUrl): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHostRewrite(value: String): Self = this.set("hostRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostRewrite: Self = this.set("hostRewrite", js.undefined)
    @scala.inline
    def setIgnorePath(value: Boolean): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setPrependPath(value: Boolean): Self = this.set("prependPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrependPath: Self = this.set("prependPath", js.undefined)
    @scala.inline
    def setPreserveHeaderKeyCase(value: Boolean): Self = this.set("preserveHeaderKeyCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveHeaderKeyCase: Self = this.set("preserveHeaderKeyCase", js.undefined)
    @scala.inline
    def setProtocolRewrite(value: String): Self = this.set("protocolRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolRewrite: Self = this.set("protocolRewrite", js.undefined)
    @scala.inline
    def setProxyTimeout(value: Double): Self = this.set("proxyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyTimeout: Self = this.set("proxyTimeout", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSelfHandleResponse(value: Boolean): Self = this.set("selfHandleResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfHandleResponse: Self = this.set("selfHandleResponse", js.undefined)
    @scala.inline
    def setSsl(value: js.Any): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setTarget(value: ProxyTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setToProxy(value: Boolean): Self = this.set("toProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToProxy: Self = this.set("toProxy", js.undefined)
    @scala.inline
    def setWs(value: Boolean): Self = this.set("ws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
    @scala.inline
    def setXfwd(value: Boolean): Self = this.set("xfwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXfwd: Self = this.set("xfwd", js.undefined)
  }
  
}

