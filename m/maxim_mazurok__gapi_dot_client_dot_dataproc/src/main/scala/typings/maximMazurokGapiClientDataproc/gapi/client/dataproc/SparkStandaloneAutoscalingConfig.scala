package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkStandaloneAutoscalingConfig extends StObject {
  
  /**
    * Required. Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully
    * removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
    */
  var gracefulDecommissionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the
    * Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
    */
  var scaleDownFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
    * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
    */
  var scaleDownMinWorkerFraction: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the
    * Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
    */
  var scaleUpFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
    * recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
    */
  var scaleUpMinWorkerFraction: js.UndefOr[Double] = js.undefined
}
object SparkStandaloneAutoscalingConfig {
  
  inline def apply(): SparkStandaloneAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkStandaloneAutoscalingConfig]
  }
  
  extension [Self <: SparkStandaloneAutoscalingConfig](x: Self) {
    
    inline def setGracefulDecommissionTimeout(value: String): Self = StObject.set(x, "gracefulDecommissionTimeout", value.asInstanceOf[js.Any])
    
    inline def setGracefulDecommissionTimeoutUndefined: Self = StObject.set(x, "gracefulDecommissionTimeout", js.undefined)
    
    inline def setScaleDownFactor(value: Double): Self = StObject.set(x, "scaleDownFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleDownFactorUndefined: Self = StObject.set(x, "scaleDownFactor", js.undefined)
    
    inline def setScaleDownMinWorkerFraction(value: Double): Self = StObject.set(x, "scaleDownMinWorkerFraction", value.asInstanceOf[js.Any])
    
    inline def setScaleDownMinWorkerFractionUndefined: Self = StObject.set(x, "scaleDownMinWorkerFraction", js.undefined)
    
    inline def setScaleUpFactor(value: Double): Self = StObject.set(x, "scaleUpFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleUpFactorUndefined: Self = StObject.set(x, "scaleUpFactor", js.undefined)
    
    inline def setScaleUpMinWorkerFraction(value: Double): Self = StObject.set(x, "scaleUpMinWorkerFraction", value.asInstanceOf[js.Any])
    
    inline def setScaleUpMinWorkerFractionUndefined: Self = StObject.set(x, "scaleUpMinWorkerFraction", js.undefined)
  }
}
