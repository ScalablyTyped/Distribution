package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPolicy extends StObject {
  
  /**
    * The number of seconds that the autoscaler should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the
    * instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds.
    *
    * Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance
    * and time the startup process.
    */
  var coolDownPeriodSec: js.UndefOr[Double] = js.undefined
  
  /** Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group. */
  var cpuUtilization: js.UndefOr[AutoscalingPolicyCpuUtilization] = js.undefined
  
  /** Configuration parameters of autoscaling based on a custom metric. */
  var customMetricUtilizations: js.UndefOr[js.Array[AutoscalingPolicyCustomMetricUtilization]] = js.undefined
  
  /** Configuration parameters of autoscaling based on load balancer. */
  var loadBalancingUtilization: js.UndefOr[AutoscalingPolicyLoadBalancingUtilization] = js.undefined
  
  /**
    * The maximum number of instances that the autoscaler can scale up to. This is required when creating or updating an autoscaler. The maximum number of replicas should not be lower
    * than minimal number of replicas.
    */
  var maxNumReplicas: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of replicas that the autoscaler can scale down to. This cannot be less than 0. If not provided, autoscaler will choose a default value depending on maximum number
    * of instances allowed.
    */
  var minNumReplicas: js.UndefOr[Double] = js.undefined
  
  /** Defines operating mode for this policy. */
  var mode: js.UndefOr[String] = js.undefined
  
  var scaleInControl: js.UndefOr[AutoscalingPolicyScaleInControl] = js.undefined
}
object AutoscalingPolicy {
  
  inline def apply(): AutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicy]
  }
  
  extension [Self <: AutoscalingPolicy](x: Self) {
    
    inline def setCoolDownPeriodSec(value: Double): Self = StObject.set(x, "coolDownPeriodSec", value.asInstanceOf[js.Any])
    
    inline def setCoolDownPeriodSecUndefined: Self = StObject.set(x, "coolDownPeriodSec", js.undefined)
    
    inline def setCpuUtilization(value: AutoscalingPolicyCpuUtilization): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationUndefined: Self = StObject.set(x, "cpuUtilization", js.undefined)
    
    inline def setCustomMetricUtilizations(value: js.Array[AutoscalingPolicyCustomMetricUtilization]): Self = StObject.set(x, "customMetricUtilizations", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricUtilizationsUndefined: Self = StObject.set(x, "customMetricUtilizations", js.undefined)
    
    inline def setCustomMetricUtilizationsVarargs(value: AutoscalingPolicyCustomMetricUtilization*): Self = StObject.set(x, "customMetricUtilizations", js.Array(value :_*))
    
    inline def setLoadBalancingUtilization(value: AutoscalingPolicyLoadBalancingUtilization): Self = StObject.set(x, "loadBalancingUtilization", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingUtilizationUndefined: Self = StObject.set(x, "loadBalancingUtilization", js.undefined)
    
    inline def setMaxNumReplicas(value: Double): Self = StObject.set(x, "maxNumReplicas", value.asInstanceOf[js.Any])
    
    inline def setMaxNumReplicasUndefined: Self = StObject.set(x, "maxNumReplicas", js.undefined)
    
    inline def setMinNumReplicas(value: Double): Self = StObject.set(x, "minNumReplicas", value.asInstanceOf[js.Any])
    
    inline def setMinNumReplicasUndefined: Self = StObject.set(x, "minNumReplicas", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScaleInControl(value: AutoscalingPolicyScaleInControl): Self = StObject.set(x, "scaleInControl", value.asInstanceOf[js.Any])
    
    inline def setScaleInControlUndefined: Self = StObject.set(x, "scaleInControl", js.undefined)
  }
}
