package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfoFreshness extends StObject {
  
  /**
    * Aggregation period for which data is available.
    */
  var aggregationPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Latest end time for which data is available, for the aggregation period. The time is specified in the metric set's default timezone. *Note:* time ranges in TimelineSpec are represented as `start_time, end_time)`. For example, if the latest available timeline data point for a `DAILY` aggregation period is `2021-06-23 00:00:00 America/Los_Angeles`, the value of this field would be `2021-06-24 00:00:00 America/Los_Angeles` so it can be easily reused in [TimelineSpec.end_time.
    */
  var latestEndTime: js.UndefOr[SchemaGoogleTypeDateTime] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfoFreshness {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfoFreshness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfoFreshness]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfoFreshness](x: Self) {
    
    inline def setAggregationPeriod(value: String): Self = StObject.set(x, "aggregationPeriod", value.asInstanceOf[js.Any])
    
    inline def setAggregationPeriodNull: Self = StObject.set(x, "aggregationPeriod", null)
    
    inline def setAggregationPeriodUndefined: Self = StObject.set(x, "aggregationPeriod", js.undefined)
    
    inline def setLatestEndTime(value: SchemaGoogleTypeDateTime): Self = StObject.set(x, "latestEndTime", value.asInstanceOf[js.Any])
    
    inline def setLatestEndTimeUndefined: Self = StObject.set(x, "latestEndTime", js.undefined)
  }
}
