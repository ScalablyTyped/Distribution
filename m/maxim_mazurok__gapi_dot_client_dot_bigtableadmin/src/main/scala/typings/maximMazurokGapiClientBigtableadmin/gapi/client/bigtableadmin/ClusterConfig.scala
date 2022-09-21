package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfig extends StObject {
  
  /** Autoscaling configuration for this cluster. */
  var clusterAutoscalingConfig: js.UndefOr[ClusterAutoscalingConfig] = js.undefined
}
object ClusterConfig {
  
  inline def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  extension [Self <: ClusterConfig](x: Self) {
    
    inline def setClusterAutoscalingConfig(value: ClusterAutoscalingConfig): Self = StObject.set(x, "clusterAutoscalingConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterAutoscalingConfigUndefined: Self = StObject.set(x, "clusterAutoscalingConfig", js.undefined)
  }
}
