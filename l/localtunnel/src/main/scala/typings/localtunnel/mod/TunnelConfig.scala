package typings.localtunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TunnelConfig extends js.Object {
  
  var allow_invalid_cert: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var local_ca: js.UndefOr[String] = js.native
  
  var local_cert: js.UndefOr[String] = js.native
  
  var local_host: js.UndefOr[String] = js.native
  
  var local_https: js.UndefOr[Boolean] = js.native
  
  var local_key: js.UndefOr[String] = js.native
  
  var subdomain: js.UndefOr[String] = js.native
}
object TunnelConfig {
  
  @scala.inline
  def apply(): TunnelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelConfig]
  }
  
  @scala.inline
  implicit class TunnelConfigOps[Self <: TunnelConfig] (val x: Self) extends AnyVal {
    
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
    def setAllow_invalid_cert(value: Boolean): Self = this.set("allow_invalid_cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_invalid_cert: Self = this.set("allow_invalid_cert", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLocal_ca(value: String): Self = this.set("local_ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_ca: Self = this.set("local_ca", js.undefined)
    
    @scala.inline
    def setLocal_cert(value: String): Self = this.set("local_cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_cert: Self = this.set("local_cert", js.undefined)
    
    @scala.inline
    def setLocal_host(value: String): Self = this.set("local_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_host: Self = this.set("local_host", js.undefined)
    
    @scala.inline
    def setLocal_https(value: Boolean): Self = this.set("local_https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_https: Self = this.set("local_https", js.undefined)
    
    @scala.inline
    def setLocal_key(value: String): Self = this.set("local_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_key: Self = this.set("local_key", js.undefined)
    
    @scala.inline
    def setSubdomain(value: String): Self = this.set("subdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdomain: Self = this.set("subdomain", js.undefined)
  }
}
