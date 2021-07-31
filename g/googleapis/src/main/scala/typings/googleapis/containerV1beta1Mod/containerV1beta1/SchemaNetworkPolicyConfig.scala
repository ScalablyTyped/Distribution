package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for NetworkPolicy. This only tracks whether the addon is
  * enabled or not on the Master, it does not track whether network policy is
  * enabled for the nodes.
  */
trait SchemaNetworkPolicyConfig extends StObject {
  
  /**
    * Whether NetworkPolicy is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaNetworkPolicyConfig {
  
  @scala.inline
  def apply(): SchemaNetworkPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicyConfig]
  }
  
  @scala.inline
  implicit class SchemaNetworkPolicyConfigMutableBuilder[Self <: SchemaNetworkPolicyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
