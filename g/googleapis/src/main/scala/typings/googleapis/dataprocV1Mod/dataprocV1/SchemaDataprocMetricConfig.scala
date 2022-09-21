package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataprocMetricConfig extends StObject {
  
  /**
    * Required. Metrics sources to enable.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
}
object SchemaDataprocMetricConfig {
  
  inline def apply(): SchemaDataprocMetricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataprocMetricConfig]
  }
  
  extension [Self <: SchemaDataprocMetricConfig](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}
