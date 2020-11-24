package typings.hapiH2o2.mod

import typings.hapiBoom.mod.Boom
import typings.hapiH2o2.hapiH2o2Booleans.`false`
import typings.hapiH2o2.hapiH2o2Strings.http
import typings.hapiH2o2.hapiH2o2Strings.https
import typings.hapiH2o2.hapiH2o2Strings.upstream
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiHapi.mod.RouteOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyHandlerOptions extends js.Object {
  
  /** acceptEncoding - if set to false, does not pass-through the 'Accept-Encoding' HTTP header which is useful for the onResponse post-processing to avoid receiving an encoded response. Can only be used together with passThrough. Defaults to true (passing header). */
  var acceptEncoding: js.UndefOr[Boolean] = js.native
  
  /** agent - a node http(s) agent to be used for connections to upstream server. @see {@link https://nodejs.org/api/http.html#http_class_http_agent} */
  var agent: js.UndefOr[Agent] = js.native
  
  /** host - upstream service host to proxy requests to. It will have the same path as the client request. */
  var host: js.UndefOr[String] = js.native
  
  /** localStatePassThrough - if set tofalse, any locally defined state is removed from incoming requests before being sent to the upstream service. This value can be overridden on a per state basis via the server.state()``passThrough option. Defaults to false */
  var localStatePassThrough: js.UndefOr[Boolean] = js.native
  
  /** mapUri - a function used to map the request URI to the target `uri` and optional `headers` with which to make that request. Cannot be used together with `host`, `port`, `protocol`, or `uri`.
    * @param request - is the incoming request object.
    */
  var mapUri: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* request */ Request, js.Promise[ProxyTarget]]
  ] = js.native
  
  /** maxSockets - sets the maximum number of sockets available per outgoing proxy host connection. false means use the wreck module default value (Infinity). Does not affect non-proxy outgoing client connections. Defaults to Infinity. */
  var maxSockets: js.UndefOr[`false` | Double] = js.native
  
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
      /* err */ Null | Boom[_], 
      /* res */ IncomingMessage, 
      /* req */ Request, 
      /* h */ ResponseToolkit, 
      /* settings */ this.type, 
      /* ttl */ Double, 
      ReturnValue
    ]
  ] = js.native
  
  /** passThrough - if set to true, it forwards the headers from the client to the upstream service, headers sent from the upstream service will also be forwarded to the client. Defaults to false. */
  var passThrough: js.UndefOr[Boolean] = js.native
  
  /** port - upstream service port. */
  var port: js.UndefOr[Double | String] = js.native
  
  /** protocol - protocol to use when making the request to the proxied host: */
  var protocol: js.UndefOr[http | https] = js.native
  
  /** redirects - the maximum number of HTTP redirections allowed to be followed automatically by the handler. Set to false or 0 to disable all redirections (the response will contain the redirection received from the upstream service). If redirections are enabled, no redirections (301, 302, 307, 308) will be passed along to the client, and reaching the maximum allowed redirections will return an error response. Defaults to false. */
  var redirects: js.UndefOr[Double | `false`] = js.native
  
  /** rejectUnauthorized - sets the rejectUnauthorized property on the https agent making the request. This value is only used when the proxied server uses TLS/SSL. If set it will override the node.js rejectUnauthorized property. If false then ssl errors will be ignored. When true the server certificate is verified and an 500 response will be sent when verification fails. This shouldn't be used alongside the agent setting as the agent will be used instead. Defaults to the https agent default value of true. */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  /** timeout - number of milliseconds before aborting the upstream request. Defaults to 180000 (3 minutes). */
  var timeout: js.UndefOr[Double] = js.native
  
  /** ttl - if set to 'upstream', applies the upstream response caching policy to the response using the response.ttl() method (or passed as an argument to the onResponse method if provided). */
  var ttl: js.UndefOr[upstream] = js.native
  
  /** uri - absolute URI used instead of host, port, protocol, path, and query. Cannot be used with host, port, protocol, or mapUri. */
  var uri: js.UndefOr[String] = js.native
  
  /** xforward - if set to true, sets the 'X-Forwarded-For', 'X-Forwarded-Port', 'X-Forwarded-Proto', 'X-Forwarded-Host' headers when making a request to the proxied upstream endpoint. Defaults to false. */
  var xforward: js.UndefOr[Boolean] = js.native
}
object ProxyHandlerOptions {
  
  @scala.inline
  def apply(): ProxyHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandlerOptions]
  }
  
  @scala.inline
  implicit class ProxyHandlerOptionsOps[Self <: ProxyHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setAcceptEncoding(value: Boolean): Self = this.set("acceptEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptEncoding: Self = this.set("acceptEncoding", js.undefined)
    
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLocalStatePassThrough(value: Boolean): Self = this.set("localStatePassThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalStatePassThrough: Self = this.set("localStatePassThrough", js.undefined)
    
    @scala.inline
    def setMapUri(value: js.ThisFunction1[ProxyHandlerOptions, /* request */ Request, js.Promise[ProxyTarget]]): Self = this.set("mapUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapUri: Self = this.set("mapUri", js.undefined)
    
    @scala.inline
    def setMaxSockets(value: `false` | Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    
    @scala.inline
    def setOnResponse(
      value: js.ThisFunction6[
          /* this */ RouteOptions, 
          /* err */ Null | Boom[_], 
          /* res */ IncomingMessage, 
          /* req */ Request, 
          /* h */ ResponseToolkit, 
          ProxyHandlerOptions, 
          /* ttl */ Double, 
          ReturnValue
        ]
    ): Self = this.set("onResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
    
    @scala.inline
    def setPassThrough(value: Boolean): Self = this.set("passThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassThrough: Self = this.set("passThrough", js.undefined)
    
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRedirects(value: Double | `false`): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTtl(value: upstream): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setXforward(value: Boolean): Self = this.set("xforward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXforward: Self = this.set("xforward", js.undefined)
  }
}
