package typings.koaRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.accepts.mod.Accepts
import typings.contentDisposition.mod.Options
import typings.cookies.mod.Cookies
import typings.koa.anon.Call
import typings.koa.mod.Application
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Request
import typings.koa.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.urlMod.URL_
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent koa-router.koa-router.RouterContext<any, {}> */
@js.native
trait IRouterContext extends js.Object {
  /**
    * Get WHATWG parsed URL object.
    */
  var URL: URL_ = js.native
  /**
    * Matched route
    */
  var _matchedRoute: js.UndefOr[String | RegExp] = js.native
  var _matchedRouteName: js.UndefOr[String] = js.native
  var accept: Accepts = js.native
  var app: Application[DefaultState, DefaultContext] = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  @JSName("assert")
  var assert_Original: Call = js.native
  /**
    * Get/Set response body.
    */
  var body: js.Any = js.native
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
    * Check if the request is fresh, aka
    * Last-Modified and/or the ETag
    * still match.
    */
  var fresh: Boolean = js.native
  /**
    * Return request header.
    */
  var header: js.Any = js.native
  /**
    * Check if a header has been written to the socket.
    */
  var headerSent: Boolean = js.native
  /**
    * Return request header, alias as request.header
    */
  var headers: js.Any = js.native
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
    * Get the Last-Modified date in Date form, if it exists.
    * Set the Last-Modified date using a string or a Date.
    *
    *     this.response.lastModified = new Date();
    *     this.response.lastModified = '2013-09-13';
    */
  var lastModified: Date = js.native
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
    * Get origin of URL.
    */
  var origin: String = js.native
  var originalUrl: String = js.native
  /**
    * url params
    */
  var params: js.Any = js.native
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
  var query: js.Any = js.native
  /**
    * Get/Set query string.
    */
  var querystring: String = js.native
  var req: IncomingMessage = js.native
  var request: Request = js.native
  var res: ServerResponse = js.native
  /**
    * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
    */
  var respond: js.UndefOr[Boolean] = js.native
  var response: Response = js.native
  /**
    * the router instance
    */
  var router: Router[_, js.Object] = js.native
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
  var state: js.Any = js.native
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
    * Checks if the request is writable.
    * Tests for the existence of the socket
    * as node sometimes does not set it.
    */
  var writable: Boolean = js.native
  /**
    * Check if the given `type(s)` is acceptable, returning
    * the best match when true, otherwise `undefined`, in which
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
  def accepts(): js.Array[String] | Boolean = js.native
  def accepts(types: String*): String | Boolean = js.native
  def accepts(types: js.Array[String]): String | Boolean = js.native
  /**
    * Return accepted charsets or best fit based on `charsets`.
    *
    * Given `Accept-Charset: utf-8, iso-8859-1;q=0.2, utf-7;q=0.5`
    * an array sorted by quality is returned:
    *
    *     ['utf-8', 'utf-7', 'iso-8859-1']
    */
  def acceptsCharsets(): js.Array[String] | Boolean = js.native
  def acceptsCharsets(charsets: String*): String | Boolean = js.native
  def acceptsCharsets(charsets: js.Array[String]): String | Boolean = js.native
  /**
    * Return accepted encodings or best fit based on `encodings`.
    *
    * Given `Accept-Encoding: gzip, deflate`
    * an array sorted by quality is returned:
    *
    *     ['gzip', 'deflate']
    */
  def acceptsEncodings(): js.Array[String] | Boolean = js.native
  def acceptsEncodings(encodings: String*): String | Boolean = js.native
  def acceptsEncodings(encodings: js.Array[String]): String | Boolean = js.native
  /**
    * Return accepted languages or best fit based on `langs`.
    *
    * Given `Accept-Language: en;q=0.8, es, pt`
    * an array sorted by quality is returned:
    *
    *     ['es', 'pt', 'en']
    */
  def acceptsLanguages(): js.Array[String] | Boolean = js.native
  def acceptsLanguages(langs: String*): String | Boolean = js.native
  def acceptsLanguages(langs: js.Array[String]): String | Boolean = js.native
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
  def assert(value: js.Any): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, msg: String): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, opts: js.Object): Unit = js.native
  /**
    * Set Content-Disposition to "attachment" to signal the client to prompt for download.
    * Optionally specify the filename of the download and some options.
    */
  def attachment(): Unit = js.native
  def attachment(filename: String): Unit = js.native
  def attachment(filename: String, options: Options): Unit = js.native
  /**
    * Flush any set headers, and begin the body
    */
  def flushHeaders(): Unit = js.native
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
    * util.inspect() implementation, which
    * just returns the JSON output.
    */
  def inspect(): js.Any = js.native
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
  def is(types: String*): String | Boolean = js.native
  def is(types: js.Array[String]): String | Boolean = js.native
  /**
    * Default error handling.
    */
  def onerror(err: Error): Unit = js.native
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
  def set(field: StringDictionary[String]): Unit = js.native
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
  def toJSON(): js.Any = js.native
  /**
    * Vary on `field`.
    */
  def vary(field: String): Unit = js.native
}

