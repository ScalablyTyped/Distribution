package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpstreamProxy extends js.Object {
  
  /**
    * Will be used as the hostname when launching browsers
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * Will be prepended to the base url when launching browsers and prepended to internal urls as loaded by the browsers
    * @default '/'
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Will be used as the port when launching browsers
    * @default 9875
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Will be used as the protocol when launching browsers
    * @default 'http'
    */
  var protocol: js.UndefOr[String] = js.native
}
object UpstreamProxy {
  
  @scala.inline
  def apply(): UpstreamProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpstreamProxy]
  }
  
  @scala.inline
  implicit class UpstreamProxyOps[Self <: UpstreamProxy] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
