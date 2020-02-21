package typings.koa.mod

import typings.node.netMod.Socket
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDelegatedRequest extends js.Object {
  /**
    * Get WHATWG parsed URL object.
    */
  var URL: URL_ = js.native
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
    * Get/Set request method.
    */
  var method: String = js.native
  /**
    * Get origin of URL.
    */
  var origin: String = js.native
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
    * Get/Set request URL.
    */
  var url: String = js.native
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
}

