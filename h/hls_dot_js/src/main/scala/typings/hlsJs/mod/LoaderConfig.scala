package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderConfig extends StObject {
  
  /**
    * Max number of load retries
    */
  var maxRetry: Double
  
  /**
    * max connection retry delay (ms)
    */
  var maxRetryDelay: Double
  
  /**
    * Delay between an I/O error and following connection retry (ms). This to avoid spamming the server
    */
  var retryDelay: Double
  
  /**
    * Timeout after which `onTimeOut` callback will be triggered (if loading is still not finished after that delay)
    */
  var timeout: Double
}
object LoaderConfig {
  
  @scala.inline
  def apply(maxRetry: Double, maxRetryDelay: Double, retryDelay: Double, timeout: Double): LoaderConfig = {
    val __obj = js.Dynamic.literal(maxRetry = maxRetry.asInstanceOf[js.Any], maxRetryDelay = maxRetryDelay.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderConfig]
  }
  
  @scala.inline
  implicit class LoaderConfigMutableBuilder[Self <: LoaderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRetry(value: Double): Self = StObject.set(x, "maxRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
