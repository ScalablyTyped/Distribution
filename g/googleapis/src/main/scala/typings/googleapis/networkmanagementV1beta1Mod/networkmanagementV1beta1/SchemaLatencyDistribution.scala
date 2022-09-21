package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLatencyDistribution extends StObject {
  
  /**
    * Representative latency percentiles.
    */
  var latencyPercentiles: js.UndefOr[js.Array[SchemaLatencyPercentile]] = js.undefined
}
object SchemaLatencyDistribution {
  
  inline def apply(): SchemaLatencyDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLatencyDistribution]
  }
  
  extension [Self <: SchemaLatencyDistribution](x: Self) {
    
    inline def setLatencyPercentiles(value: js.Array[SchemaLatencyPercentile]): Self = StObject.set(x, "latencyPercentiles", value.asInstanceOf[js.Any])
    
    inline def setLatencyPercentilesUndefined: Self = StObject.set(x, "latencyPercentiles", js.undefined)
    
    inline def setLatencyPercentilesVarargs(value: SchemaLatencyPercentile*): Self = StObject.set(x, "latencyPercentiles", js.Array(value*))
  }
}
