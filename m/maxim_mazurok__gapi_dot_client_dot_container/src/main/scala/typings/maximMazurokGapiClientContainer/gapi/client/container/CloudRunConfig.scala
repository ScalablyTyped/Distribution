package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudRunConfig extends StObject {
  
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
  implicit class CloudRunConfigMutableBuilder[Self <: CloudRunConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
