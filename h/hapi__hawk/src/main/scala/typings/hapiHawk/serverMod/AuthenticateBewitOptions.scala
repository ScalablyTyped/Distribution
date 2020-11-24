package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'hostHeaderName' | 'localtimeOffsetMsec' | 'host' | 'port'> */
@js.native
trait AuthenticateBewitOptions extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var hostHeaderName: js.UndefOr[String] = js.native
  
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
}
object AuthenticateBewitOptions {
  
  @scala.inline
  def apply(): AuthenticateBewitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateBewitOptions]
  }
  
  @scala.inline
  implicit class AuthenticateBewitOptionsOps[Self <: AuthenticateBewitOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostHeaderName(value: String): Self = this.set("hostHeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostHeaderName: Self = this.set("hostHeaderName", js.undefined)
    
    @scala.inline
    def setLocaltimeOffsetMsec(value: Double): Self = this.set("localtimeOffsetMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaltimeOffsetMsec: Self = this.set("localtimeOffsetMsec", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
