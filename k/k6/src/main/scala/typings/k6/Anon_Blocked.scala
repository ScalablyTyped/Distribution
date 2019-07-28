package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocked extends js.Object {
  /** Milliseconds spent blocked before initiating request. */
  var blocked: Double
  /** Milliseconds spent setting up TCP connection to host. */
  var connecting: Double
  /** Total time in milliseconds. `sending+waiting+receiving` */
  var duration: Double
  /** Milliseconds spent receiving response data. */
  var receiving: Double
  /** Milliseconds spent sending request. */
  var sending: Double
  /** Milliseconds spent handshaking TLS session with host. */
  var tls_handshaking: Double
  /** Milliseconds spent waiting for server response (TTFB). */
  var waiting: Double
}

object Anon_Blocked {
  @scala.inline
  def apply(
    blocked: Double,
    connecting: Double,
    duration: Double,
    receiving: Double,
    sending: Double,
    tls_handshaking: Double,
    waiting: Double
  ): Anon_Blocked = {
    val __obj = js.Dynamic.literal(blocked = blocked, connecting = connecting, duration = duration, receiving = receiving, sending = sending, tls_handshaking = tls_handshaking, waiting = waiting)
  
    __obj.asInstanceOf[Anon_Blocked]
  }
}

