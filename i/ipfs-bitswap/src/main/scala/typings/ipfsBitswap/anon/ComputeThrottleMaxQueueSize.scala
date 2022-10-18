package typings.ipfsBitswap.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeThrottleMaxQueueSize extends StObject {
  
  var computeThrottleMaxQueueSize: Double
  
  var computeThrottleTimeout: Double
  
  var enabled: Boolean
}
object ComputeThrottleMaxQueueSize {
  
  inline def apply(computeThrottleMaxQueueSize: Double, computeThrottleTimeout: Double, enabled: Boolean): ComputeThrottleMaxQueueSize = {
    val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeThrottleMaxQueueSize]
  }
  
  extension [Self <: ComputeThrottleMaxQueueSize](x: Self) {
    
    inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
