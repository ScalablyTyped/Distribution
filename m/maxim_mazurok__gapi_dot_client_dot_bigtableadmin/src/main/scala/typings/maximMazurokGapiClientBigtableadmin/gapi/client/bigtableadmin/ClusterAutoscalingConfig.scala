package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAutoscalingConfig extends StObject {
  
  /** Required. Autoscaling limits for this cluster. */
  var autoscalingLimits: js.UndefOr[AutoscalingLimits] = js.undefined
  
  /** Required. Autoscaling targets for this cluster. */
  var autoscalingTargets: js.UndefOr[AutoscalingTargets] = js.undefined
}
object ClusterAutoscalingConfig {
  
  inline def apply(): ClusterAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAutoscalingConfig]
  }
  
  extension [Self <: ClusterAutoscalingConfig](x: Self) {
    
    inline def setAutoscalingLimits(value: AutoscalingLimits): Self = StObject.set(x, "autoscalingLimits", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingLimitsUndefined: Self = StObject.set(x, "autoscalingLimits", js.undefined)
    
    inline def setAutoscalingTargets(value: AutoscalingTargets): Self = StObject.set(x, "autoscalingTargets", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingTargetsUndefined: Self = StObject.set(x, "autoscalingTargets", js.undefined)
  }
}
