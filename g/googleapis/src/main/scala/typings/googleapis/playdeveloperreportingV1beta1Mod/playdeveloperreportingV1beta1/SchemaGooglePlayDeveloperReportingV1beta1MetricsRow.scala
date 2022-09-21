package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1MetricsRow extends StObject {
  
  /**
    * Granularity of the aggregation period of the row.
    */
  var aggregationPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension columns in the row.
    */
  var dimensions: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1beta1DimensionValue]] = js.undefined
  
  /**
    * Metric columns in the row.
    */
  var metrics: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1beta1MetricValue]] = js.undefined
  
  /**
    * Starting date (and time for hourly aggregation) of the period covered by this row.
    */
  var startTime: js.UndefOr[SchemaGoogleTypeDateTime] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1MetricsRow {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1MetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1MetricsRow]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1MetricsRow](x: Self) {
    
    inline def setAggregationPeriod(value: String): Self = StObject.set(x, "aggregationPeriod", value.asInstanceOf[js.Any])
    
    inline def setAggregationPeriodNull: Self = StObject.set(x, "aggregationPeriod", null)
    
    inline def setAggregationPeriodUndefined: Self = StObject.set(x, "aggregationPeriod", js.undefined)
    
    inline def setDimensions(value: js.Array[SchemaGooglePlayDeveloperReportingV1beta1DimensionValue]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaGooglePlayDeveloperReportingV1beta1DimensionValue*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetrics(value: js.Array[SchemaGooglePlayDeveloperReportingV1beta1MetricValue]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaGooglePlayDeveloperReportingV1beta1MetricValue*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setStartTime(value: SchemaGoogleTypeDateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
