package typings.hapi.hapiMod

import typings.hapi.Anon_Collect
import typings.hapi.Anon_FailAction
import typings.hapi.Anon_RelativeTo
import typings.hapi.Anon_Server
import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiMod.Json.StringifyArguments
import typings.hapi.hapiMod.Lifecycle.Method
import typings.hapi.hapiMod.Util.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  /**
    * Application-specific route configuration state. Should not be used by plugins which should use options.plugins[name] instead.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var app: js.UndefOr[RouteOptionsApp] = js.undefined
  /**
    * Route authentication configuration. Value can be:
    * false to disable authentication if a default strategy is set.
    * a string with the name of an authentication strategy registered with server.auth.strategy(). The strategy will be set to 'required' mode.
    * an authentication configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var auth: js.UndefOr[`false` | String | RouteOptionsAccess] = js.undefined
  /**
    * Default value: null.
    * An object passed back to the provided handler (via this) when called. Ignored if the method is an arrow function.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsbind)
    */
  var bind: js.UndefOr[js.Object | Null] = js.undefined
  /**
    * Default value: { privacy: 'default', statuses: [200], otherwise: 'no-cache' }.
    * If the route method is 'GET', the route can be configured to include HTTP caching directives in the response. Caching can be customized using an object with the following options:
    * privacy - determines the privacy flag included in client-side caching using the 'Cache-Control' header. Values are:
    * * * 'default' - no privacy flag.
    * * * 'public' - mark the response as suitable for public caching.
    * * * 'private' - mark the response as suitable only for private caching.
    * * expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt.
    * * expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records for the route expire. Cannot be used together with expiresIn.
    * * statuses - an array of HTTP response status code numbers (e.g. 200) which are allowed to include a valid caching directive.
    * * otherwise - a string with the value of the 'Cache-Control' header when caching is disabled.
    * The default Cache-Control: no-cache header can be disabled by setting cache to false.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionscache)
    */
  var cache: js.UndefOr[`false` | RouteOptionsCache] = js.undefined
  /**
    * An object where each key is a content-encoding name and each value is an object with the desired encoder settings. Note that decoder settings are set in compression.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionscompression)
    */
  var compression: js.UndefOr[Dictionary[RouteCompressionEncoderSettings]] = js.undefined
  /**
    * Default value: false (no CORS headers).
    * The Cross-Origin Resource Sharing protocol allows browsers to make cross-origin API calls. CORS is required by web applications running inside a browser which are loaded from a different
    * domain than the API server. To enable, set cors to true, or to an object with the following options:
    * * origin - an array of allowed origin servers strings ('Access-Control-Allow-Origin'). The array can contain any combination of fully qualified origins along with origin strings containing a
    * wildcard '*' character, or a single '*' origin string. If set to 'ignore', any incoming Origin header is ignored (present or not) and the 'Access-Control-Allow-Origin' header is set to '*'.
    * Defaults to any origin ['*'].
    * * maxAge - number of seconds the browser should cache the CORS response ('Access-Control-Max-Age'). The greater the value, the longer it will take before the browser checks for changes in
    * policy. Defaults to 86400 (one day).
    * * headers - a strings array of allowed headers ('Access-Control-Allow-Headers'). Defaults to ['Accept', 'Authorization', 'Content-Type', 'If-None-Match'].
    * * additionalHeaders - a strings array of additional headers to headers. Use this to keep the default headers in place.
    * * exposedHeaders - a strings array of exposed headers ('Access-Control-Expose-Headers'). Defaults to ['WWW-Authenticate', 'Server-Authorization'].
    * * additionalExposedHeaders - a strings array of additional headers to exposedHeaders. Use this to keep the default headers in place.
    * * credentials - if true, allows user credentials to be sent ('Access-Control-Allow-Credentials'). Defaults to false.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionscors)
    */
  var cors: js.UndefOr[Boolean | RouteOptionsCors] = js.undefined
  /**
    * Default value: none.
    * Route description used for generating documentation (string).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsdescription)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Default value: none.
    * Route-level request extension points by setting the option to an object with a key for each of the desired extension points ('onRequest' is not allowed), and the value is the same as the
    * server.ext(events) event argument.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsext)
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#request-lifecycle)
    */
  var ext: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hapi.hapi.RouteRequestExtType ]:? hapi.hapi.RouteExtObject | std.Array<hapi.hapi.RouteExtObject>}
    */ typings.hapi.hapiStrings.RouteOptions with js.Any
  ] = js.undefined
  /**
    * Default value: { relativeTo: '.' }.
    * Defines the behavior for accessing files:
    * * relativeTo - determines the folder relative paths are resolved against.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsfiles)
    */
  var files: js.UndefOr[Anon_RelativeTo] = js.undefined
  /**
    * Default value: none.
    * The route handler function performs the main business logic of the route and sets the response. handler can be assigned:
    * * a lifecycle method.
    * * an object with a single property using the name of a handler type registred with the server.handler() method. The matching property value is passed as options to the registered handler
    * generator. Note: handlers using a fat arrow style function cannot be bound to any bind property. Instead, the bound context is available under h.context.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionshandler)
    */
  var handler: js.UndefOr[Method | js.Object] = js.undefined
  /**
    * Default value: none.
    * An optional unique identifier used to look up the route using server.lookup(). Cannot be assigned to routes added with an array of methods.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsid)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Default value: false.
    * If true, the route cannot be accessed through the HTTP listener but only through the server.inject() interface with the allowInternals option set to true. Used for internal routes that should
    * not be accessible to the outside world.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsisinternal)
    */
  var isInternal: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value: none.
    * Optional arguments passed to JSON.stringify() when converting an object or error response to a string payload or escaping it after stringification. Supports the following:
    * * replacer - the replacer function or array. Defaults to no action.
    * * space - number of spaces to indent nested object keys. Defaults to no indentation.
    * * suffix - string suffix added after conversion to JSON string. Defaults to no suffix.
    * * escape - calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
    */
  var json: js.UndefOr[StringifyArguments] = js.undefined
  /**
    * Default value: none.
    * Enables JSONP support by setting the value to the query parameter name containing the function name used to wrap the response payload.
    * For example, if the value is 'callback', a request comes in with 'callback=me', and the JSON response is '{ "a":"b" }', the payload will be 'me({ "a":"b" });'. Cannot be used with stream
    * responses. The 'Content-Type' response header is set to 'text/javascript' and the 'X-Content-Type-Options' response header is set to 'nosniff', and will override those headers even if
    * explicitly set by response.type().
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjsonp)
    */
  var jsonp: js.UndefOr[String] = js.undefined
  /**
    * Default value: { collect: false }.
    * Request logging options:
    * collect - if true, request-level logs (both internal and application) are collected and accessible via request.logs.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionslog)
    */
  var log: js.UndefOr[Anon_Collect] = js.undefined
  /**
    * Default value: none.
    * Route notes used for generating documentation (string or array of strings).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsnotes)
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Determines how the request payload is processed.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayload)
    */
  var payload: js.UndefOr[RouteOptionsPayload] = js.undefined
  /**
    * Default value: {}.
    * Plugin-specific configuration. plugins is an object where each key is a plugin name and the value is the plugin configuration.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsplugins)
    */
  var plugins: js.UndefOr[PluginSpecificConfiguration] = js.undefined
  /**
    * Default value: none.
    * The pre option allows defining methods for performing actions before the handler is called. These methods allow breaking the handler logic into smaller, reusable components that can be shared
    * ascross routes, as well as provide a cleaner error handling of prerequisite operations (e.g. load required reference data from a database). pre is assigned an ordered array of methods which
    * are called serially in order. If the pre array contains another array of methods as one of its elements, those methods are called in parallel. Note that during parallel execution, if any of
    * the methods error, return a takeover response, or abort signal, the other parallel methods will continue to execute but will be ignored once completed. pre can be assigned a mixed array of:
    * * an array containing the elements listed below, which are executed in parallel.
    * * an object with:
    * * * method - a lifecycle method.
    * * * assign - key name used to assign the response of the method to in request.pre and request.preResponses.
    * * * failAction - A failAction value which determine what to do when a pre-handler method throws an error. If assign is specified and the failAction setting is not 'error', the error will be
    * assigned.
    * * a method function - same as including an object with a single method key.
    * Note that pre-handler methods do not behave the same way other lifecycle methods do when a value is returned. Instead of the return value becoming the new response payload, the value is used
    * to assign the corresponding request.pre and request.preResponses properties. Otherwise, the handling of errors, takeover response response, or abort signal behave the same as any other
    * lifecycle methods.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspre)
    */
  var pre: js.UndefOr[RouteOptionsPreArray] = js.undefined
  /**
    * Processing rules for the outgoing response.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponse)
    */
  var response: js.UndefOr[RouteOptionsResponse] = js.undefined
  /**
    * Default value: false (security headers disabled).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionssecurity)
    */
  var security: js.UndefOr[RouteOptionsSecure] = js.undefined
  /**
    * Default value: { parse: true, failAction: 'error' }.
    * HTTP state management (cookies) allows the server to store information on the client which is sent back to the server with every request (as defined in RFC 6265). state supports the following
    * options: parse - determines if incoming 'Cookie' headers are parsed and stored in the request.state object. failAction - A failAction value which determines how to handle cookie parsing
    * errors. Defaults to 'error' (return a Bad Request (400) error response).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsstate)
    */
  var state: js.UndefOr[Anon_FailAction] = js.undefined
  /**
    * Default value: none.
    * Route tags used for generating documentation (array of strings).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionstags)
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default value: { server: false }.
    * Timeouts for processing durations.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionstimeout)
    */
  var timeout: js.UndefOr[Anon_Server] = js.undefined
  /**
    * Default value: { headers: true, params: true, query: true, payload: true, failAction: 'error' }.
    * Request input validation rules for various request components.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidate)
    */
  var validate: js.UndefOr[RouteOptionsValidate] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    app: RouteOptionsApp = null,
    auth: `false` | String | RouteOptionsAccess = null,
    bind: js.Object = null,
    cache: `false` | RouteOptionsCache = null,
    compression: Dictionary[RouteCompressionEncoderSettings] = null,
    cors: Boolean | RouteOptionsCors = null,
    description: String = null,
    ext: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hapi.hapi.RouteRequestExtType ]:? hapi.hapi.RouteExtObject | std.Array<hapi.hapi.RouteExtObject>}
    */ typings.hapi.hapiStrings.RouteOptions with js.Any = null,
    files: Anon_RelativeTo = null,
    handler: Method | js.Object = null,
    id: String = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    json: StringifyArguments = null,
    jsonp: String = null,
    log: Anon_Collect = null,
    notes: String | js.Array[String] = null,
    payload: RouteOptionsPayload = null,
    plugins: PluginSpecificConfiguration = null,
    pre: RouteOptionsPreArray = null,
    response: RouteOptionsResponse = null,
    security: RouteOptionsSecure = null,
    state: Anon_FailAction = null,
    tags: js.Array[String] = null,
    timeout: Anon_Server = null,
    validate: RouteOptionsValidate = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

