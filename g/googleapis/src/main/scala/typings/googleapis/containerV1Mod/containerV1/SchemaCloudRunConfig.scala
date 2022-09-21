package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudRunConfig extends StObject {
  
  /**
    * Whether Cloud Run addon is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Which load balancer type is installed for Cloud Run.
    */
  var loadBalancerType: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudRunConfig {
  
  inline def apply(): SchemaCloudRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunConfig]
  }
  
  extension [Self <: SchemaCloudRunConfig](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeNull: Self = StObject.set(x, "loadBalancerType", null)
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
