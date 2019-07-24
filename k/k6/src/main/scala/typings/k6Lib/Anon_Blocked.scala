package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocked extends js.Object {
  /** Milliseconds spent blocked before initiating request. */
  var blocked: scala.Double
  /** Milliseconds spent setting up TCP connection to host. */
  var connecting: scala.Double
  /** Total time in milliseconds. `sending+waiting+receiving` */
  var duration: scala.Double
  /** Milliseconds spent receiving response data. */
  var receiving: scala.Double
  /** Milliseconds spent sending request. */
  var sending: scala.Double
  /** Milliseconds spent handshaking TLS session with host. */
  var tls_handshaking: scala.Double
  /** Milliseconds spent waiting for server response (TTFB). */
  var waiting: scala.Double
}

object Anon_Blocked {
  @scala.inline
  def apply(
    blocked: scala.Double,
    connecting: scala.Double,
    duration: scala.Double,
    receiving: scala.Double,
    sending: scala.Double,
    tls_handshaking: scala.Double,
    waiting: scala.Double
  ): Anon_Blocked = {
    val __obj = js.Dynamic.literal(blocked = blocked, connecting = connecting, duration = duration, receiving = receiving, sending = sending, tls_handshaking = tls_handshaking, waiting = waiting)
  
    __obj.asInstanceOf[Anon_Blocked]
  }
}

