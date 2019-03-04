package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timings extends js.Object {
  /**
    * Time spent in a queue waiting for a network connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var blocked: js.UndefOr[scala.Double] = js.undefined
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time required to create TCP connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var connect: js.UndefOr[scala.Double] = js.undefined
  /**
    * DNS resolution time. The time required to resolve a host name.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var dns: js.UndefOr[scala.Double] = js.undefined
  /**
    * Time required to read entire response from the server (or cache).
    *
    * _Not optional and must have non-negative values._
    */
  var receive: scala.Double
  /**
    * Time required to send HTTP request to the server.
    *
    * _Not optional and must have non-negative values._
    */
  var send: js.UndefOr[scala.Double] = js.undefined
  /**
    * Time required for SSL/TLS negotiation.
    *
    * If this field is defined then the time is also included in the connect
    * field (to ensure backward compatibility with HAR 1.1).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var ssl: js.UndefOr[scala.Double] = js.undefined
  /**
    * Waiting for a response from the server.
    *
    * _Not optional and must have non-negative values._
    */
  @JSName("wait")
  var wait_FTimings: scala.Double
}

object Timings {
  @scala.inline
  def apply(
    receive: scala.Double,
    wait: scala.Double,
    blocked: scala.Int | scala.Double = null,
    comment: java.lang.String = null,
    connect: scala.Int | scala.Double = null,
    dns: scala.Int | scala.Double = null,
    send: scala.Int | scala.Double = null,
    ssl: scala.Int | scala.Double = null
  ): Timings = {
    val __obj = js.Dynamic.literal(receive = receive, wait = wait)
    if (blocked != null) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (dns != null) __obj.updateDynamic("dns")(dns.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timings]
  }
}

