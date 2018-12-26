package typings
package h2o2Lib.h2o2Mod.h2o2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProxyHandlerOptions extends js.Object {
  /** acceptEncoding - if set to false, does not pass-through the 'Accept-Encoding' HTTP header which is useful for the onResponse post-processing to avoid receiving an encoded response. Can only be used together with passThrough. Defaults to true (passing header). */
  var acceptEncoding: js.UndefOr[scala.Boolean] = js.undefined
  /** agent - a node http(s) agent to be used for connections to upstream server. @see {@link https://nodejs.org/api/http.html#http_class_http_agent} */
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  /** host - upstream service host to proxy requests to. It will have the same path as the client request. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** localStatePassThrough - if set tofalse, any locally defined state is removed from incoming requests before being sent to the upstream service. This value can be overridden on a per state basis via the server.state()``passThrough option. Defaults to false */
  var localStatePassThrough: js.UndefOr[scala.Boolean] = js.undefined
  /** mapUri - a function used to map the request URI to the target `uri` and optional `headers` with which to make that request. Cannot be used together with `host`, `port`, `protocol`, or `uri`.
           * @param request - is the incoming request object.
          */
  var mapUri: js.UndefOr[
    js.ThisFunction1[
      /* this */ ProxyHandlerOptions, 
      /* request */ hapiLib.hapiMod.Request, 
      js.Promise[ProxyTarget]
    ]
  ] = js.undefined
  /** maxSockets - sets the maximum number of sockets available per outgoing proxy host connection. false means use the wreck module default value (Infinity). Does not affect non-proxy outgoing client connections. Defaults to Infinity. */
  var maxSockets: js.UndefOr[h2o2Lib.h2o2LibNumbers.`false` | scala.Double] = js.undefined
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
      /* this */ hapiLib.hapiMod.RouteOptions, 
      /* err */ scala.Null | boomLib.boomMod.namespaced[_], 
      /* res */ nodeLib.httpMod.IncomingMessage, 
      /* req */ hapiLib.hapiMod.Request, 
      /* h */ hapiLib.hapiMod.ResponseToolkit, 
      /* settings */ ProxyHandlerOptions, 
      /* ttl */ scala.Double, 
      hapiLib.hapiMod.LifecycleNs.ReturnValue
    ]
  ] = js.undefined
  /** passThrough - if set to true, it forwards the headers from the client to the upstream service, headers sent from the upstream service will also be forwarded to the client. Defaults to false. */
  var passThrough: js.UndefOr[scala.Boolean] = js.undefined
  /** port - upstream service port. */
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** protocol - protocol to use when making the request to the proxied host: */
  var protocol: js.UndefOr[h2o2Lib.h2o2LibStrings.http | h2o2Lib.h2o2LibStrings.https] = js.undefined
  /** redirects - the maximum number of HTTP redirections allowed to be followed automatically by the handler. Set to false or 0 to disable all redirections (the response will contain the redirection received from the upstream service). If redirections are enabled, no redirections (301, 302, 307, 308) will be passed along to the client, and reaching the maximum allowed redirections will return an error response. Defaults to false. */
  var redirects: js.UndefOr[scala.Double | h2o2Lib.h2o2LibNumbers.`false`] = js.undefined
  /** rejectUnauthorized - sets the rejectUnauthorized property on the https agent making the request. This value is only used when the proxied server uses TLS/SSL. If set it will override the node.js rejectUnauthorized property. If false then ssl errors will be ignored. When true the server certificate is verified and an 500 response will be sent when verification fails. This shouldn't be used alongside the agent setting as the agent will be used instead. Defaults to the https agent default value of true. */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /** timeout - number of milliseconds before aborting the upstream request. Defaults to 180000 (3 minutes). */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** ttl - if set to 'upstream', applies the upstream response caching policy to the response using the response.ttl() method (or passed as an argument to the onResponse method if provided). */
  var ttl: js.UndefOr[h2o2Lib.h2o2LibStrings.upstream] = js.undefined
  /** uri - absolute URI used instead of host, port, protocol, path, and query. Cannot be used with host, port, protocol, or mapUri. */
  var uri: js.UndefOr[java.lang.String] = js.undefined
  /** xforward - if set to true, sets the 'X-Forwarded-For', 'X-Forwarded-Port', 'X-Forwarded-Proto', 'X-Forwarded-Host' headers when making a request to the proxied upstream endpoint. Defaults to false. */
  var xforward: js.UndefOr[scala.Boolean] = js.undefined
}

