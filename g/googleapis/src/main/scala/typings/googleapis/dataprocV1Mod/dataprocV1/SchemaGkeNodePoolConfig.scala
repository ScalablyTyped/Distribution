package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNodePoolConfig extends StObject {
  
  /**
    * Optional. The autoscaler configuration for this node pool. The autoscaler is enabled only when a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaGkeNodePoolAutoscalingConfig] = js.undefined
  
  /**
    * Optional. The node pool configuration.
    */
  var config: js.UndefOr[SchemaGkeNodeConfig] = js.undefined
  
  /**
    * Optional. The list of Compute Engine zones (https://cloud.google.com/compute/docs/zones#available) where node pool nodes associated with a Dataproc on GKE virtual cluster will be located.Note: All node pools associated with a virtual cluster must be located in the same region as the virtual cluster, and they must be located in the same zone within that region.If a location is not specified during node pool creation, Dataproc on GKE will choose the zone.
    */
  var locations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGkeNodePoolConfig {
  
  inline def apply(): SchemaGkeNodePoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNodePoolConfig]
  }
  
  extension [Self <: SchemaGkeNodePoolConfig](x: Self) {
    
    inline def setAutoscaling(value: SchemaGkeNodePoolAutoscalingConfig): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setConfig(value: SchemaGkeNodeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
