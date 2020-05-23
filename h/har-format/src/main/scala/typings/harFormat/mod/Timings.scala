package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timings extends js.Object {
  /**
    * Time spent in a queue waiting for a network connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var blocked: js.UndefOr[Double] = js.undefined
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Time required to create TCP connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var connect: js.UndefOr[Double] = js.undefined
  /**
    * DNS resolution time. The time required to resolve a host name.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var dns: js.UndefOr[Double] = js.undefined
  /**
    * Time required to read entire response from the server (or cache).
    *
    * _Not optional and must have non-negative values._
    */
  var receive: Double
  /**
    * Time required to send HTTP request to the server.
    *
    * _Not optional and must have non-negative values._
    */
  var send: js.UndefOr[Double] = js.undefined
  /**
    * Time required for SSL/TLS negotiation.
    *
    * If this field is defined then the time is also included in the connect
    * field (to ensure backward compatibility with HAR 1.1).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var ssl: js.UndefOr[Double] = js.undefined
  /**
    * Waiting for a response from the server.
    *
    * _Not optional and must have non-negative values._
    */
  @JSName("wait")
  var wait_FTimings: Double
}

object Timings {
  @scala.inline
  def apply(
    receive: Double,
    wait: Double,
    blocked: js.UndefOr[Double] = js.undefined,
    comment: String = null,
    connect: js.UndefOr[Double] = js.undefined,
    dns: js.UndefOr[Double] = js.undefined,
    send: js.UndefOr[Double] = js.undefined,
    ssl: js.UndefOr[Double] = js.undefined
  ): Timings = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dns)) __obj.updateDynamic("dns")(dns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(send)) __obj.updateDynamic("send")(send.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timings]
  }
}

