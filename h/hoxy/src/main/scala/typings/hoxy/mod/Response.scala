package typings.hoxy.mod

import typings.cheerio.CheerioAPI
import typings.hoxy.anon.PartialSlow
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.std.Record
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoxy", "Response")
@js.native
class Response protected () extends js.Object {
  /**
    * Response body parsed as DOM. This object is only present if you intercept
    * the response as:'$'. This is a cheerio object, which provides a jQuery-like
    * API. Changes made to it will be seen by the client.
    */
  @JSName("$")
  var $: js.UndefOr[ReturnType[CheerioAPI]] = js.native
  /**
    * Response body binary buffer. This is only present if you intercept the
    * response as:'buffer'. Changes made to this object will be seen by the client.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * HTTP response header name/value JS object. Header names are all-lowercase,
    * such as 'content-type'.
    */
  var headers: Record[String, String] = js.native
  /**
    * Response body parsed as JSON. This is only present if you intercept the
    * response as:'json'. Changes to this object will be seen by the client.
    */
  var json: js.UndefOr[js.Any] = js.native
  /**
    * HTTP status code being sent to the client.
    */
  var statusCode: Double = js.native
  /**
    * Response body string. This is only present if you intercept the response
    * as:'string'. Overwriting this will overwrite the response body sent to the
    * client.
    */
  var string: js.UndefOr[String] = js.native
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

