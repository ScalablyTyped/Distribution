package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlierDetection extends StObject {
  
  /**
    * The base time that a host is ejected for. The real ejection time is equal to the base ejection time multiplied by the number of times the host has been ejected. Defaults to 30000ms
    * or 30s.
    */
  var baseEjectionTime: js.UndefOr[Duration] = js.native
  
  /** Number of errors before a host is ejected from the connection pool. When the backend host is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5. */
  var consecutiveErrors: js.UndefOr[Double] = js.native
  
  /**
    * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection
    * occurs. Defaults to 3.
    */
  var consecutiveGatewayFailure: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up
    * slowly. Defaults to 0.
    */
  var enforcingConsecutiveErrors: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or
    * to ramp it up slowly. Defaults to 100.
    */
  var enforcingConsecutiveGatewayFailure: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to
    * ramp it up slowly. Defaults to 100.
    */
  var enforcingSuccessRate: js.UndefOr[Double] = js.native
  
  /** Time interval between ejection analysis sweeps. This can result in both new ejections as well as hosts being returned to service. Defaults to 1 second. */
  var interval: js.UndefOr[Duration] = js.native
  
  /** Maximum percentage of hosts in the load balancing pool for the backend service that can be ejected. Defaults to 50%. */
  var maxEjectionPercent: js.UndefOr[Double] = js.native
  
  /**
    * The number of hosts in a cluster that must have enough request volume to detect success rate outliers. If the number of hosts is less than this setting, outlier detection via
    * success rate statistics is not performed for any host in the cluster. Defaults to 5.
    */
  var successRateMinimumHosts: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this host in success rate based outlier detection.
    * If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that host. Defaults to 100.
    */
  var successRateRequestVolume: js.UndefOr[Double] = js.native
  
  /**
    * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of
    * this factor and the standard deviation of the mean success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if the
    * desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
    */
  var successRateStdevFactor: js.UndefOr[Double] = js.native
}
object OutlierDetection {
  
  @scala.inline
  def apply(): OutlierDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlierDetection]
  }
  
  @scala.inline
  implicit class OutlierDetectionMutableBuilder[Self <: OutlierDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseEjectionTime(value: Duration): Self = StObject.set(x, "baseEjectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseEjectionTimeUndefined: Self = StObject.set(x, "baseEjectionTime", js.undefined)
    
    @scala.inline
    def setConsecutiveErrors(value: Double): Self = StObject.set(x, "consecutiveErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsecutiveErrorsUndefined: Self = StObject.set(x, "consecutiveErrors", js.undefined)
    
    @scala.inline
    def setConsecutiveGatewayFailure(value: Double): Self = StObject.set(x, "consecutiveGatewayFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsecutiveGatewayFailureUndefined: Self = StObject.set(x, "consecutiveGatewayFailure", js.undefined)
    
    @scala.inline
    def setEnforcingConsecutiveErrors(value: Double): Self = StObject.set(x, "enforcingConsecutiveErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcingConsecutiveErrorsUndefined: Self = StObject.set(x, "enforcingConsecutiveErrors", js.undefined)
    
    @scala.inline
    def setEnforcingConsecutiveGatewayFailure(value: Double): Self = StObject.set(x, "enforcingConsecutiveGatewayFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcingConsecutiveGatewayFailureUndefined: Self = StObject.set(x, "enforcingConsecutiveGatewayFailure", js.undefined)
    
    @scala.inline
    def setEnforcingSuccessRate(value: Double): Self = StObject.set(x, "enforcingSuccessRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcingSuccessRateUndefined: Self = StObject.set(x, "enforcingSuccessRate", js.undefined)
    
    @scala.inline
    def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setMaxEjectionPercent(value: Double): Self = StObject.set(x, "maxEjectionPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEjectionPercentUndefined: Self = StObject.set(x, "maxEjectionPercent", js.undefined)
    
    @scala.inline
    def setSuccessRateMinimumHosts(value: Double): Self = StObject.set(x, "successRateMinimumHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRateMinimumHostsUndefined: Self = StObject.set(x, "successRateMinimumHosts", js.undefined)
    
    @scala.inline
    def setSuccessRateRequestVolume(value: Double): Self = StObject.set(x, "successRateRequestVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRateRequestVolumeUndefined: Self = StObject.set(x, "successRateRequestVolume", js.undefined)
    
    @scala.inline
    def setSuccessRateStdevFactor(value: Double): Self = StObject.set(x, "successRateStdevFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRateStdevFactorUndefined: Self = StObject.set(x, "successRateStdevFactor", js.undefined)
  }
}
