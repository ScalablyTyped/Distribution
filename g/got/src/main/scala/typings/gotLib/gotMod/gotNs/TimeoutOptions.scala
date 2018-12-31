package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties to constrain the duration of each phase of the request lifecycle.
  *
  * @see https://github.com/sindresorhus/got#timeout
  */
trait TimeoutOptions extends js.Object {
  /**
    * Starts when `lookup` completes (or when the socket is assigned if lookup does not apply
    * to the request) and ends when the socket is connected.
    */
  var connect: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when a socket is assigned and ends when the hostname has been resolved. Does not
    * apply when using a Unix domain socket.
    */
  var lookup: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when the request is initiated and ends when the response's end event fires.
    */
  var request: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when the request has been written to the socket and ends when the response headers
    * are received.
    */
  var response: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when `connect` completes and ends when the handshaking process completes (HTTPS
    * only).
    */
  var secureConnect: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when the socket is connected and ends with the request has been written to the
    * socket.
    */
  var send: js.UndefOr[scala.Double] = js.undefined
  /**
    * Starts when the socket is connected. See [request.setTimeout](https://nodejs.org/api/http.html#http_request_settimeout_timeout_callback).
    */
  var socket: js.UndefOr[scala.Double] = js.undefined
}

