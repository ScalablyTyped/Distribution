package typings.h2o2

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.h2o2.h2o2Booleans.`false`
import typings.h2o2.h2o2Strings.http
import typings.h2o2.h2o2Strings.https
import typings.h2o2.h2o2Strings.upstream
import typings.hapi.mod.Lifecycle.ReturnValue
import typings.hapi.mod.Plugin
import typings.hapi.mod.Request
import typings.hapi.mod.ResponseObject
import typings.hapi.mod.ResponseToolkit
import typings.hapi.mod.RouteOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("h2o2", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  trait ProxyHandlerOptions extends StObject {
    
    /** acceptEncoding - if set to false, does not pass-through the 'Accept-Encoding' HTTP header which is useful for the onResponse post-processing to avoid receiving an encoded response. Can only be used together with passThrough. Defaults to true (passing header). */
    var acceptEncoding: js.UndefOr[Boolean] = js.undefined
    
    /** agent - a node http(s) agent to be used for connections to upstream server. @see {@link https://nodejs.org/api/http.html#http_class_http_agent} */
    var agent: js.UndefOr[Agent] = js.undefined
    
    /** host - upstream service host to proxy requests to. It will have the same path as the client request. */
    var host: js.UndefOr[String] = js.undefined
    
    /** localStatePassThrough - if set tofalse, any locally defined state is removed from incoming requests before being sent to the upstream service. This value can be overridden on a per state basis via the server.state()``passThrough option. Defaults to false */
    var localStatePassThrough: js.UndefOr[Boolean] = js.undefined
    
    /** mapUri - a function used to map the request URI to the target `uri` and optional `headers` with which to make that request. Cannot be used together with `host`, `port`, `protocol`, or `uri`.
      * @param request - is the incoming request object.
      */
    var mapUri: js.UndefOr[
        js.ThisFunction1[/* this */ this.type, /* request */ Request, js.Promise[ProxyTarget]]
      ] = js.undefined
    
    /** maxSockets - sets the maximum number of sockets available per outgoing proxy host connection. false means use the wreck module default value (Infinity). Does not affect non-proxy outgoing client connections. Defaults to Infinity. */
    var maxSockets: js.UndefOr[`false` | Double] = js.undefined
    
    /**
      * onResponse - a custom function for processing the response from the upstream service before sending to the client. Useful for custom error handling of responses from the proxied endpoint or other payload manipulation.
      * @param err - internal or upstream error returned from attempting to contact the upstream proxy.  TODO: check this is of type BoomError or just Error.
      * @param res - the node response object received from the upstream service. res is a readable stream (use the wreck module read method to easily convert it to a Buffer or string).
      * @param request - is the incoming request object.
      * @param h - Hapi's response toolkit.
      * @param settings - the proxy handler configuration.
      * @param ttl - the upstream TTL in milliseconds if proxy.ttl it set to 'upstream' and the upstream response included a valid 'Cache-Control' header with 'max-age'.
      */
    var onResponse: js.UndefOr[
        js.ThisFunction6[
          /* this */ RouteOptions, 
          /* err */ Null | typings.boom.mod.^[js.Any], 
          /* res */ IncomingMessage, 
          /* req */ Request, 
          /* h */ ResponseToolkit, 
          /* settings */ this.type, 
          /* ttl */ Double, 
          ReturnValue
        ]
      ] = js.undefined
    
    /** passThrough - if set to true, it forwards the headers from the client to the upstream service, headers sent from the upstream service will also be forwarded to the client. Defaults to false. */
    var passThrough: js.UndefOr[Boolean] = js.undefined
    
    /** port - upstream service port. */
    var port: js.UndefOr[Double | String] = js.undefined
    
    /** protocol - protocol to use when making the request to the proxied host: */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /** redirects - the maximum number of HTTP redirections allowed to be followed automatically by the handler. Set to false or 0 to disable all redirections (the response will contain the redirection received from the upstream service). If redirections are enabled, no redirections (301, 302, 307, 308) will be passed along to the client, and reaching the maximum allowed redirections will return an error response. Defaults to false. */
    var redirects: js.UndefOr[Double | `false`] = js.undefined
    
    /** rejectUnauthorized - sets the rejectUnauthorized property on the https agent making the request. This value is only used when the proxied server uses TLS/SSL. If set it will override the node.js rejectUnauthorized property. If false then ssl errors will be ignored. When true the server certificate is verified and an 500 response will be sent when verification fails. This shouldn't be used alongside the agent setting as the agent will be used instead. Defaults to the https agent default value of true. */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /** timeout - number of milliseconds before aborting the upstream request. Defaults to 180000 (3 minutes). */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** ttl - if set to 'upstream', applies the upstream response caching policy to the response using the response.ttl() method (or passed as an argument to the onResponse method if provided). */
    var ttl: js.UndefOr[upstream] = js.undefined
    
    /** uri - absolute URI used instead of host, port, protocol, path, and query. Cannot be used with host, port, protocol, or mapUri. */
    var uri: js.UndefOr[String] = js.undefined
    
    /** xforward - if set to true, sets the 'X-Forwarded-For', 'X-Forwarded-Port', 'X-Forwarded-Proto', 'X-Forwarded-Host' headers when making a request to the proxied upstream endpoint. Defaults to false. */
    var xforward: js.UndefOr[Boolean] = js.undefined
  }
  object ProxyHandlerOptions {
    
    inline def apply(): ProxyHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyHandlerOptions]
    }
    
    extension [Self <: ProxyHandlerOptions](x: Self) {
      
      inline def setAcceptEncoding(value: Boolean): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
      
      inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalStatePassThrough(value: Boolean): Self = StObject.set(x, "localStatePassThrough", value.asInstanceOf[js.Any])
      
      inline def setLocalStatePassThroughUndefined: Self = StObject.set(x, "localStatePassThrough", js.undefined)
      
      inline def setMapUri(value: js.ThisFunction1[ProxyHandlerOptions, /* request */ Request, js.Promise[ProxyTarget]]): Self = StObject.set(x, "mapUri", value.asInstanceOf[js.Any])
      
      inline def setMapUriUndefined: Self = StObject.set(x, "mapUri", js.undefined)
      
      inline def setMaxSockets(value: `false` | Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setOnResponse(
        value: js.ThisFunction6[
              /* this */ RouteOptions, 
              /* err */ Null | typings.boom.mod.^[js.Any], 
              /* res */ IncomingMessage, 
              /* req */ Request, 
              /* h */ ResponseToolkit, 
              ProxyHandlerOptions, 
              /* ttl */ Double, 
              ReturnValue
            ]
      ): Self = StObject.set(x, "onResponse", value.asInstanceOf[js.Any])
      
      inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      inline def setPassThrough(value: Boolean): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setPassThroughUndefined: Self = StObject.set(x, "passThrough", js.undefined)
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRedirects(value: Double | `false`): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTtl(value: upstream): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setXforward(value: Boolean): Self = StObject.set(x, "xforward", value.asInstanceOf[js.Any])
      
      inline def setXforwardUndefined: Self = StObject.set(x, "xforward", js.undefined)
    }
  }
  
  trait ProxyTarget extends StObject {
    
    /** The headers with which to request `uri` */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** The URI to request */
    var uri: String
  }
  object ProxyTarget {
    
    inline def apply(uri: String): ProxyTarget = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyTarget]
    }
    
    extension [Self <: ProxyTarget](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiAugmentingMod {
    
    trait HandlerDecorations extends StObject {
      
      /**
        * Proxies the request to an upstream endpoint.
        */
      var proxy: js.UndefOr[ProxyHandlerOptions] = js.undefined
    }
    object HandlerDecorations {
      
      inline def apply(): HandlerDecorations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HandlerDecorations]
      }
      
      extension [Self <: HandlerDecorations](x: Self) {
        
        inline def setProxy(value: ProxyHandlerOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      }
    }
    
    trait ResponseToolkit extends StObject {
      
      /**
        * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
        */
      def proxy(options: ProxyHandlerOptions): js.Promise[ResponseObject]
    }
    object ResponseToolkit {
      
      inline def apply(proxy: ProxyHandlerOptions => js.Promise[ResponseObject]): typings.h2o2.mod.hapiAugmentingMod.ResponseToolkit = {
        val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
        __obj.asInstanceOf[typings.h2o2.mod.hapiAugmentingMod.ResponseToolkit]
      }
      
      extension [Self <: typings.h2o2.mod.hapiAugmentingMod.ResponseToolkit](x: Self) {
        
        inline def setProxy(value: ProxyHandlerOptions => js.Promise[ResponseObject]): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
      }
    }
  }
}
