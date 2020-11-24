package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudRunConfig extends js.Object {
  
  /** Whether Cloud Run addon is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Which load balancer type is installed for Cloud Run. */
  var loadBalancerType: js.UndefOr[String] = js.native
}
object CloudRunConfig {
  
  @scala.inline
  def apply(): CloudRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRunConfig]
  }
  
  @scala.inline
  implicit class CloudRunConfigOps[Self <: CloudRunConfig] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLoadBalancerType(value: String): Self = this.set("loadBalancerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerType: Self = this.set("loadBalancerType", js.undefined)
  }
}
