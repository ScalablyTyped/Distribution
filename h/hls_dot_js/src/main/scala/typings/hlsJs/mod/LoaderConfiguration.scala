package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderConfiguration extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var loadPolicy: LoaderConfig
  
  /**
    * @deprecated use LoaderConfig timeoutRetry and errorRetry maxNumRetry
    */
  var maxRetry: Double
  
  /**
    * @deprecated use LoaderConfig timeoutRetry and errorRetry maxRetryDelayMs
    */
  var maxRetryDelay: Double
  
  /**
    * @deprecated use LoaderConfig timeoutRetry and errorRetry retryDelayMs
    */
  var retryDelay: Double
  
  /**
    * @deprecated use LoaderConfig maxTimeToFirstByteMs and maxLoadTimeMs
    */
  var timeout: Double
}
object LoaderConfiguration {
  
  inline def apply(
    loadPolicy: LoaderConfig,
    maxRetry: Double,
    maxRetryDelay: Double,
    retryDelay: Double,
    timeout: Double
  ): LoaderConfiguration = {
    val __obj = js.Dynamic.literal(loadPolicy = loadPolicy.asInstanceOf[js.Any], maxRetry = maxRetry.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderConfiguration] (val x: Self) extends AnyVal {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setLoadPolicy(value: LoaderConfig): Self = StObject.set(x, "loadPolicy", value.asInstanceOf[js.Any])
    
    inline def setMaxRetry(value: Double): Self = StObject.set(x, "maxRetry", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
