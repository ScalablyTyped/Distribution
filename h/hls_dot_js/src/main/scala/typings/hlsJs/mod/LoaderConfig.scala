package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderConfig extends StObject {
  
  var errorRetry: RetryConfig | Null
  
  var maxLoadTimeMs: Double
  
  var maxTimeToFirstByteMs: Double
  
  var timeoutRetry: RetryConfig | Null
}
object LoaderConfig {
  
  inline def apply(maxLoadTimeMs: Double, maxTimeToFirstByteMs: Double): LoaderConfig = {
    val __obj = js.Dynamic.literal(maxLoadTimeMs = maxLoadTimeMs.asInstanceOf[js.Any], maxTimeToFirstByteMs = maxTimeToFirstByteMs.asInstanceOf[js.Any], errorRetry = null, timeoutRetry = null)
    __obj.asInstanceOf[LoaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderConfig] (val x: Self) extends AnyVal {
    
    inline def setErrorRetry(value: RetryConfig): Self = StObject.set(x, "errorRetry", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryNull: Self = StObject.set(x, "errorRetry", null)
    
    inline def setMaxLoadTimeMs(value: Double): Self = StObject.set(x, "maxLoadTimeMs", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeToFirstByteMs(value: Double): Self = StObject.set(x, "maxTimeToFirstByteMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutRetry(value: RetryConfig): Self = StObject.set(x, "timeoutRetry", value.asInstanceOf[js.Any])
    
    inline def setTimeoutRetryNull: Self = StObject.set(x, "timeoutRetry", null)
  }
}
