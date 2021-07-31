package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadinessCheck extends StObject {
  
  /** A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic. */
  var appStartTimeout: js.UndefOr[String] = js.undefined
  
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive failed checks required before removing traffic. */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  
  /** Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.undefined
  
  /** The request path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Number of consecutive successful checks required before receiving traffic. */
  var successThreshold: js.UndefOr[Double] = js.undefined
  
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[String] = js.undefined
}
object ReadinessCheck {
  
  @scala.inline
  def apply(): ReadinessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadinessCheck]
  }
  
  @scala.inline
  implicit class ReadinessCheckMutableBuilder[Self <: ReadinessCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStartTimeout(value: String): Self = StObject.set(x, "appStartTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStartTimeoutUndefined: Self = StObject.set(x, "appStartTimeout", js.undefined)
    
    @scala.inline
    def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
