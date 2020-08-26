package typings.hapiHapi.mod

import typings.hapiHapi.anon.Collect
import typings.hapiHapi.anon.FailAction
import typings.hapiHapi.anon.RelativeTo
import typings.hapiHapi.anon.Server
import typings.hapiHapi.anon.keyinRouteRequestExtTypeR
import typings.hapiHapi.hapiHapiBooleans.`false`
import typings.hapiHapi.mod.Json.StringifyArguments
import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Util.Dictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonRouteProperties extends js.Object {
  /**
    * Application-specific route configuration state. Should not be used by plugins which should use options.plugins[name] instead.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var app: js.UndefOr[RouteOptionsApp] = js.native
  /**
    * @default null.
    * An object passed back to the provided handler (via this) when called. Ignored if the method is an arrow function.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsbind)
    */
  var bind: js.UndefOr[js.Object | Null] = js.native
  /**
    * @default { privacy: 'default', statuses: [200], otherwise: 'no-cache' }.
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
  var cache: js.UndefOr[`false` | RouteOptionsCache] = js.native
  /**
    * An object where each key is a content-encoding name and each value is an object with the desired encoder settings. Note that decoder settings are set in compression.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionscompression)
    */
  var compression: js.UndefOr[Dictionary[RouteCompressionEncoderSettings]] = js.native
  /**
    * @default false (no CORS headers).
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
  var cors: js.UndefOr[Boolean | RouteOptionsCors] = js.native
  /**
    * @default none.
    * Route description used for generating documentation (string).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsdescription)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * @default none.
    * Route-level request extension points by setting the option to an object with a key for each of the desired extension points ('onRequest' is not allowed), and the value is the same as the
    * server.ext(events) event argument.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsext)
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#request-lifecycle)
    */
  var ext: js.UndefOr[keyinRouteRequestExtTypeR] = js.native
  /**
    * @default { relativeTo: '.' }.
    * Defines the behavior for accessing files:
    * * relativeTo - determines the folder relative paths are resolved against.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsfiles)
    */
  var files: js.UndefOr[RelativeTo] = js.native
  /**
    * @default none.
    * The route handler function performs the main business logic of the route and sets the response. handler can be assigned:
    * * a lifecycle method.
    * * an object with a single property using the name of a handler type registred with the server.handler() method. The matching property value is passed as options to the registered handler
    * generator. Note: handlers using a fat arrow style function cannot be bound to any bind property. Instead, the bound context is available under h.context.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionshandler)
    */
  var handler: js.UndefOr[Method | js.Object] = js.native
  /**
    * @default none.
    * An optional unique identifier used to look up the route using server.lookup(). Cannot be assigned to routes added with an array of methods.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsid)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * @default false.
    * If true, the route cannot be accessed through the HTTP listener but only through the server.inject() interface with the allowInternals option set to true. Used for internal routes that should
    * not be accessible to the outside world.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsisinternal)
    */
  var isInternal: js.UndefOr[Boolean] = js.native
  /**
    * @default none.
    * Optional arguments passed to JSON.stringify() when converting an object or error response to a string payload or escaping it after stringification. Supports the following:
    * * replacer - the replacer function or array. Defaults to no action.
    * * space - number of spaces to indent nested object keys. Defaults to no indentation.
    * * suffix - string suffix added after conversion to JSON string. Defaults to no suffix.
    * * escape - calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
    */
  var json: js.UndefOr[StringifyArguments] = js.native
  /**
    * @default none.
    * Enables JSONP support by setting the value to the query parameter name containing the function name used to wrap the response payload.
    * For example, if the value is 'callback', a request comes in with 'callback=me', and the JSON response is '{ "a":"b" }', the payload will be 'me({ "a":"b" });'. Cannot be used with stream
    * responses. The 'Content-Type' response header is set to 'text/javascript' and the 'X-Content-Type-Options' response header is set to 'nosniff', and will override those headers even if
    * explicitly set by response.type().
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjsonp)
    */
  var jsonp: js.UndefOr[String] = js.native
  /**
    * @default { collect: false }.
    * Request logging options:
    * collect - if true, request-level logs (both internal and application) are collected and accessible via request.logs.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionslog)
    */
  var log: js.UndefOr[Collect] = js.native
  /**
    * @default none.
    * Route notes used for generating documentation (string or array of strings).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsnotes)
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Determines how the request payload is processed.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayload)
    */
  var payload: js.UndefOr[RouteOptionsPayload] = js.native
  /**
    * @default {}.
    * Plugin-specific configuration. plugins is an object where each key is a plugin name and the value is the plugin configuration.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsplugins)
    */
  var plugins: js.UndefOr[PluginSpecificConfiguration] = js.native
  /**
    * @default none.
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
  var pre: js.UndefOr[RouteOptionsPreArray] = js.native
  /**
    * Processing rules for the outgoing response.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponse)
    */
  var response: js.UndefOr[RouteOptionsResponse] = js.native
  /**
    * @default false (security headers disabled).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionssecurity)
    */
  var security: js.UndefOr[RouteOptionsSecure] = js.native
  /**
    * @default { parse: true, failAction: 'error' }.
    * HTTP state management (cookies) allows the server to store information on the client which is sent back to the server with every request (as defined in RFC 6265). state supports the following
    * options: parse - determines if incoming 'Cookie' headers are parsed and stored in the request.state object. failAction - A failAction value which determines how to handle cookie parsing
    * errors. Defaults to 'error' (return a Bad Request (400) error response).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsstate)
    */
  var state: js.UndefOr[FailAction] = js.native
  /**
    * @default none.
    * Route tags used for generating documentation (array of strings).
    * This setting is not available when setting server route defaults using server.options.routes.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionstags)
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default { server: false }.
    * Timeouts for processing durations.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionstimeout)
    */
  var timeout: js.UndefOr[Server] = js.native
  /**
    * @default { headers: true, params: true, query: true, payload: true, failAction: 'error' }.
    * Request input validation rules for various request components.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidate)
    */
  var validate: js.UndefOr[RouteOptionsValidate] = js.native
}

object CommonRouteProperties {
  @scala.inline
  def apply(): CommonRouteProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonRouteProperties]
  }
  @scala.inline
  implicit class CommonRoutePropertiesOps[Self <: CommonRouteProperties] (val x: Self) extends AnyVal {
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
    def setApp(value: RouteOptionsApp): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setBind(value: js.Object): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setBindNull: Self = this.set("bind", null)
    @scala.inline
    def setCache(value: `false` | RouteOptionsCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCompression(value: Dictionary[RouteCompressionEncoderSettings]): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCors(value: Boolean | RouteOptionsCors): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExt(value: keyinRouteRequestExtTypeR): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setFiles(value: RelativeTo): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setHandlerFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = this.set("handler", js.Any.fromFunction3(value))
    @scala.inline
    def setHandler(value: Method | js.Object): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsInternal(value: Boolean): Self = this.set("isInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInternal: Self = this.set("isInternal", js.undefined)
    @scala.inline
    def setJson(value: StringifyArguments): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setJsonp(value: String): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setLog(value: Collect): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setNotesVarargs(value: String*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: String | js.Array[String]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPayload(value: RouteOptionsPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPlugins(value: PluginSpecificConfiguration): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPreVarargs(value: RouteOptionsPreAllOptions*): Self = this.set("pre", js.Array(value :_*))
    @scala.inline
    def setPre(value: RouteOptionsPreArray): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setResponse(value: RouteOptionsResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setSecurity(value: RouteOptionsSecure): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setState(value: FailAction): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeout(value: Server): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setValidate(value: RouteOptionsValidate): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

