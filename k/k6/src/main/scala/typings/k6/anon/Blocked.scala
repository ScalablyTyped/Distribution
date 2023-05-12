package typings.k6.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocked extends StObject {
  
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
object Blocked {
  
  inline def apply(
    blocked: Double,
    connecting: Double,
    duration: Double,
    receiving: Double,
    sending: Double,
    tls_handshaking: Double,
    waiting: Double
  ): Blocked = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], receiving = receiving.asInstanceOf[js.Any], sending = sending.asInstanceOf[js.Any], tls_handshaking = tls_handshaking.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blocked] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setConnecting(value: Double): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setReceiving(value: Double): Self = StObject.set(x, "receiving", value.asInstanceOf[js.Any])
    
    inline def setSending(value: Double): Self = StObject.set(x, "sending", value.asInstanceOf[js.Any])
    
    inline def setTls_handshaking(value: Double): Self = StObject.set(x, "tls_handshaking", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}
