package typings.koaRouter

import org.scalablytyped.runtime.StringDictionary
import typings.accepts.mod.Accepts
import typings.contentDisposition.mod.Options
import typings.cookies.mod.Cookies
import typings.koa.anon.Body
import typings.koa.anon.FnCall
import typings.koa.mod.Application
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.ParameterizedContext
import typings.koa.mod.Request
import typings.koa.mod.Response
import typings.koaRouter.koaRouterBooleans.`false`
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-router", JSImport.Namespace)
  @js.native
  /**
    * Create a new router.
    */
  open class ^[StateT, CustomT] ()
    extends StObject
       with Router[StateT, CustomT] {
    def this(opt: IRouterOptions) = this()
  }
  @JSImport("koa-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koa-router", "Layer")
  @js.native
  open class Layer protected () extends StObject {
    def this(path: String, methods: js.Array[String], middleware: js.Array[IMiddleware[Any, js.Object]]) = this()
    def this(path: String, methods: js.Array[String], middleware: IMiddleware[Any, js.Object]) = this()
    def this(path: js.RegExp, methods: js.Array[String], middleware: js.Array[IMiddleware[Any, js.Object]]) = this()
    def this(path: js.RegExp, methods: js.Array[String], middleware: IMiddleware[Any, js.Object]) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[Any, js.Object]],
      opts: ILayerOptions
    ) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: IMiddleware[Any, js.Object],
      opts: ILayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[Any, js.Object]],
      opts: ILayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: IMiddleware[Any, js.Object],
      opts: ILayerOptions
    ) = this()
    
    /**
      * Returns array of regexp url path captures.
      */
    def captures(path: String): js.Array[String] = js.native
    
    /**
      * Returns whether request `path` matches route.
      */
    def `match`(path: String): Boolean = js.native
    
    var methods: js.Array[String] = js.native
    
    var name: String = js.native
    
    var opts: ILayerOptions = js.native
    
    /**
      * Run validations on route named parameters.
      */
    def param(param: String, fn: IMiddleware[Any, js.Object]): Layer = js.native
    
    var paramNames: js.Array[ParamName] = js.native
    
    /**
      * Returns map of URL parameters for given `path` and `paramNames`.
      */
    def params(path: String, captures: js.Array[String]): js.Object = js.native
    def params(path: String, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    def params(path: js.RegExp, captures: js.Array[String]): js.Object = js.native
    def params(path: js.RegExp, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    
    var path: String = js.native
    
    var regexp: js.RegExp = js.native
    
    /**
      * Prefix route path.
      */
    def setPrefix(prefix: String): Layer = js.native
    
    var stack: js.Array[IMiddleware[Any, js.Object]] = js.native
    
    /**
      * Generate URL for route using given `params`.
      */
    def url(params: js.Object): String = js.native
  }
  
  @JSImport("koa-router", "ParamName")
  @js.native
  open class ParamName () extends StObject {
    
    var asterisk: Boolean = js.native
    
    var delimiter: String = js.native
    
    var name: String = js.native
    
    var optional: Boolean = js.native
    
    var partial: Boolean = js.native
    
    var pattern: String = js.native
    
    var prefix: String = js.native
    
    var repeat: String = js.native
  }
  
  /**
    * Generate URL from url pattern and given `params`.
    */
  /* static member */
  inline def url(path: String, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def url(path: js.RegExp, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ILayerOptions extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCaptures: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ILayerOptions {
    
    inline def apply(name: String): ILayerOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILayerOptions]
    }
    
    extension [Self <: ILayerOptions](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIgnoreCaptures(value: Boolean): Self = StObject.set(x, "ignoreCaptures", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCapturesUndefined: Self = StObject.set(x, "ignoreCaptures", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type IMiddleware[StateT, CustomT] = Middleware[StateT, CustomT & (IRouterParamContext[StateT, CustomT]), Any]
  
  type IParamMiddleware[STateT, CustomT] = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[STateT, CustomT], 
    /* next */ js.Function0[js.Promise[Any]], 
    Any
  ]
  
  trait IRouterAllowedMethodsOptions extends StObject {
    
    /**
      * throw the returned value in place of the default MethodNotAllowed error
      */
    var methodNotAllowed: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * throw the returned value in place of the default NotImplemented error
      */
    var notImplemented: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * throw error instead of setting status and header
      */
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object IRouterAllowedMethodsOptions {
    
    inline def apply(): IRouterAllowedMethodsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRouterAllowedMethodsOptions]
    }
    
    extension [Self <: IRouterAllowedMethodsOptions](x: Self) {
      
      inline def setMethodNotAllowed(value: () => Any): Self = StObject.set(x, "methodNotAllowed", js.Any.fromFunction0(value))
      
      inline def setMethodNotAllowedUndefined: Self = StObject.set(x, "methodNotAllowed", js.undefined)
      
      inline def setNotImplemented(value: () => Any): Self = StObject.set(x, "notImplemented", js.Any.fromFunction0(value))
      
      inline def setNotImplementedUndefined: Self = StObject.set(x, "notImplemented", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  /* Inlined parent koa-router.koa-router.RouterContext<any, {}> */
  @js.native
  trait IRouterContext extends StObject {
    
    /**
      * Get WHATWG parsed URL object.
      */
    var URL: URL_ = js.native
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | js.RegExp] = js.native
    
    var _matchedRouteName: js.UndefOr[String] = js.native
    
    var accept: Accepts = js.native
    
    /**
      * Check if the given `type(s)` is acceptable, returning
      * the best match when true, otherwise `false`, in which
      * case you should respond with 406 "Not Acceptable".
      *
      * The `type` value may be a single mime type string
      * such as "application/json", the extension name
      * such as "json" or an array `["json", "html", "text/plain"]`. When a list
      * or array is given the _best_ match, if any is returned.
      *
      * Examples:
      *
      *     // Accept: text/html
      *     this.accepts('html');
      *     // => "html"
      *
      *     // Accept: text/ *, application/json
      *     this.accepts('html');
      *     // => "html"
      *     this.accepts('text/html');
      *     // => "text/html"
      *     this.accepts('json', 'text');
      *     // => "json"
      *     this.accepts('application/json');
      *     // => "application/json"
      *
      *     // Accept: text/ *, application/json
      *     this.accepts('image/png');
      *     this.accepts('png');
      *     // => undefined
      *
      *     // Accept: text/ *;q=.5, application/json
      *     this.accepts(['html', 'json']);
      *     this.accepts('html', 'json');
      *     // => "json"
      */
    def accepts(): js.Array[String] = js.native
    def accepts(types: String*): String | `false` = js.native
    def accepts(types: js.Array[String]): String | `false` = js.native
    
    /**
      * Return accepted charsets or best fit based on `charsets`.
      *
      * Given `Accept-Charset: utf-8, iso-8859-1;q=0.2, utf-7;q=0.5`
      * an array sorted by quality is returned:
      *
      *     ['utf-8', 'utf-7', 'iso-8859-1']
      */
    def acceptsCharsets(): js.Array[String] = js.native
    def acceptsCharsets(charsets: String*): String | `false` = js.native
    def acceptsCharsets(charsets: js.Array[String]): String | `false` = js.native
    
    /**
      * Return accepted encodings or best fit based on `encodings`.
      *
      * Given `Accept-Encoding: gzip, deflate`
      * an array sorted by quality is returned:
      *
      *     ['gzip', 'deflate']
      */
    def acceptsEncodings(): js.Array[String] = js.native
    def acceptsEncodings(encodings: String*): String | `false` = js.native
    def acceptsEncodings(encodings: js.Array[String]): String | `false` = js.native
    
    /**
      * Return accepted languages or best fit based on `langs`.
      *
      * Given `Accept-Language: en;q=0.8, es, pt`
      * an array sorted by quality is returned:
      *
      *     ['es', 'pt', 'en']
      */
    def acceptsLanguages(): js.Array[String] = js.native
    def acceptsLanguages(langs: String*): String | `false` = js.native
    def acceptsLanguages(langs: js.Array[String]): String | `false` = js.native
    
    var app: Application[DefaultState, DefaultContext] = js.native
    
    /**
      * Append additional header `field` with value `val`.
      *
      * Examples:
      *
      * ```
      * this.append('Link', ['<http://localhost/>', '<http://localhost:3000/>']);
      * this.append('Set-Cookie', 'foo=bar; Path=/; HttpOnly');
      * this.append('Warning', '199 Miscellaneous warning');
      * ```
      */
    def append(field: String, `val`: String): Unit = js.native
    def append(field: String, `val`: js.Array[String]): Unit = js.native
    
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Double): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Double, msg: String): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Double, msg: String, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Double, msg: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Double, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Unit, msg: String): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Unit, msg: String, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Unit, msg: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: Any, status: Unit, opts: Record[String, Any]): /* asserts value */ Boolean = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    @JSName("assert")
    var assert_Original: FnCall = js.native
    
    /**
      * Set Content-Disposition to "attachment" to signal the client to prompt for download.
      * Optionally specify the filename of the download and some options.
      */
    def attachment(): Unit = js.native
    def attachment(filename: String): Unit = js.native
    def attachment(filename: String, options: Options): Unit = js.native
    def attachment(filename: Unit, options: Options): Unit = js.native
    
    /**
      * Get/Set response body.
      */
    var body: Any = js.native
    
    var cookies: Cookies = js.native
    
    /**
      * Get/Set the ETag of a response.
      * This will normalize the quotes if necessary.
      *
      *     this.response.etag = 'md5hashsum';
      *     this.response.etag = '"md5hashsum"';
      *     this.response.etag = 'W/"123456789"';
      *
      * @param {String} etag
      * @api public
      */
    var etag: String = js.native
    
    /**
      * Flush any set headers, and begin the body
      */
    def flushHeaders(): Unit = js.native
    
    /**
      * Check if the request is fresh, aka
      * Last-Modified and/or the ETag
      * still match.
      */
    var fresh: Boolean = js.native
    
    /**
      * Return request header. If the header is not set, will return an empty
      * string.
      *
      * The `Referrer` header field is special-cased, both `Referrer` and
      * `Referer` are interchangeable.
      *
      * Examples:
      *
      *     this.get('Content-Type');
      *     // => "text/plain"
      *
      *     this.get('content-type');
      *     // => "text/plain"
      *
      *     this.get('Something');
      *     // => ''
      */
    def get(field: String): String = js.native
    
    /**
      * Return request header.
      */
    var header: IncomingHttpHeaders = js.native
    
    /**
      * Check if a header has been written to the socket.
      */
    var headerSent: Boolean = js.native
    
    /**
      * Return request header, alias as request.header
      */
    var headers: IncomingHttpHeaders = js.native
    
    /**
      * Parse the "Host" header field host
      * and support X-Forwarded-Host when a
      * proxy is enabled.
      */
    var host: String = js.native
    
    /**
      * Parse the "Host" header field hostname
      * and support X-Forwarded-Host when a
      * proxy is enabled.
      */
    var hostname: String = js.native
    
    /**
      * Get full request URL.
      */
    var href: String = js.native
    
    /**
      * Check if the request is idempotent.
      */
    var idempotent: Boolean = js.native
    
    /**
      * util.inspect() implementation, which
      * just returns the JSON output.
      */
    def inspect(): Any = js.native
    
    /**
      * Request remote address. Supports X-Forwarded-For when app.proxy is true.
      */
    var ip: String = js.native
    
    /**
      * When `app.proxy` is `true`, parse
      * the "X-Forwarded-For" ip address list.
      *
      * For example if the value were "client, proxy1, proxy2"
      * you would receive the array `["client", "proxy1", "proxy2"]`
      * where "proxy2" is the furthest down-stream.
      */
    var ips: js.Array[String] = js.native
    
    /**
      * Check if the incoming request contains the "Content-Type"
      * header field, and it contains any of the give mime `type`s.
      * If there is no request body, `null` is returned.
      * If there is no content type, `false` is returned.
      * Otherwise, it returns the first `type` that matches.
      *
      * Examples:
      *
      *     // With Content-Type: text/html; charset=utf-8
      *     this.is('html'); // => 'html'
      *     this.is('text/html'); // => 'text/html'
      *     this.is('text/ *', 'application/json'); // => 'text/html'
      *
      *     // When Content-Type is application/json
      *     this.is('json', 'urlencoded'); // => 'json'
      *     this.is('application/json'); // => 'application/json'
      *     this.is('html', 'application/ *'); // => 'application/json'
      *
      *     this.is('html'); // => false
      */
    // is(): string | boolean;
    def is(types: String*): String | `false` | Null = js.native
    def is(types: js.Array[String]): String | `false` | Null = js.native
    
    /**
      * Get the Last-Modified date in Date form, if it exists.
      * Set the Last-Modified date using a string or a Date.
      *
      *     this.response.lastModified = new Date();
      *     this.response.lastModified = '2013-09-13';
      */
    var lastModified: js.Date = js.native
    
    /**
      * Return parsed response Content-Length when present.
      * Set Content-Length field to `n`.
      */
    var length: Double = js.native
    
    /**
      * Get response status message
      */
    var message: String = js.native
    
    /**
      * Get/Set request method.
      */
    var method: String = js.native
    
    /**
      * Default error handling.
      */
    def onerror(err: js.Error): Unit = js.native
    
    /**
      * Get origin of URL.
      */
    var origin: String = js.native
    
    var originalUrl: String = js.native
    
    /**
      * url params
      */
    var params: Record[String, String] = js.native
    
    /**
      * Get request pathname.
      * Set pathname, retaining the query-string when present.
      */
    var path: String = js.native
    
    /**
      * Return the protocol string "http" or "https"
      * when requested with TLS. When the proxy setting
      * is enabled the "X-Forwarded-Proto" header
      * field will be trusted. If you're running behind
      * a reverse proxy that supplies https for you this
      * may be enabled.
      */
    var protocol: String = js.native
    
    /**
      * Get parsed query-string.
      * Set query-string as an object.
      */
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any = js.native
    
    /**
      * Get/Set query string.
      */
    var querystring: String = js.native
    
    /**
      * Perform a 302 redirect to `url`.
      *
      * The string "back" is special-cased
      * to provide Referrer support, when Referrer
      * is not present `alt` or "/" is used.
      *
      * Examples:
      *
      *    this.redirect('back');
      *    this.redirect('back', '/index.html');
      *    this.redirect('/login');
      *    this.redirect('http://google.com');
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, alt: String): Unit = js.native
    
    /**
      * Remove header `field`.
      */
    def remove(field: String): Unit = js.native
    
    var req: IncomingMessage = js.native
    
    var request: Request = js.native
    
    var res: ServerResponse[IncomingMessage] = js.native
    
    /**
      * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
      */
    var respond: js.UndefOr[Boolean] = js.native
    
    var response: Body[Any] & Response = js.native
    
    /**
      * the router instance
      */
    var router: Router[Any, js.Object] = js.native
    
    /**
      * Get the search string. Same as the querystring
      * except it includes the leading ?.
      *
      * Set the search string. Same as
      * response.querystring= but included for ubiquity.
      */
    var search: String = js.native
    
    /**
      * Short-hand for:
      *
      *    this.protocol == 'https'
      */
    var secure: Boolean = js.native
    
    def set(field: String, `val`: String): Unit = js.native
    def set(field: String, `val`: js.Array[String]): Unit = js.native
    /**
      * Set header `field` to `val`, or pass
      * an object of header fields.
      *
      * Examples:
      *
      *    this.set('Foo', ['bar', 'baz']);
      *    this.set('Accept', 'application/json');
      *    this.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
      */
    def set(field: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    /**
      * Return the request socket.
      */
    var socket: Socket = js.native
    
    /**
      * Check if the request is stale, aka
      * "Last-Modified" and / or the "ETag" for the
      * resource has changed.
      */
    var stale: Boolean = js.native
    
    var state: Any = js.native
    
    /**
      * Get/Set response status code.
      */
    var status: Double = js.native
    
    /**
      * Return subdomains as an array.
      *
      * Subdomains are the dot-separated parts of the host before the main domain
      * of the app. By default, the domain of the app is assumed to be the last two
      * parts of the host. This can be changed by setting `app.subdomainOffset`.
      *
      * For example, if the domain is "tobi.ferrets.example.com":
      * If `app.subdomainOffset` is not set, this.subdomains is
      * `["ferrets", "tobi"]`.
      * If `app.subdomainOffset` is 3, this.subdomains is `["tobi"]`.
      */
    var subdomains: js.Array[String] = js.native
    
    /**
      * Throw an error with `msg` and optional `status`
      * defaulting to 500. Note that these are user-level
      * errors, and the message may be exposed to the client.
      *
      *    this.throw(403)
      *    this.throw('name required', 400)
      *    this.throw(400, 'name required')
      *    this.throw('something exploded')
      *    this.throw(new Error('invalid'), 400);
      *    this.throw(400, new Error('invalid'));
      *
      * See: https://github.com/jshttp/http-errors
      */
    def `throw`(message: String): scala.Nothing = js.native
    def `throw`(message: String, code: Double): scala.Nothing = js.native
    def `throw`(message: String, code: Double, properties: js.Object): scala.Nothing = js.native
    def `throw`(message: String, code: Unit, properties: js.Object): scala.Nothing = js.native
    def `throw`(properties: (Double | String | js.Object)*): scala.Nothing = js.native
    def `throw`(status: Double): scala.Nothing = js.native
    
    /**
      * Return JSON representation.
      *
      * Here we explicitly invoke .toJSON() on each
      * object, as iteration will otherwise fail due
      * to the getters and cause utilities such as
      * clone() to fail.
      */
    def toJSON(): Any = js.native
    
    /**
      * Return the response mime type void of
      * parameters such as "charset".
      *
      * Set Content-Type response header with `type` through `mime.lookup()`
      * when it does not contain a charset.
      *
      * Examples:
      *
      *     this.type = '.html';
      *     this.type = 'html';
      *     this.type = 'json';
      *     this.type = 'application/json';
      *     this.type = 'png';
      */
    var `type`: String = js.native
    
    /**
      * Get/Set request URL.
      */
    var url: String = js.native
    
    /**
      * Vary on `field`.
      */
    def vary(field: String): Unit = js.native
    
    /**
      * Checks if the request is writable.
      * Tests for the existence of the socket
      * as node sometimes does not set it.
      */
    var writable: Boolean = js.native
  }
  
  trait IRouterOptions extends StObject {
    
    /**
      * Methods which should be supported by the router.
      */
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Prefix for all routes.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    var routerPath: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not routing should be case-sensitive.
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not routes should matched strictly.
      *
      * If strict matching is enabled, the trailing slash is taken into
      * account when matching routes.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object IRouterOptions {
    
    inline def apply(): IRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRouterOptions]
    }
    
    extension [Self <: IRouterOptions](x: Self) {
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRouterPath(value: String): Self = StObject.set(x, "routerPath", value.asInstanceOf[js.Any])
      
      inline def setRouterPathUndefined: Self = StObject.set(x, "routerPath", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait IRouterParamContext[StateT, CustomT] extends StObject {
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | js.RegExp] = js.undefined
    
    var _matchedRouteName: js.UndefOr[String] = js.undefined
    
    /**
      * url params
      */
    var params: Record[String, String]
    
    /**
      * the router instance
      */
    var router: Router[StateT, CustomT]
  }
  object IRouterParamContext {
    
    inline def apply[StateT, CustomT](params: Record[String, String], router: Router[StateT, CustomT]): IRouterParamContext[StateT, CustomT] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRouterParamContext[StateT, CustomT]]
    }
    
    extension [Self <: IRouterParamContext[?, ?], StateT, CustomT](x: Self & (IRouterParamContext[StateT, CustomT])) {
      
      inline def setParams(value: Record[String, String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: Router[StateT, CustomT]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def set_matchedRoute(value: String | js.RegExp): Self = StObject.set(x, "_matchedRoute", value.asInstanceOf[js.Any])
      
      inline def set_matchedRouteName(value: String): Self = StObject.set(x, "_matchedRouteName", value.asInstanceOf[js.Any])
      
      inline def set_matchedRouteNameUndefined: Self = StObject.set(x, "_matchedRouteName", js.undefined)
      
      inline def set_matchedRouteUndefined: Self = StObject.set(x, "_matchedRoute", js.undefined)
    }
  }
  
  trait IRoutesMatch extends StObject {
    
    var path: js.Array[Layer]
    
    var pathAndMethod: js.Array[Layer]
    
    var route: Boolean
  }
  object IRoutesMatch {
    
    inline def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): IRoutesMatch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRoutesMatch]
    }
    
    extension [Self <: IRoutesMatch](x: Self) {
      
      inline def setPath(value: js.Array[Layer]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathAndMethod(value: js.Array[Layer]): Self = StObject.set(x, "pathAndMethod", value.asInstanceOf[js.Any])
      
      inline def setPathAndMethodVarargs(value: Layer*): Self = StObject.set(x, "pathAndMethod", js.Array(value*))
      
      inline def setPathVarargs(value: Layer*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRoute(value: Boolean): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUrlOptionsQuery extends StObject {
    
    var query: js.Object | String
  }
  object IUrlOptionsQuery {
    
    inline def apply(query: js.Object | String): IUrlOptionsQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUrlOptionsQuery]
    }
    
    extension [Self <: IUrlOptionsQuery](x: Self) {
      
      inline def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router[StateT, CustomT] extends StObject {
    
    /**
      * Register route with all methods.
      */
    def all(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Returns separate middleware for responding to `OPTIONS` requests with
      * an `Allow` header containing the allowed methods, as well as responding
      * with `405 Method Not Allowed` and `501 Not Implemented` as appropriate.
      */
    def allowedMethods(): IMiddleware[StateT, CustomT] = js.native
    def allowedMethods(options: IRouterAllowedMethodsOptions): IMiddleware[StateT, CustomT] = js.native
    
    /**
      * Alias for `router.delete()` because delete is a reserved word
      */
    def del(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP delete method
      */
    def delete(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP get method
      */
    def get(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP head method
      */
    def head(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP link method
      */
    def link(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Match given `path` and return corresponding routes.
      */
    def `match`(path: String, method: String): IRoutesMatch = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def middleware(): IMiddleware[StateT, CustomT] = js.native
    
    /**
      * HTTP options method
      */
    def options(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Run middleware for named route parameters. Useful for auto-loading or validation.
      */
    def param(param: String, middleware: IParamMiddleware[StateT, CustomT]): Router[StateT, CustomT] = js.native
    
    var params: js.Object = js.native
    
    /**
      * HTTP patch method
      */
    def patch(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP post method
      */
    def post(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Set the path prefix for a Router instance that was already initialized.
      */
    def prefix(prefix: String): Router[StateT, CustomT] = js.native
    
    /**
      * HTTP put method
      */
    def put(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Redirect `source` to `destination` URL with optional 30x status `code`.
      *
      * Both `source` and `destination` can be route names.
      */
    def redirect(source: String, destination: String): Router[StateT, CustomT] = js.native
    def redirect(source: String, destination: String, code: Double): Router[StateT, CustomT] = js.native
    
    def register(path: String, methods: js.Array[String], middleware: js.Array[IMiddleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[StateT, CustomT]],
      opts: ILayerOptions
    ): Layer = js.native
    /**
      * Create and register a route.
      */
    def register(path: String, methods: js.Array[String], middleware: IMiddleware[StateT, CustomT]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: IMiddleware[StateT, CustomT],
      opts: ILayerOptions
    ): Layer = js.native
    def register(path: js.RegExp, methods: js.Array[String], middleware: js.Array[IMiddleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[StateT, CustomT]],
      opts: ILayerOptions
    ): Layer = js.native
    def register(path: js.RegExp, methods: js.Array[String], middleware: IMiddleware[StateT, CustomT]): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: IMiddleware[StateT, CustomT],
      opts: ILayerOptions
    ): Layer = js.native
    
    def route(name: String): Boolean = js.native
    /**
      * Lookup route with given `name`.
      */
    @JSName("route")
    def route_Layer(name: String): Layer = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def routes(): IMiddleware[StateT, CustomT] = js.native
    
    var stack: js.Array[Layer] = js.native
    
    /**
      * HTTP unlink method
      */
    def unlink(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: String,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U, Any],
      routeHandler: IMiddleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Generate URL for route. Takes either map of named `params` or series of
      * arguments (for regular expression routes)
      *
      * router = new Router();
      * router.get('user', "/users/:id", ...
      *
      * router.url('user', { id: 3 });
      * // => "/users/3"
      *
      * Query can be generated from third argument:
      *
      * router.url('user', { id: 3 }, { query: { limit: 1 } });
      * // => "/users/3?limit=1"
      *
      * router.url('user', { id: 3 }, { query: "limit=1" });
      * // => "/users/3?limit=1"
      *
      */
    def url(name: String, params: Any): String = js.native
    def url(name: String, params: Any, options: IUrlOptionsQuery): String = js.native
    @JSName("url")
    def url_Error(name: String, params: Any): js.Error = js.native
    @JSName("url")
    def url_Error(name: String, params: Any, options: IUrlOptionsQuery): js.Error = js.native
    
    /**
      * Use given middleware.
      *
      * Middleware run in the order they are defined by `.use()`. They are invoked
      * sequentially, requests start at the first middleware and work their way
      * "down" the middleware stack.
      */
    def use(middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: js.Array[String], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  }
  
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT & (IRouterParamContext[StateT, CustomT]), Any]
}
