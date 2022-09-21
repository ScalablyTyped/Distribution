package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLatencyPercentile extends StObject {
  
  /**
    * percent-th percentile of latency observed, in microseconds. Fraction of percent/100 of samples have latency lower or equal to the value of this field.
    */
  var latencyMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Percentage of samples this data point applies to.
    */
  var percent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLatencyPercentile {
  
  inline def apply(): SchemaLatencyPercentile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLatencyPercentile]
  }
  
  extension [Self <: SchemaLatencyPercentile](x: Self) {
    
    inline def setLatencyMicros(value: String): Self = StObject.set(x, "latencyMicros", value.asInstanceOf[js.Any])
    
    inline def setLatencyMicrosNull: Self = StObject.set(x, "latencyMicros", null)
    
    inline def setLatencyMicrosUndefined: Self = StObject.set(x, "latencyMicros", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentNull: Self = StObject.set(x, "percent", null)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
