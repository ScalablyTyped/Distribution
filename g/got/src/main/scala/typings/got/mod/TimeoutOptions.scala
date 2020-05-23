package typings.got.mod

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
  var connect: js.UndefOr[Double] = js.undefined
  /**
    * Starts when a socket is assigned and ends when the hostname has been resolved. Does not
    * apply when using a Unix domain socket.
    */
  var lookup: js.UndefOr[Double] = js.undefined
  /**
    * Starts when the request is initiated and ends when the response's end event fires.
    */
  var request: js.UndefOr[Double] = js.undefined
  /**
    * Starts when the request has been written to the socket and ends when the response headers
    * are received.
    */
  var response: js.UndefOr[Double] = js.undefined
  /**
    * Starts when `connect` completes and ends when the handshaking process completes (HTTPS
    * only).
    */
  var secureConnect: js.UndefOr[Double] = js.undefined
  /**
    * Starts when the socket is connected and ends with the request has been written to the
    * socket.
    */
  var send: js.UndefOr[Double] = js.undefined
  /**
    * Starts when the socket is connected. See [request.setTimeout](https://nodejs.org/api/http.html#http_request_settimeout_timeout_callback).
    */
  var socket: js.UndefOr[Double] = js.undefined
}

object TimeoutOptions {
  @scala.inline
  def apply(
    connect: js.UndefOr[Double] = js.undefined,
    lookup: js.UndefOr[Double] = js.undefined,
    request: js.UndefOr[Double] = js.undefined,
    response: js.UndefOr[Double] = js.undefined,
    secureConnect: js.UndefOr[Double] = js.undefined,
    send: js.UndefOr[Double] = js.undefined,
    socket: js.UndefOr[Double] = js.undefined
  ): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request)) __obj.updateDynamic("request")(request.get.asInstanceOf[js.Any])
    if (!js.isUndefined(response)) __obj.updateDynamic("response")(response.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureConnect)) __obj.updateDynamic("secureConnect")(secureConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(send)) __obj.updateDynamic("send")(send.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socket)) __obj.updateDynamic("socket")(socket.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutOptions]
  }
}

