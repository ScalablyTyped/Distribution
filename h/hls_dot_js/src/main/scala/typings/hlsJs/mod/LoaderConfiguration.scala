package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderConfiguration extends StObject {
  
  var highWaterMark: Double
  
  var maxRetry: Double
  
  var maxRetryDelay: Double
  
  var retryDelay: Double
  
  var timeout: Double
}
object LoaderConfiguration {
  
  inline def apply(
    highWaterMark: Double,
    maxRetry: Double,
    maxRetryDelay: Double,
    retryDelay: Double,
    timeout: Double
  ): LoaderConfiguration = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], maxRetry = maxRetry.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderConfiguration]
  }
  
  extension [Self <: LoaderConfiguration](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setMaxRetry(value: Double): Self = StObject.set(x, "maxRetry", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
