package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1MeasurementMetric extends StObject {
  
  /**
    * Required. Metric name.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value for this metric.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1MeasurementMetric {
  
  inline def apply(): SchemaGoogleCloudMlV1MeasurementMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1MeasurementMetric]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1MeasurementMetric](x: Self) {
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
