package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1TimelineSpec extends StObject {
  
  /**
    * Type of the aggregation period of the datapoints in the timeline. Intervals are identified by the date and time at the start of the interval.
    */
  var aggregationPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ending datapoint of the timeline (exclusive). See start_time for restrictions. The timezone of the end point must match the timezone of the start point.
    */
  var endTime: js.UndefOr[SchemaGoogleTypeDateTime] = js.undefined
  
  /**
    * Starting datapoint of the timeline (inclusive). Must be aligned to the aggregation period as follows: * HOURLY: the 'minutes', 'seconds' and 'nanos' fields must be unset. The time_zone can be left unset (defaults to UTC) or set explicitly to "UTC". Setting any other utc_offset or timezone id will result in a validation error. * DAILY: the 'hours', 'minutes', 'seconds' and 'nanos' fields must be unset. Different metric sets support different timezones. It can be left unset to use the default timezone specified by the metric set. The timezone of the end point must match the timezone of the start point.
    */
  var startTime: js.UndefOr[SchemaGoogleTypeDateTime] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1TimelineSpec {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1TimelineSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1TimelineSpec]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1TimelineSpec](x: Self) {
    
    inline def setAggregationPeriod(value: String): Self = StObject.set(x, "aggregationPeriod", value.asInstanceOf[js.Any])
    
    inline def setAggregationPeriodNull: Self = StObject.set(x, "aggregationPeriod", null)
    
    inline def setAggregationPeriodUndefined: Self = StObject.set(x, "aggregationPeriod", js.undefined)
    
    inline def setEndTime(value: SchemaGoogleTypeDateTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: SchemaGoogleTypeDateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
