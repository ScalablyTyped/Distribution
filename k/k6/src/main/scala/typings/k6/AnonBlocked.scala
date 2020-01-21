package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlocked extends js.Object {
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

object AnonBlocked {
  @scala.inline
  def apply(
    blocked: Double,
    connecting: Double,
    duration: Double,
    receiving: Double,
    sending: Double,
    tls_handshaking: Double,
    waiting: Double
  ): AnonBlocked = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], receiving = receiving.asInstanceOf[js.Any], sending = sending.asInstanceOf[js.Any], tls_handshaking = tls_handshaking.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlocked]
  }
}

