package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer-outlier-detection.SuccessRateEjectionConfig> */
trait PartialSuccessRateEjectio extends StObject {
  
  var enforcement_percentage: js.UndefOr[Double] = js.undefined
  
  var minimum_hosts: js.UndefOr[Double] = js.undefined
  
  var request_volume: js.UndefOr[Double] = js.undefined
  
  var stdev_factor: js.UndefOr[Double] = js.undefined
}
object PartialSuccessRateEjectio {
  
  inline def apply(): PartialSuccessRateEjectio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSuccessRateEjectio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSuccessRateEjectio] (val x: Self) extends AnyVal {
    
    inline def setEnforcement_percentage(value: Double): Self = StObject.set(x, "enforcement_percentage", value.asInstanceOf[js.Any])
    
    inline def setEnforcement_percentageUndefined: Self = StObject.set(x, "enforcement_percentage", js.undefined)
    
    inline def setMinimum_hosts(value: Double): Self = StObject.set(x, "minimum_hosts", value.asInstanceOf[js.Any])
    
    inline def setMinimum_hostsUndefined: Self = StObject.set(x, "minimum_hosts", js.undefined)
    
    inline def setRequest_volume(value: Double): Self = StObject.set(x, "request_volume", value.asInstanceOf[js.Any])
    
    inline def setRequest_volumeUndefined: Self = StObject.set(x, "request_volume", js.undefined)
    
    inline def setStdev_factor(value: Double): Self = StObject.set(x, "stdev_factor", value.asInstanceOf[js.Any])
    
    inline def setStdev_factorUndefined: Self = StObject.set(x, "stdev_factor", js.undefined)
  }
}
