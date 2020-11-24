package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServerOptions extends js.Object {
  
  /**
    * If present, this should contain a key/cert combo representing a certificate
    * authority that your client trusts. See these instructions for how to
    * generate these files. You'll then need to configure your client to use this
    * proxy for https in addition to http. Once you've got all of that set up,
    * Hoxy will generate fake keys/cert combos for every hostname you visit,
    * caching them in memory for subsequent visits, thus allowing the proxy to
    * handle https requests as cleartext
    */
  var certAuthority: js.UndefOr[CertificateParams] = js.native
  
  /**
    *  If present, this proxy will run as a reverse proxy for the given server.
    *  This allows you to point your client directly at the proxy, instead of
    *  configuring it in the client's proxy settings.
    *  This value should take the form scheme://host:port.
    */
  var reverse: js.UndefOr[String] = js.native
  
  /**
    * Latency emulation
    */
  var slow: js.UndefOr[Slow] = js.native
  
  /**
    * Should only be used in combination with reverse. If present, causes Hoxy to
    * run as an https server. Passed as opts to https.createServer(opts, function)
    */
  var tls: js.UndefOr[CertificateParams] = js.native
  
  /**
    * If present, this proxy will in turn use another proxy.
    * This allows Hoxy to play well with other proxies.
    * This value should take the form host:port
    */
  var upstreamProxy: js.UndefOr[String] = js.native
}
object CreateServerOptions {
  
  @scala.inline
  def apply(): CreateServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerOptions]
  }
  
  @scala.inline
  implicit class CreateServerOptionsOps[Self <: CreateServerOptions] (val x: Self) extends AnyVal {
    
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
    def setCertAuthority(value: CertificateParams): Self = this.set("certAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertAuthority: Self = this.set("certAuthority", js.undefined)
    
    @scala.inline
    def setReverse(value: String): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSlow(value: Slow): Self = this.set("slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlow: Self = this.set("slow", js.undefined)
    
    @scala.inline
    def setTls(value: CertificateParams): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setUpstreamProxy(value: String): Self = this.set("upstreamProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpstreamProxy: Self = this.set("upstreamProxy", js.undefined)
  }
}
