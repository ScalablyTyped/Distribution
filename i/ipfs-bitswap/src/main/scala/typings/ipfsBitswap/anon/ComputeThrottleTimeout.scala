package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcStatsMod.AverageIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeThrottleTimeout extends StObject {
  
  var computeThrottleMaxQueueSize: Double
  
  var computeThrottleTimeout: Double
  
  var enabled: Boolean
  
  var movingAverageIntervals: AverageIntervals
}
object ComputeThrottleTimeout {
  
  inline def apply(
    computeThrottleMaxQueueSize: Double,
    computeThrottleTimeout: Double,
    enabled: Boolean,
    movingAverageIntervals: AverageIntervals
  ): ComputeThrottleTimeout = {
    val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], movingAverageIntervals = movingAverageIntervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeThrottleTimeout]
  }
  
  extension [Self <: ComputeThrottleTimeout](x: Self) {
    
    inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMovingAverageIntervals(value: AverageIntervals): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
  }
}
