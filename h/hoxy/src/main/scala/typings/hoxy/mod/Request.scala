package typings.hoxy.mod

import typings.hoxy.anon.PartialSlow
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoxy", "Request")
@js.native
class Request protected () extends js.Object {
  /**
    * Request body binary buffer. This is only present if you intercept the
    * request as:'buffer'. Changes made to this object will be seen by the server.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * HTTP request header name/value JS object. These are all-lowercase, e.g. accept-encoding
    */
  var headers: Record[String, String] = js.native
  /**
    * Destination server hostname, sans port
    */
  var hostname: String = js.native
  /**
    * Request body parsed as JSON. This is only present if you intercept the
    * request as:'json'. Changes made to this object will be seen by the server.
    */
  var json: js.UndefOr[Record[String, _]] = js.native
  /**
    * All-caps HTTP method used. Lowercase values are converted to uppercase
    */
  var method: HttpMethod = js.native
  /**
    * Request body parsed as form-url-encoded params. This will be a key/value
    * object. This object will only present if you intercept the request
    * as:'params'. Changes made to this object will be seen by the server.
    *
    * Note: parameters from the URL querystring are not included in this object.
    */
  var params: js.UndefOr[Record[String, String]] = js.native
  /**
    * Destination server port
    */
  var port: Double = js.native
  /**
    * Protocol of the request
    */
  var protocol: String = js.native
  /**
    * An object representing querystring params in the URL.
    * For example if the URL is /foo/bar?baz=qux, then this
    * object will look like { baz: 'qux' }.
    */
  var query: Record[String, String] = js.native
  /**
    * Request body string. This is only present if you intercept the request
    * as:'string'. Overwriting this will overwrite the request body sent to
    * the server.
    */
  var string: js.UndefOr[String] = js.native
  /**
    * Root-relative request URL, including query string, like /foo/bar?baz=qux
    */
  var url: String = js.native
  /**
    * If url is provided, sets the request's absolute protocol, hostname, port and
    * url. Otherwise it returns the absolute URL of this request. This is mainly a
    * convenience method.
    */
  def fullUrl(): String = js.native
  def fullUrl(url: String): String = js.native
  /**
    * Simulates slowness during request phase. With this method you can set a minimum
    * latency and/or maximum transfer rate. Since these are minimum/maximum, if your
    * native connection is already slower than these values, this method will have no
    * effect.
    */
  def slow(opts: PartialSlow): Unit = js.native
  /**
    * Whatever request body gets sent to the server, tee() pipes an identical copy
    * to your writable stream. Your stream is held in memory, and only gets written
    * to if and when the request is sent to the server. In other words, your stream
    * sees whatever the server sees. If the server sees nothing, your stream sees
    * nothing. You can tee() as many times as you want.
    *
    * @param stream - target stream
    */
  def tee(stream: Writable): Unit = js.native
}

