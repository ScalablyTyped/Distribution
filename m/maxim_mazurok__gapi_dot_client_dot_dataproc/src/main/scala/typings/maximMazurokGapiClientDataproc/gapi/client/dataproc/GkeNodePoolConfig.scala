package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeNodePoolConfig extends StObject {
  
  /** Optional. The autoscaler configuration for this node pool. The autoscaler is enabled only when a valid configuration is present. */
  var autoscaling: js.UndefOr[GkeNodePoolAutoscalingConfig] = js.undefined
  
  /** Optional. The node pool configuration. */
  var config: js.UndefOr[GkeNodeConfig] = js.undefined
  
  /**
    * Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where node pool nodes associated with a Dataproc on GKE virtual cluster will be
    * located.Note: All node pools associated with a virtual cluster must be located in the same region as the virtual cluster, and they must be located in the same zone within that
    * region.If a location is not specified during node pool creation, Dataproc on GKE will choose the zone.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
}
object GkeNodePoolConfig {
  
  inline def apply(): GkeNodePoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeNodePoolConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GkeNodePoolConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoscaling(value: GkeNodePoolAutoscalingConfig): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setConfig(value: GkeNodeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
