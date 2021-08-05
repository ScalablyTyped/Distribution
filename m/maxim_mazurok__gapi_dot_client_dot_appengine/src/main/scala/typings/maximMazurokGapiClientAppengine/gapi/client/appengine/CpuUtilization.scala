package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuUtilization extends StObject {
  
  /** Period of time over which CPU utilization is calculated. */
  var aggregationWindowLength: js.UndefOr[String] = js.undefined
  
  /** Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1. */
  var targetUtilization: js.UndefOr[Double] = js.undefined
}
object CpuUtilization {
  
  inline def apply(): CpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuUtilization]
  }
  
  extension [Self <: CpuUtilization](x: Self) {
    
    inline def setAggregationWindowLength(value: String): Self = StObject.set(x, "aggregationWindowLength", value.asInstanceOf[js.Any])
    
    inline def setAggregationWindowLengthUndefined: Self = StObject.set(x, "aggregationWindowLength", js.undefined)
    
    inline def setTargetUtilization(value: Double): Self = StObject.set(x, "targetUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetUtilizationUndefined: Self = StObject.set(x, "targetUtilization", js.undefined)
  }
}
