package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticScaling extends StObject {
  
  /**
    * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the
    * autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible
    * environment.
    */
  var coolDownPeriod: js.UndefOr[String] = js.native
  
  /** Target scaling by CPU usage. */
  var cpuUtilization: js.UndefOr[CpuUtilization] = js.native
  
  /** Target scaling by disk usage. */
  var diskUtilization: js.UndefOr[DiskUtilization] = js.native
  
  /** Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value. */
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  
  /** Maximum number of idle instances that should be maintained for this version. */
  var maxIdleInstances: js.UndefOr[Double] = js.native
  
  /** Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it. */
  var maxPendingLatency: js.UndefOr[String] = js.native
  
  /** Maximum number of instances that should be started to handle requests for this version. */
  var maxTotalInstances: js.UndefOr[Double] = js.native
  
  /** Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service. */
  var minIdleInstances: js.UndefOr[Double] = js.native
  
  /** Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it. */
  var minPendingLatency: js.UndefOr[String] = js.native
  
  /** Minimum number of running instances that should be maintained for this version. */
  var minTotalInstances: js.UndefOr[Double] = js.native
  
  /** Target scaling by network usage. */
  var networkUtilization: js.UndefOr[NetworkUtilization] = js.native
  
  /** Target scaling by request utilization. */
  var requestUtilization: js.UndefOr[RequestUtilization] = js.native
  
  /** Scheduler settings for standard environment. */
  var standardSchedulerSettings: js.UndefOr[StandardSchedulerSettings] = js.native
}
object AutomaticScaling {
  
  @scala.inline
  def apply(): AutomaticScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticScaling]
  }
  
  @scala.inline
  implicit class AutomaticScalingMutableBuilder[Self <: AutomaticScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoolDownPeriod(value: String): Self = StObject.set(x, "coolDownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoolDownPeriodUndefined: Self = StObject.set(x, "coolDownPeriod", js.undefined)
    
    @scala.inline
    def setCpuUtilization(value: CpuUtilization): Self = StObject.set(x, "cpuUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUtilizationUndefined: Self = StObject.set(x, "cpuUtilization", js.undefined)
    
    @scala.inline
    def setDiskUtilization(value: DiskUtilization): Self = StObject.set(x, "diskUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUtilizationUndefined: Self = StObject.set(x, "diskUtilization", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setMaxIdleInstances(value: Double): Self = StObject.set(x, "maxIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIdleInstancesUndefined: Self = StObject.set(x, "maxIdleInstances", js.undefined)
    
    @scala.inline
    def setMaxPendingLatency(value: String): Self = StObject.set(x, "maxPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingLatencyUndefined: Self = StObject.set(x, "maxPendingLatency", js.undefined)
    
    @scala.inline
    def setMaxTotalInstances(value: Double): Self = StObject.set(x, "maxTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalInstancesUndefined: Self = StObject.set(x, "maxTotalInstances", js.undefined)
    
    @scala.inline
    def setMinIdleInstances(value: Double): Self = StObject.set(x, "minIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIdleInstancesUndefined: Self = StObject.set(x, "minIdleInstances", js.undefined)
    
    @scala.inline
    def setMinPendingLatency(value: String): Self = StObject.set(x, "minPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPendingLatencyUndefined: Self = StObject.set(x, "minPendingLatency", js.undefined)
    
    @scala.inline
    def setMinTotalInstances(value: Double): Self = StObject.set(x, "minTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTotalInstancesUndefined: Self = StObject.set(x, "minTotalInstances", js.undefined)
    
    @scala.inline
    def setNetworkUtilization(value: NetworkUtilization): Self = StObject.set(x, "networkUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUtilizationUndefined: Self = StObject.set(x, "networkUtilization", js.undefined)
    
    @scala.inline
    def setRequestUtilization(value: RequestUtilization): Self = StObject.set(x, "requestUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUtilizationUndefined: Self = StObject.set(x, "requestUtilization", js.undefined)
    
    @scala.inline
    def setStandardSchedulerSettings(value: StandardSchedulerSettings): Self = StObject.set(x, "standardSchedulerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardSchedulerSettingsUndefined: Self = StObject.set(x, "standardSchedulerSettings", js.undefined)
  }
}
