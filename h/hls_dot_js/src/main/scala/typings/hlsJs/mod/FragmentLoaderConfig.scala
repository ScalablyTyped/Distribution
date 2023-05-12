package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentLoaderConfig extends StObject {
  
  var fragLoadingMaxRetry: Double
  
  var fragLoadingMaxRetryTimeout: Double
  
  var fragLoadingRetryDelay: Double
  
  var fragLoadingTimeOut: Double
}
object FragmentLoaderConfig {
  
  inline def apply(
    fragLoadingMaxRetry: Double,
    fragLoadingMaxRetryTimeout: Double,
    fragLoadingRetryDelay: Double,
    fragLoadingTimeOut: Double
  ): FragmentLoaderConfig = {
    val __obj = js.Dynamic.literal(fragLoadingMaxRetry = fragLoadingMaxRetry.asInstanceOf[js.Any], fragLoadingMaxRetryTimeout = fragLoadingMaxRetryTimeout.asInstanceOf[js.Any], fragLoadingRetryDelay = fragLoadingRetryDelay.asInstanceOf[js.Any], fragLoadingTimeOut = fragLoadingTimeOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentLoaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentLoaderConfig] (val x: Self) extends AnyVal {
    
    inline def setFragLoadingMaxRetry(value: Double): Self = StObject.set(x, "fragLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "fragLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingRetryDelay(value: Double): Self = StObject.set(x, "fragLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingTimeOut(value: Double): Self = StObject.set(x, "fragLoadingTimeOut", value.asInstanceOf[js.Any])
  }
}
