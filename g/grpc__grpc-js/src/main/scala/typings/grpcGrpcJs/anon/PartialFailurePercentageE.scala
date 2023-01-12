package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer-outlier-detection.FailurePercentageEjectionConfig> */
trait PartialFailurePercentageE extends StObject {
  
  var enforcement_percentage: js.UndefOr[Double] = js.undefined
  
  var minimum_hosts: js.UndefOr[Double] = js.undefined
  
  var request_volume: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object PartialFailurePercentageE {
  
  inline def apply(): PartialFailurePercentageE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailurePercentageE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFailurePercentageE] (val x: Self) extends AnyVal {
    
    inline def setEnforcement_percentage(value: Double): Self = StObject.set(x, "enforcement_percentage", value.asInstanceOf[js.Any])
    
    inline def setEnforcement_percentageUndefined: Self = StObject.set(x, "enforcement_percentage", js.undefined)
    
    inline def setMinimum_hosts(value: Double): Self = StObject.set(x, "minimum_hosts", value.asInstanceOf[js.Any])
    
    inline def setMinimum_hostsUndefined: Self = StObject.set(x, "minimum_hosts", js.undefined)
    
    inline def setRequest_volume(value: Double): Self = StObject.set(x, "request_volume", value.asInstanceOf[js.Any])
    
    inline def setRequest_volumeUndefined: Self = StObject.set(x, "request_volume", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
