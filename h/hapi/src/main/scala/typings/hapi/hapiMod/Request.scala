package typings.hapi.hapiMod

import typings.boom.boomMod.^
import typings.hapi.Anon_Close
import typings.hapi.Anon_Req
import typings.hapi.hapiMod.Util.Dictionary
import typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL
import typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.URL
import typings.podium.podiumMod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Podium {
  /**
    * Application-specific state. Provides a safe place to store application data without potential conflicts with the framework. Should not be used by plugins which should use plugins[name].
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestapp)
    */
  var app: ApplicationState = js.native
  /**
    * Authentication information:
    * * artifacts - an artifact object received from the authentication strategy and used in authentication-related actions.
    * * credentials - the credential object received during the authentication process. The presence of an object does not mean successful authentication.
    * * error - the authentication error is failed and mode set to 'try'.
    * * isAuthenticated - true if the request has been successfully authenticated, otherwise false.
    * * isAuthorized - true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed
    * authorization, set to false.
    * * mode - the route authentication mode.
    * * strategy - the name of the strategy used.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestauth)
    */
  val auth: RequestAuth = js.native
  /**
    * Access: read only and the public podium interface.
    * The request.events supports the following events:
    * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
    * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
    * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
    */
  var events: RequestEvents = js.native
  /**
    * The raw request headers (references request.raw.req.headers).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestheaders)
    */
  val headers: Dictionary[String] = js.native
  /**
    * Request information:
    * * acceptEncoding - the request preferred encoding.
    * * cors - if CORS is enabled for the route, contains the following:
    * * isOriginMatch - true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only
    * available after the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
    * * host - content of the HTTP 'Host' header (e.g. 'example.com:8080').
    * * hostname - the hostname part of the 'Host' header (e.g. 'example.com').
    * * id - a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}').
    * * received - request reception timestamp.
    * * referrer - content of the HTTP 'Referrer' (or 'Referer') header.
    * * remoteAddress - remote client IP address.
    * * remotePort - remote client port.
    * * responded - request response timestamp (0 is not responded yet).
    * Note that the request.info object is not meant to be modified.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestinfo)
    */
  val info: RequestInfo = js.native
  /**
    * An array containing the logged request events.
    * Note that this array will be empty if route log.collect is set to false.
    */
  val logs: js.Array[RequestLog] = js.native
  /**
    * The request method in lower case (e.g. 'get', 'post').
    */
  val method: HTTP_METHODS_PARTIAL_LOWERCASE = js.native
  /**
    * The parsed content-type header. Only available when payload parsing enabled and no payload error occurred.
    */
  val mime: String = js.native
  /**
    * An object containing the values of params, query, and payload before any validation modifications made. Only set when input validation is performed.
    */
  val orig: RequestOrig = js.native
  /**
    * An object where each key is a path parameter name with matching value as described in [Path parameters](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters).
    */
  val params: Dictionary[String] = js.native
  /**
    * An array containing all the path params values in the order they appeared in the path.
    */
  val paramsArray: js.Array[String] = js.native
  /**
    * The request URI's pathname component.
    */
  val path: String = js.native
  /**
    * The request payload based on the route payload.output and payload.parse settings.
    * TODO check this typing and add references / links.
    */
  val payload: Readable | Buffer | String | js.Object = js.native
  /**
    * Plugin-specific state. Provides a place to store and pass request-level plugin data. The plugins is an object where each key is a plugin name and the value is the state.
    */
  var plugins: PluginsStates = js.native
  /**
    * An object where each key is the name assigned by a route pre-handler methods function. The values are the raw values provided to the continuation function as argument. For the wrapped response
    * object, use responses.
    */
  val pre: Dictionary[_] = js.native
  /**
    * Same as pre but represented as the response object created by the pre method.
    */
  val preResponses: Dictionary[_] = js.native
  /**
    * By default the object outputted from node's URL parse() method.
    */
  val query: RequestQuery = js.native
  /**
    * An object containing the Node HTTP server objects. Direct interaction with these raw objects is not recommended.
    * * req - the node request object.
    * * res - the node response object.
    */
  val raw: Anon_Req = js.native
  /**
    * Access: read / write (see limitations below).
    * The response object when set. The object can be modified but must not be assigned another object. To replace the response with another from within an extension point, use reply(response) to
    * override with a different response.
    * In case of an aborted request the status code will be set to `disconnectStatusCode`.
    */
  var response: ResponseObject | ^[_] = js.native
  /**
    * The request route information object and method
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestroute)
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestrouteauthaccessrequest)
    */
  val route: RequestRoute = js.native
  /**
    * Access: read only and the public server interface.
    * The server object.
    */
  var server: Server = js.native
  /**
    * An object containing parsed HTTP state information (cookies) where each key is the cookie name and value is the matching cookie content after processing using any registered cookie definition.
    */
  val state: Dictionary[_] = js.native
  /**
    * The parsed request URI.
    */
  val url: URL = js.native
  /**
    * Returns `true` when the request is active and processing should continue and `false` when the
    *  request terminated early or completed its lifecycle. Useful when request processing is a
    * resource-intensive operation and should be terminated early if the request is no longer active
    * (e.g. client disconnected or aborted early).
    */
  def active(): Boolean = js.native
  def generateResponse(): ResponseObject = js.native
  /**
    * Returns a response which you can pass into the reply interface where:
    * @param source - the value to set as the source of the reply interface, optional.
    * @param options - options for the method, optional.
    * @return ResponseObject
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestgenerateresponsesource-options)
    */
  /* tslint:disable-next-line:max-line-length */
  def generateResponse(source: String): ResponseObject = js.native
  def generateResponse(source: String, options: Anon_Close): ResponseObject = js.native
  def generateResponse(source: js.Object): ResponseObject = js.native
  def generateResponse(source: js.Object, options: Anon_Close): ResponseObject = js.native
  def generateResponse(source: Null, options: Anon_Close): ResponseObject = js.native
  /**
    * Logs request-specific events. When called, the server emits a 'request' event which can be used by other listeners or plugins. The arguments are:
    * @param tags - a string or an array of strings (e.g. ['error', 'database', 'read']) used to identify the event. Tags are used instead of log levels and provide a much more expressive mechanism
    *     for describing and filtering events.
    * @param data - (optional) an message string or object with the application data being logged. If data is a function, the function signature is function() and it called once to generate (return
    *     value) the actual data emitted to the listeners. Any logs generated by the server internally will be emitted only on the 'request-internal' channel and will include the event.internal flag
    *     set to true.
    * @return void
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestlogtags-data)
    */
  def log(tags: String): Unit = js.native
  def log(tags: String, data: String): Unit = js.native
  def log(tags: String, data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: String, data: js.Object): Unit = js.native
  def log(tags: js.Array[String]): Unit = js.native
  def log(tags: js.Array[String], data: String): Unit = js.native
  def log(tags: js.Array[String], data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: js.Array[String], data: js.Object): Unit = js.native
  /**
    * Changes the request method before the router begins processing the request where:
    * @param method - is the request HTTP method (e.g. 'GET').
    * @return void
    * Can only be called from an 'onRequest' extension method.
    * [See docs](https://hapijs.com/api/17.0.1#-requestsetmethodmethod)
    */
  def setMethod(method: HTTP_METHODS_PARTIAL): Unit = js.native
  /**
    * Changes the request URI before the router begins processing the request where:
    * Can only be called from an 'onRequest' extension method.
    * @param url - the new request URI. If url is a string, it is parsed with node's URL parse() method with parseQueryString set to true. url can also be set to an object compatible with node's URL
    *     parse() method output.
    * @param stripTrailingSlash - if true, strip the trailing slash from the path. Defaults to false.
    * @return void
    * [See docs](https://hapijs.com/api/17.0.1#-requestseturlurl-striptrailingslash)
    */
  def setUrl(url: String): Unit = js.native
  def setUrl(url: String, stripTrailingSlash: Boolean): Unit = js.native
  def setUrl(url: URL): Unit = js.native
  def setUrl(url: URL, stripTrailingSlash: Boolean): Unit = js.native
}

