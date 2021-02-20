package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for the NetworkPolicy feature.
  * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
  */
@js.native
trait SchemaNetworkPolicy extends StObject {
  
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String] = js.native
}
object SchemaNetworkPolicy {
  
  @scala.inline
  def apply(): SchemaNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicy]
  }
  
  @scala.inline
  implicit class SchemaNetworkPolicyMutableBuilder[Self <: SchemaNetworkPolicy] (val x: Self) extends AnyVal {
    
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
