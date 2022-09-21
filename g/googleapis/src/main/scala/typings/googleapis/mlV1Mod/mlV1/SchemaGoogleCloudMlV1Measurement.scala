package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Measurement extends StObject {
  
  /**
    * Output only. Time that the trial has been running at the point of this measurement.
    */
  var elapsedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provides a list of metrics that act as inputs into the objective function.
    */
  var metrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1MeasurementMetric]] = js.undefined
  
  /**
    * The number of steps a machine learning model has been trained for. Must be non-negative.
    */
  var stepCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1Measurement {
  
  inline def apply(): SchemaGoogleCloudMlV1Measurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Measurement]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1Measurement](x: Self) {
    
    inline def setElapsedTime(value: String): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeNull: Self = StObject.set(x, "elapsedTime", null)
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaGoogleCloudMlV1MeasurementMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaGoogleCloudMlV1MeasurementMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setStepCount(value: String): Self = StObject.set(x, "stepCount", value.asInstanceOf[js.Any])
    
    inline def setStepCountNull: Self = StObject.set(x, "stepCount", null)
    
    inline def setStepCountUndefined: Self = StObject.set(x, "stepCount", js.undefined)
  }
}
