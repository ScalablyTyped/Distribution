package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsistentHashLoadBalancerSettingsHttpCookie extends js.Object {
  
  /** Name of the cookie. */
  var name: js.UndefOr[String] = js.native
  
  /** Path to set for the cookie. */
  var path: js.UndefOr[String] = js.native
  
  /** Lifetime of the cookie. */
  var ttl: js.UndefOr[Duration] = js.native
}
object ConsistentHashLoadBalancerSettingsHttpCookie {
  
  @scala.inline
  def apply(): ConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashLoadBalancerSettingsHttpCookie]
  }
  
  @scala.inline
  implicit class ConsistentHashLoadBalancerSettingsHttpCookieOps[Self <: ConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTtl(value: Duration): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
