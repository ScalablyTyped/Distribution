package typings.hapiH2o2

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBoom.mod.Boom
import typings.hapiH2o2.anon.PartialClient
import typings.hapiH2o2.hapiH2o2Booleans.`false`
import typings.hapiH2o2.hapiH2o2Strings.http
import typings.hapiH2o2.hapiH2o2Strings.https
import typings.hapiH2o2.hapiH2o2Strings.upstream
import typings.hapiH2o2.mod.hapiHapiAugmentingMod.ResponseToolkit
import typings.hapiHapi.libTypesPluginMod.Plugin
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesRouteMod.RouteOptions
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import typings.hapiWreck.mod.Client
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/h2o2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/h2o2", "plugin")
  @js.native
  def plugin: Plugin[Any, Unit] = js.native
  inline def plugin_=(x: Plugin[Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])
  
  /**
    * Proxy handler options
    */
  trait ProxyHandlerOptions extends StObject {
    
    /**
      * if set to false, does not pass-through the 'Accept-Encoding' HTTP
      * header which is useful for the onResponse post-processing to avoid
      * receiving an encoded response. Can only be used together with
      * passThrough.
      *
      * @default true (passing header).
      */
    var acceptEncoding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a node http(s) agent to be used for connections to upstream server.
      * @see {@link https://nodejs.org/api/http.html#http_class_http_agent}
      */
    var agent: js.UndefOr[Agent] = js.undefined
    
    /**
      * TLS list of TLS ciphers to override node's default. The possible
      * values depend on your installation of OpenSSL. Read the official
      * OpenSSL docs for possible TLS_CIPHERS.
      */
    var ciphers: js.UndefOr[String] = js.undefined
    
    /**
      * logs the time spent processing the downstream request using
      * process.hrtime.
      *
      * @default false
      */
    var downstreamResponseTime: js.UndefOr[js.Array[Double] | `false`] = js.undefined
    
    /**
      * upstream service host to proxy requests to. It will have the same
      * path as the client request.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * an http client that abides by the Wreck interface.
      *
      * @default wreck
      */
    var httpClient: js.UndefOr[PartialClient] = js.undefined
    
    /**
      * if set tofalse, any locally defined state is removed from incoming
      * requests before being sent to the upstream service. This value can be
      * overridden on a per state basis via the server.state()``passThrough
      * option.
      *
      * @default false
      */
    var localStatePassThrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a function used to map the request URI to the target `uri` and
      * optional `headers` with which to make that request. Cannot be used
      * together with `host`, `port`, `protocol`, or `uri`.
      * @param request - is the incoming request object.
      */
    var mapUri: js.UndefOr[
        js.ThisFunction1[/* this */ this.type, /* request */ Request[ReqRefDefaults], js.Promise[ProxyTarget]]
      ] = js.undefined
    
    /**
      * sets the maximum number of sockets available per outgoing proxy host
      * connection. false means use the wreck module default value
      * (Infinity). Does not affect non-proxy outgoing client connections.
      *
      * @default Infinity
      */
    var maxSockets: js.UndefOr[`false` | Double] = js.undefined
    
    /**
      * a custom function which is passed the upstream request.
      * @param req - the [wreck] (https://github.com/hapijs/wreck) request to the upstream server.
      */
    var onRequest: js.UndefOr[js.Function1[/* req */ Client, js.Promise[IncomingMessage]]] = js.undefined
    
    /**
      * a custom function for processing the response from the upstream
      * service before sending to the client. Useful for custom error
      * handling of responses from the proxied endpoint or other payload
      * manipulation.
      * @param err - internal or upstream error returned from attempting to
      * contact the upstream proxy.  TODO: check this is of type BoomError or
      * just Error.
      * @param res - the node response object received from the upstream
      * service. res is a readable stream (use the wreck module read method
      * to easily convert it to a Buffer or string).
      * @param request - is the incoming request object.
      * @param h - Hapi's response toolkit.
      * @param settings - the proxy handler configuration.
      * @param ttl - the upstream TTL in milliseconds if proxy.ttl it set to
      * 'upstream' and the upstream response included a valid 'Cache-Control'
      * header with 'max-age'.
      */
    var onResponse: js.UndefOr[
        js.ThisFunction6[
          /* this */ RouteOptions[ReqRefDefaults], 
          /* err */ Null | Boom[Any], 
          /* res */ IncomingMessage, 
          /* req */ Request[ReqRefDefaults], 
          /* h */ ResponseToolkit, 
          /* settings */ this.type, 
          /* ttl */ Double, 
          ReturnValue[ReqRefDefaults]
        ]
      ] = js.undefined
    
    /**
      * if set to true, it forwards the headers from the client to the
      * upstream service, headers sent from the upstream service will also be
      * forwarded to the client.
      *
      * @default false
      */
    var passThrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * upstream service port.
      */
    var port: js.UndefOr[Double | String] = js.undefined
    
    /**
      * protocol to use when making the request to the proxied host:
      */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /**
      * the maximum number of HTTP redirections allowed to be followed
      * automatically by the handler. Set to false or 0 to disable all
      * redirections (the response will contain the redirection received from
      * the upstream service). If redirections are enabled, no redirections
      * (301, 302, 307, 308) will be passed along to the client, and reaching
      * the maximum allowed redirections will return an error response.
      *
      * @default false
      */
    var redirects: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * sets the rejectUnauthorized property on the https agent making the
      * request. This value is only used when the proxied server uses
      * TLS/SSL. If set it will override the node.js rejectUnauthorized
      * property. If false then ssl errors will be ignored. When true the
      * server certificate is verified and an 500 response will be sent when
      * verification fails. This shouldn't be used alongside the agent
      * setting as the agent will be used instead.
      *
      * @default true
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TLS flag indicating the SSL method to use, e.g. SSLv3_method to force
      * SSL version 3. The possible values depend on your installation of
      * OpenSSL. Read the official OpenSSL docs for possible SSL_METHODS.
      */
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    /**
      * number of milliseconds before aborting the upstream request. Defaults
      * to 180000 (3 minutes).
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * if set to 'upstream', applies the upstream response caching policy to
      * the response using the response.ttl() method (or passed as an
      * argument to the onResponse method if provided).
      */
    var ttl: js.UndefOr[upstream] = js.undefined
    
    /**
      * absolute URI used instead of host, port, protocol, path, and query.
      * Cannot be used with host, port, protocol, or mapUri.
      */
    var uri: js.UndefOr[String] = js.undefined
    
    /**
      * if set to true, sets the 'X-Forwarded-For', 'X-Forwarded-Port',
      * 'X-Forwarded-Proto', 'X-Forwarded-Host' headers when making a request
      * to the proxied upstream endpoint.
      *
      * @default false
      */
    var xforward: js.UndefOr[Boolean] = js.undefined
  }
  object ProxyHandlerOptions {
    
    inline def apply(): ProxyHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxyHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptEncoding(value: Boolean): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
      
      inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setDownstreamResponseTime(value: js.Array[Double] | `false`): Self = StObject.set(x, "downstreamResponseTime", value.asInstanceOf[js.Any])
      
      inline def setDownstreamResponseTimeUndefined: Self = StObject.set(x, "downstreamResponseTime", js.undefined)
      
      inline def setDownstreamResponseTimeVarargs(value: Double*): Self = StObject.set(x, "downstreamResponseTime", js.Array(value*))
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttpClient(value: PartialClient): Self = StObject.set(x, "httpClient", value.asInstanceOf[js.Any])
      
      inline def setHttpClientUndefined: Self = StObject.set(x, "httpClient", js.undefined)
      
      inline def setLocalStatePassThrough(value: Boolean): Self = StObject.set(x, "localStatePassThrough", value.asInstanceOf[js.Any])
      
      inline def setLocalStatePassThroughUndefined: Self = StObject.set(x, "localStatePassThrough", js.undefined)
      
      inline def setMapUri(
        value: js.ThisFunction1[ProxyHandlerOptions, /* request */ Request[ReqRefDefaults], js.Promise[ProxyTarget]]
      ): Self = StObject.set(x, "mapUri", value.asInstanceOf[js.Any])
      
      inline def setMapUriUndefined: Self = StObject.set(x, "mapUri", js.undefined)
      
      inline def setMaxSockets(value: `false` | Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setOnRequest(value: /* req */ Client => js.Promise[IncomingMessage]): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
      
      inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
      
      inline def setOnResponse(
        value: js.ThisFunction6[
              /* this */ RouteOptions[ReqRefDefaults], 
              /* err */ Null | Boom[Any], 
              /* res */ IncomingMessage, 
              /* req */ Request[ReqRefDefaults], 
              /* h */ ResponseToolkit, 
              ProxyHandlerOptions, 
              /* ttl */ Double, 
              ReturnValue[ReqRefDefaults]
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
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
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
  
  /**
    * `mapURI` return value
    */
  trait ProxyTarget extends StObject {
    
    /**
      * The headers with which to request `uri`
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The URI to request
      */
    var uri: String
  }
  object ProxyTarget {
    
    inline def apply(uri: String): ProxyTarget = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxyTarget] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
        
        inline def setProxy(value: ProxyHandlerOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      }
    }
    
    trait ResponseToolkit extends StObject {
      
      /**
        * Proxies the request to an upstream endpoint. `async`, so you'll need
        * to `await` the `ResponseObject` to work on it before returning it.
        */
      def proxy(options: ProxyHandlerOptions): js.Promise[ResponseObject]
    }
    object ResponseToolkit {
      
      inline def apply(proxy: ProxyHandlerOptions => js.Promise[ResponseObject]): ResponseToolkit = {
        val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
        __obj.asInstanceOf[ResponseToolkit]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResponseToolkit] (val x: Self) extends AnyVal {
        
        inline def setProxy(value: ProxyHandlerOptions => js.Promise[ResponseObject]): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
      }
    }
  }
}
