package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheck extends StObject {
  
  /**
    * How often (in seconds) to make HTTP requests for this healthcheck. The
    * default value is 5 seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.undefined
  
  /**
    * The description for this health check.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The number of consecutive health check requests that need to succeed
    * before the replica is considered healthy again. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the host header in the HTTP health check request. If left
    * empty (default value), the localhost IP 127.0.0.1 will be used.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this health check.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The localhost request path to send this health check, in the format
    * /path/to/use. For example, /healthcheck.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The TCP port for the health check requests.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * How long (in seconds) to wait before a timeout failure for this
    * healthcheck. The default value is 5 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of consecutive health check requests that need to fail in
    * order to consider the replica unhealthy. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}
object SchemaHealthCheck {
  
  inline def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  
  extension [Self <: SchemaHealthCheck](x: Self) {
    
    inline def setCheckIntervalSec(value: Double): Self = StObject.set(x, "checkIntervalSec", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalSecUndefined: Self = StObject.set(x, "checkIntervalSec", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
    
    inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
