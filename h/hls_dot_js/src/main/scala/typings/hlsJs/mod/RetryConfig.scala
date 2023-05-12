package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.exponential
import typings.hlsJs.hlsJsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryConfig extends StObject {
  
  var backoff: js.UndefOr[exponential | linear] = js.undefined
  
  var maxNumRetry: Double
  
  var maxRetryDelayMs: Double
  
  var retryDelayMs: Double
}
object RetryConfig {
  
  inline def apply(maxNumRetry: Double, maxRetryDelayMs: Double, retryDelayMs: Double): RetryConfig = {
    val __obj = js.Dynamic.literal(maxNumRetry = maxNumRetry.asInstanceOf[js.Any], maxRetryDelayMs = maxRetryDelayMs.asInstanceOf[js.Any], retryDelayMs = retryDelayMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
    
    inline def setBackoff(value: exponential | linear): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
    
    inline def setMaxNumRetry(value: Double): Self = StObject.set(x, "maxNumRetry", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDelayMs(value: Double): Self = StObject.set(x, "maxRetryDelayMs", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayMs(value: Double): Self = StObject.set(x, "retryDelayMs", value.asInstanceOf[js.Any])
  }
}
