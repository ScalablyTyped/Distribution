package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'nonceFunc' | 'timestampSkewSec' | 'localtimeOffsetMsec'> */
@js.native
trait AuthenticateMessageOptions extends js.Object {
  
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  
  var nonceFunc: js.UndefOr[NonceFunc] = js.native
  
  var timestampSkewSec: js.UndefOr[Double] = js.native
}
object AuthenticateMessageOptions {
  
  @scala.inline
  def apply(): AuthenticateMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateMessageOptions]
  }
  
  @scala.inline
  implicit class AuthenticateMessageOptionsOps[Self <: AuthenticateMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setLocaltimeOffsetMsec(value: Double): Self = this.set("localtimeOffsetMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaltimeOffsetMsec: Self = this.set("localtimeOffsetMsec", js.undefined)
    
    @scala.inline
    def setNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = this.set("nonceFunc", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNonceFunc: Self = this.set("nonceFunc", js.undefined)
    
    @scala.inline
    def setTimestampSkewSec(value: Double): Self = this.set("timestampSkewSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampSkewSec: Self = this.set("timestampSkewSec", js.undefined)
  }
}
