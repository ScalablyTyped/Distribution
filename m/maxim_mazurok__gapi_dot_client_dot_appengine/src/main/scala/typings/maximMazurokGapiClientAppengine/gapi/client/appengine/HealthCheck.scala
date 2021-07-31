package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheck extends StObject {
  
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.undefined
  
  /** Whether to explicitly disable health checks for this instance. */
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  
  /** Number of consecutive successful health checks required before receiving traffic. */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  
  /** Host header to send when performing an HTTP health check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive failed health checks required before an instance is restarted. */
  var restartThreshold: js.UndefOr[Double] = js.undefined
  
  /** Time before the health check is considered failed. */
  var timeout: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive failed health checks required before removing traffic. */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}
object HealthCheck {
  
  @scala.inline
  def apply(): HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheck]
  }
  
  @scala.inline
  implicit class HealthCheckMutableBuilder[Self <: HealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setDisableHealthCheck(value: Boolean): Self = StObject.set(x, "disableHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHealthCheckUndefined: Self = StObject.set(x, "disableHealthCheck", js.undefined)
    
    @scala.inline
    def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setRestartThreshold(value: Double): Self = StObject.set(x, "restartThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartThresholdUndefined: Self = StObject.set(x, "restartThreshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
