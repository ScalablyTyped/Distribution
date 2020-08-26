package typings.i18nextExpressMiddleware.mod

import typings.expressServeStaticCore.mod.Application
import typings.expressServeStaticCore.mod.MediaType
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.i18next.mod.TFunction
import typings.i18next.mod.TFunctionKeys
import typings.i18next.mod.TFunctionResult
import typings.i18next.mod.TOptions
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareBooleans.`false`
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.`set-cookie`
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.close
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.data
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.end
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.error
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.pause
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.readable
import typings.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.resume
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.ReadableOptions
import typings.qs.mod.ParsedQs
import typings.rangeParser.mod.Options
import typings.rangeParser.mod.Ranges
import typings.rangeParser.mod.Result
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query> & {  language :string,   languages :std.Array<string>,   i18n :i18next.i18next.i18n,   t :i18next.i18next.TFunction} */
@js.native
trait I18NextRequest extends js.Object {
  var aborted: Boolean = js.native
  /**
    * Return an array of Accepted media types
    * ordered from highest quality to lowest.
    */
  var accepted: js.Array[MediaType] = js.native
  @JSName("app")
  var app_Original: Application = js.native
  var baseUrl: String = js.native
  //body: { username: string; password: string; remember: boolean; title: string; };
  var body: js.Any = js.native
  var complete: Boolean = js.native
  /**
    * @deprecate Use `socket` instead.
    */
  var connection: Socket = js.native
  //cookies: { string; remember: boolean; };
  var cookies: js.Any = js.native
  var destroyed: Boolean = js.native
  /**
    * Check if the request is fresh, aka
    * Last-Modified and/or the ETag
    * still match.
    */
  var fresh: Boolean = js.native
  var headers: IncomingHttpHeaders = js.native
  /**
    * @deprecated Use hostname instead.
    */
  var host: String = js.native
  /**
    * Parse the "Host" header field hostname.
    */
  var hostname: String = js.native
  var httpVersion: String = js.native
  var httpVersionMajor: Double = js.native
  var httpVersionMinor: Double = js.native
  var i18n: typings.i18next.mod.i18n = js.native
  /**
    * Return the remote address, or when
    * "trust proxy" is `true` return
    * the upstream addr.
    */
  var ip: String = js.native
  /**
    * When "trust proxy" is `true`, parse
    * the "X-Forwarded-For" ip address list.
    *
    * For example if the value were "client, proxy1, proxy2"
    * you would receive the array `["client", "proxy1", "proxy2"]`
    * where "proxy2" is the furthest down-stream.
    */
  var ips: js.Array[String] = js.native
  var language: String = js.native
  var languages: js.Array[String] = js.native
  var method: String = js.native
  var next: js.UndefOr[NextFunction] = js.native
  var originalUrl: String = js.native
  var params: ParamsDictionary = js.native
  /**
    * Short-hand for `url.parse(req.url).pathname`.
    */
  var path: String = js.native
  /**
    * Return the protocol string "http" or "https"
    * when requested with TLS. When the "trust proxy"
    * setting is enabled the "X-Forwarded-Proto" header
    * field will be trusted. If you're running behind
    * a reverse proxy that supplies https for you this
    * may be enabled.
    */
  var protocol: String = js.native
  var query: Query = js.native
  var rawHeaders: js.Array[String] = js.native
  var rawTrailers: js.Array[String] = js.native
  var readable: Boolean = js.native
  val readableEncoding: BufferEncoding | Null = js.native
  val readableEnded: Boolean = js.native
  val readableFlowing: Boolean | Null = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  /**
    * After middleware.init executed, Request will contain res and next properties
    * See: express/lib/middleware/init.js
    */
  var res: js.UndefOr[Response[_]] = js.native
  var route: js.Any = js.native
  /**
    * Short-hand for:
    *
    *    req.protocol == 'https'
    */
  var secure: Boolean = js.native
  var signedCookies: js.Any = js.native
  var socket: Socket = js.native
  /**
    * Check if the request is stale, aka
    * "Last-Modified" and / or the "ETag" for the
    * resource has changed.
    */
  var stale: Boolean = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Return subdomains as an array.
    *
    * Subdomains are the dot-separated parts of the host before the main domain of
    * the app. By default, the domain of the app is assumed to be the last two
    * parts of the host. This can be changed by setting "subdomain offset".
    *
    * For example, if the domain is "tobi.ferrets.example.com":
    * If "subdomain offset" is not set, req.subdomains is `["ferrets", "tobi"]`.
    * If "subdomain offset" is 3, req.subdomains is `["tobi"]`.
    */
  var subdomains: js.Array[String] = js.native
  @JSName("t")
  var t_Original: TFunction = js.native
  var trailers: Dict[String] = js.native
  var url: String = js.native
  /**
    * Check if the request was an _XMLHttpRequest_.
    */
  var xhr: Boolean = js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _read(size: Double): Unit = js.native
  /**
    * Check if the given `type(s)` is acceptable, returning
    * the best match when true, otherwise `undefined`, in which
    * case you should respond with 406 "Not Acceptable".
    *
    * The `type` value may be a single mime type string
    * such as "application/json", the extension name
    * such as "json", a comma-delimted list such as "json, html, text/plain",
    * or an array `["json", "html", "text/plain"]`. When a list
    * or array is given the _best_ match, if any is returned.
    *
    * Examples:
    *
    *     // Accept: text/html
    *     req.accepts('html');
    *     // => "html"
    *
    *     // Accept: text/ *, application/json
    *     req.accepts('html');
    *     // => "html"
    *     req.accepts('text/html');
    *     // => "text/html"
    *     req.accepts('json, text');
    *     // => "json"
    *     req.accepts('application/json');
    *     // => "application/json"
    *
    *     // Accept: text/ *, application/json
    *     req.accepts('image/png');
    *     req.accepts('png');
    *     // => undefined
    *
    *     // Accept: text/ *;q=.5, application/json
    *     req.accepts(['html', 'json']);
    *     req.accepts('html, json');
    *     // => "json"
    */
  def accepts(): js.Array[String] = js.native
  def accepts(`type`: String*): String | `false` = js.native
  def accepts(`type`: String): String | `false` = js.native
  def accepts(`type`: js.Array[String]): String | `false` = js.native
  /**
    * Returns the first accepted charset of the specified character sets,
    * based on the request's Accept-Charset HTTP header field.
    * If none of the specified charsets is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsCharsets(): js.Array[String] = js.native
  def acceptsCharsets(charset: String*): String | `false` = js.native
  def acceptsCharsets(charset: String): String | `false` = js.native
  def acceptsCharsets(charset: js.Array[String]): String | `false` = js.native
  /**
    * Returns the first accepted encoding of the specified encodings,
    * based on the request's Accept-Encoding HTTP header field.
    * If none of the specified encodings is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsEncodings(): js.Array[String] = js.native
  def acceptsEncodings(encoding: String*): String | `false` = js.native
  def acceptsEncodings(encoding: String): String | `false` = js.native
  def acceptsEncodings(encoding: js.Array[String]): String | `false` = js.native
  /**
    * Returns the first accepted language of the specified languages,
    * based on the request's Accept-Language HTTP header field.
    * If none of the specified languages is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsLanguages(): js.Array[String] = js.native
  def acceptsLanguages(lang: String*): String | `false` = js.native
  def acceptsLanguages(lang: String): String | `false` = js.native
  def acceptsLanguages(lang: js.Array[String]): String | `false` = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. data
    * 3. end
    * 4. error
    * 5. pause
    * 6. readable
    * 7. resume
    */
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_pause(event: pause): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("emit")
  def emit_resume(event: resume): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def get(name: String): js.UndefOr[String] = js.native
  def getMaxListeners(): Double = js.native
  /**
    * Return request header.
    *
    * The `Referrer` header field is special-cased,
    * both `Referrer` and `Referer` are interchangeable.
    *
    * Examples:
    *
    *     req.get('Content-Type');
    *     // => "text/plain"
    *
    *     req.get('content-type');
    *     // => "text/plain"
    *
    *     req.get('Something');
    *     // => undefined
    *
    * Aliased as `req.header()`.
    */
  @JSName("get")
  def get_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
  def header(name: String): js.UndefOr[String] = js.native
  @JSName("header")
  def header_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
  /**
    * Check if the incoming request contains the "Content-Type"
    * header field, and it contains the give mime `type`.
    *
    * Examples:
    *
    *      // With Content-Type: text/html; charset=utf-8
    *      req.is('html');
    *      req.is('text/html');
    *      req.is('text/ *');
    *      // => true
    *
    *      // When Content-Type is application/json
    *      req.is('json');
    *      req.is('application/json');
    *      req.is('application/ *');
    *      // => true
    *
    *      req.is('html');
    *      // => false
    */
  def is(`type`: String): String | `false` | Null = js.native
  def is(`type`: js.Array[String]): String | `false` | Null = js.native
  def isPaused(): Boolean = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @deprecated since 4.11 Use either req.params, req.body or req.query, as applicable.
    *
    * Return the value of param `name` when present or `defaultValue`.
    *
    *  - Checks route placeholders, ex: _/user/:id_
    *  - Checks body params, ex: id=12, {"id":12}
    *  - Checks query string params, ex: ?id=12
    *
    * To utilize request bodies, `req.body`
    * should be an object. This can be done by using
    * the `connect.bodyParser()` middleware.
    */
  def param(name: String): String = js.native
  def param(name: String, defaultValue: js.Any): String = js.native
  def pause(): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
  /**
    * Parse Range header field, capping to the given `size`.
    *
    * Unspecified ranges such as "0-" require knowledge of your resource length. In
    * the case of a byte range this is of course the total number of bytes.
    * If the Range header field is not given `undefined` is returned.
    * If the Range header field is given, return value is a result of range-parser.
    * See more ./types/range-parser/index.d.ts
    *
    * NOTE: remember that ranges are inclusive, so for example "Range: users=0-3"
    * should respond with 4 users when available, not 3.
    *
    */
  def range(size: Double): js.UndefOr[Ranges | Result] = js.native
  def range(size: Double, options: Options): js.UndefOr[Ranges | Result] = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def read(): js.Any = js.native
  def read(size: Double): js.Any = js.native
  @JSName("read")
  def read_Union(): String | Buffer = js.native
  @JSName("read")
  def read_Union(size: Double): String | Buffer = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  def resume(): this.type = js.native
  def setEncoding(encoding: BufferEncoding): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def setTimeout(msecs: Double): this.type = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
  // basic usage
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: js.UndefOr[scala.Nothing], options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: js.UndefOr[scala.Nothing], options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: js.UndefOr[scala.Nothing], options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](
    key: js.Array[TKeys],
    defaultValue: js.UndefOr[scala.Nothing],
    options: TOptions[TInterpolationMap]
  ): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
  def unpipe(): this.type = js.native
  def unpipe(destination: WritableStream): this.type = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  def unshift(chunk: Uint8Array): Unit = js.native
  def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}

