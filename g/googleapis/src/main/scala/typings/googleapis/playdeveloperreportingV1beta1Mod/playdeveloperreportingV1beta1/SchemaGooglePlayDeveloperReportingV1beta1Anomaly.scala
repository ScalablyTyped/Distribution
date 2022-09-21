package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1Anomaly extends StObject {
  
  /**
    * Combination of dimensions in which the anomaly was detected.
    */
  var dimensions: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1beta1DimensionValue]] = js.undefined
  
  /**
    * Metric where the anomaly was detected, together with the anomalous value.
    */
  var metric: js.UndefOr[SchemaGooglePlayDeveloperReportingV1beta1MetricValue] = js.undefined
  
  /**
    * Metric set resource where the anomaly was detected.
    */
  var metricSet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the anomaly. Format: apps/{app\}/anomalies/{anomaly\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timeline specification that covers the anomaly period.
    */
  var timelineSpec: js.UndefOr[SchemaGooglePlayDeveloperReportingV1beta1TimelineSpec] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1Anomaly {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1Anomaly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1Anomaly]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1Anomaly](x: Self) {
    
    inline def setDimensions(value: js.Array[SchemaGooglePlayDeveloperReportingV1beta1DimensionValue]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaGooglePlayDeveloperReportingV1beta1DimensionValue*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetric(value: SchemaGooglePlayDeveloperReportingV1beta1MetricValue): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricSet(value: String): Self = StObject.set(x, "metricSet", value.asInstanceOf[js.Any])
    
    inline def setMetricSetNull: Self = StObject.set(x, "metricSet", null)
    
    inline def setMetricSetUndefined: Self = StObject.set(x, "metricSet", js.undefined)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimelineSpec(value: SchemaGooglePlayDeveloperReportingV1beta1TimelineSpec): Self = StObject.set(x, "timelineSpec", value.asInstanceOf[js.Any])
    
    inline def setTimelineSpecUndefined: Self = StObject.set(x, "timelineSpec", js.undefined)
  }
}
