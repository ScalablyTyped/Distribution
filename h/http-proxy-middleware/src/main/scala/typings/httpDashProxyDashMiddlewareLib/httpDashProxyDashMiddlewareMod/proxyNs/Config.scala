package typings
package httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareMod.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var autoRewrite: js.UndefOr[scala.Boolean] = js.undefined
  var buffer: js.UndefOr[nodeLib.streamMod.Readable] = js.undefined
  var changeOrigin: js.UndefOr[scala.Boolean] = js.undefined
  var cookieDomainRewrite: js.UndefOr[
    httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var cookiePathRewrite: js.UndefOr[
    httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var forward: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var hostRewrite: js.UndefOr[java.lang.String] = js.undefined
  var ignorePath: js.UndefOr[scala.Boolean] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[
    httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.debug | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.info | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.warn | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.error | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.silent
  ] = js.undefined
  var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* socket */ nodeLib.netMod.Socket, 
      /* head */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onError: js.UndefOr[
    js.Function3[
      /* err */ nodeLib.Error, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* proxySocket */ nodeLib.netMod.Socket, scala.Unit]] = js.undefined
  var onProxyReq: js.UndefOr[
    js.Function3[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var onProxyReqWs: js.UndefOr[
    js.Function5[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* socket */ nodeLib.netMod.Socket, 
      /* options */ httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions, 
      /* head */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onProxyRes: js.UndefOr[
    js.Function3[
      /* proxyRes */ nodeLib.httpMod.IncomingMessage, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var pathRewrite: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function2[
      /* path */ java.lang.String, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      java.lang.String
    ])
  ] = js.undefined
  var prependPath: js.UndefOr[scala.Boolean] = js.undefined
  var preserveHeaderKeyCase: js.UndefOr[scala.Boolean] = js.undefined
  var protocolRewrite: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var proxyHost: js.UndefOr[js.Any] = js.undefined
  /**
    * @deprecated
    */
  var proxyTable: js.UndefOr[js.Any] = js.undefined
  var proxyTimeout: js.UndefOr[scala.Double] = js.undefined
  var router: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, java.lang.String])
  ] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var selfHandleResponse: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var toProxy: js.UndefOr[scala.Boolean] = js.undefined
  var ws: js.UndefOr[scala.Boolean] = js.undefined
  var xfwd: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    auth: java.lang.String = null,
    autoRewrite: js.UndefOr[scala.Boolean] = js.undefined,
    buffer: nodeLib.streamMod.Readable = null,
    changeOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    cookieDomainRewrite: httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    cookiePathRewrite: httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibNumbers.`false` | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    followRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    forward: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    hostRewrite: java.lang.String = null,
    ignorePath: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    logLevel: httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.debug | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.info | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.warn | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.error | httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareLibStrings.silent = null,
    logProvider: js.Function1[/* provider */ LogProvider, LogProvider] = null,
    onClose: js.Function3[
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* socket */ nodeLib.netMod.Socket, 
      /* head */ js.Any, 
      scala.Unit
    ] = null,
    onError: js.Function3[
      /* err */ nodeLib.Error, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ] = null,
    onOpen: js.Function1[/* proxySocket */ nodeLib.netMod.Socket, scala.Unit] = null,
    onProxyReq: js.Function3[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ] = null,
    onProxyReqWs: js.Function5[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* socket */ nodeLib.netMod.Socket, 
      /* options */ httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions, 
      /* head */ js.Any, 
      scala.Unit
    ] = null,
    onProxyRes: js.Function3[
      /* proxyRes */ nodeLib.httpMod.IncomingMessage, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ] = null,
    pathRewrite: org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function2[
      /* path */ java.lang.String, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      java.lang.String
    ]) = null,
    prependPath: js.UndefOr[scala.Boolean] = js.undefined,
    preserveHeaderKeyCase: js.UndefOr[scala.Boolean] = js.undefined,
    protocolRewrite: java.lang.String = null,
    proxyHost: js.Any = null,
    proxyTable: js.Any = null,
    proxyTimeout: scala.Int | scala.Double = null,
    router: org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, java.lang.String]) = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    selfHandleResponse: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: nodeLib.tlsMod.TlsOptions = null,
    target: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    toProxy: js.UndefOr[scala.Boolean] = js.undefined,
    ws: js.UndefOr[scala.Boolean] = js.undefined,
    xfwd: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (!js.isUndefined(autoRewrite)) __obj.updateDynamic("autoRewrite")(autoRewrite)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin)
    if (cookieDomainRewrite != null) __obj.updateDynamic("cookieDomainRewrite")(cookieDomainRewrite.asInstanceOf[js.Any])
    if (cookiePathRewrite != null) __obj.updateDynamic("cookiePathRewrite")(cookiePathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (forward != null) __obj.updateDynamic("forward")(forward)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite)
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logProvider != null) __obj.updateDynamic("logProvider")(logProvider)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onProxyReq != null) __obj.updateDynamic("onProxyReq")(onProxyReq)
    if (onProxyReqWs != null) __obj.updateDynamic("onProxyReqWs")(onProxyReqWs)
    if (onProxyRes != null) __obj.updateDynamic("onProxyRes")(onProxyRes)
    if (pathRewrite != null) __obj.updateDynamic("pathRewrite")(pathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(prependPath)) __obj.updateDynamic("prependPath")(prependPath)
    if (!js.isUndefined(preserveHeaderKeyCase)) __obj.updateDynamic("preserveHeaderKeyCase")(preserveHeaderKeyCase)
    if (protocolRewrite != null) __obj.updateDynamic("protocolRewrite")(protocolRewrite)
    if (proxyHost != null) __obj.updateDynamic("proxyHost")(proxyHost)
    if (proxyTable != null) __obj.updateDynamic("proxyTable")(proxyTable)
    if (proxyTimeout != null) __obj.updateDynamic("proxyTimeout")(proxyTimeout.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(selfHandleResponse)) __obj.updateDynamic("selfHandleResponse")(selfHandleResponse)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxy)) __obj.updateDynamic("toProxy")(toProxy)
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws)
    if (!js.isUndefined(xfwd)) __obj.updateDynamic("xfwd")(xfwd)
    __obj.asInstanceOf[Config]
  }
}

