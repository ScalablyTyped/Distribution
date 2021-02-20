package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPolicy extends StObject {
  
  /** Whether network policy is enabled on the cluster. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The selected network policy provider. */
  var provider: js.UndefOr[String] = js.native
}
object NetworkPolicy {
  
  @scala.inline
  def apply(): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicy]
  }
  
  @scala.inline
  implicit class NetworkPolicyMutableBuilder[Self <: NetworkPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
