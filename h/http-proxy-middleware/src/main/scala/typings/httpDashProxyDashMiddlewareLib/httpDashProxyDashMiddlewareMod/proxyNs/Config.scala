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

