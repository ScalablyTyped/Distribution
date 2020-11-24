package typings.k6.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocked extends js.Object {
  
  /** Milliseconds spent blocked before initiating request. */
  var blocked: Double = js.native
  
  /** Milliseconds spent setting up TCP connection to host. */
  var connecting: Double = js.native
  
  /** Total time in milliseconds. `sending+waiting+receiving` */
  var duration: Double = js.native
  
  /** Milliseconds spent receiving response data. */
  var receiving: Double = js.native
  
  /** Milliseconds spent sending request. */
  var sending: Double = js.native
  
  /** Milliseconds spent handshaking TLS session with host. */
  var tls_handshaking: Double = js.native
  
  /** Milliseconds spent waiting for server response (TTFB). */
  var waiting: Double = js.native
}
object Blocked {
  
  @scala.inline
  def apply(
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
  implicit class BlockedOps[Self <: Blocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocked(value: Double): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnecting(value: Double): Self = this.set("connecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiving(value: Double): Self = this.set("receiving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSending(value: Double): Self = this.set("sending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_handshaking(value: Double): Self = this.set("tls_handshaking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: Double): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
