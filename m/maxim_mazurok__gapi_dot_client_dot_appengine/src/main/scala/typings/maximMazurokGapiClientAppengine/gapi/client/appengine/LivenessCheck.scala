package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivenessCheck extends StObject {
  
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive failed checks required before considering the VM unhealthy. */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  
  /** Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.undefined
  
  /** The initial delay before starting to execute the checks. */
  var initialDelay: js.UndefOr[String] = js.undefined
  
  /** The request path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive successful checks required before considering the VM healthy. */
  var successThreshold: js.UndefOr[Double] = js.undefined
  
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[String] = js.undefined
}
object LivenessCheck {
  
  inline def apply(): LivenessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivenessCheck]
  }
  
  extension [Self <: LivenessCheck](x: Self) {
    
    inline def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInitialDelay(value: String): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    
    inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
