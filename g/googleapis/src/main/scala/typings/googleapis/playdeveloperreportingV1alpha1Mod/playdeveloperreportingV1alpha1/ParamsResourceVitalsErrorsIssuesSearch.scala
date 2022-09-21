package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVitalsErrorsIssuesSearch
  extends StObject
     with StandardParameters {
  
  /**
    * A selection predicate to retrieve only a subset of the issues. Counts in the returned error issues will only reflect occurrences that matched the filter. For filtering basics, please check [AIP-160](https://google.aip.dev/160). ** Supported field names:** * `apiLevel`: Matches error issues that occurred in the requested Android versions (specified as the numeric API level) only. Example: `apiLevel = 28 OR apiLevel = 29`. * `versionCode`: Matches error issues that occurred in the requested app version codes only. Example: `versionCode = 123 OR versionCode = 456`. * `deviceModel`: Matches error issues that occurred in the requested devices. Example: `deviceModel = "walleye" OR deviceModel = "marlin"`. * `deviceType`: Matches error issues that occurred in the requested device types. Example: `deviceType = "PHONE"`. * `errorIssueType`: Matches error issues of the requested types only. Valid candidates: `CRASH`, `ANR`. Example: `errorIssueType = CRASH OR errorIssueType = ANR`. ** Supported operators:** * Comparison operators: The only supported comparison operator is equality. The filtered field must appear on the left hand side of the comparison. * Logical Operators: Logical operators `AND` and `OR` can be used to build complex filters following a conjunctive normal form (CNF), i.e., conjunctions of disjunctions. The `OR` operator takes precedence over `AND` so the use of parenthesis is not necessary when building CNF. The `OR` operator is only supported to build disjunctions that apply to the same field, e.g., `versionCode = 123 OR errorIssueType = ANR` is not a valid filter. ** Examples ** Some valid filtering expressions: * `versionCode = 123 AND errorIssueType = ANR` * `versionCode = 123 AND errorIssueType = OR errorIssueType = CRASH` * `versionCode = 123 AND (errorIssueType = OR errorIssueType = CRASH)`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a datetime without a day.
    */
  @JSName("interval.endTime.day")
  var intervalDotendTimeDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Hours of day in 24 hour format. Should be from 0 to 23, defaults to 0 (midnight). An API may choose to allow the value "24:00:00" for scenarios like business closing time.
    */
  @JSName("interval.endTime.hours")
  var intervalDotendTimeDothours: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Minutes of hour of day. Must be from 0 to 59, defaults to 0.
    */
  @JSName("interval.endTime.minutes")
  var intervalDotendTimeDotminutes: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Month of year. Must be from 1 to 12, or 0 if specifying a datetime without a month.
    */
  @JSName("interval.endTime.month")
  var intervalDotendTimeDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999, defaults to 0.
    */
  @JSName("interval.endTime.nanos")
  var intervalDotendTimeDotnanos: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Seconds of minutes of the time. Must normally be from 0 to 59, defaults to 0. An API may allow the value 60 if it allows leap-seconds.
    */
  @JSName("interval.endTime.seconds")
  var intervalDotendTimeDotseconds: js.UndefOr[Double] = js.undefined
  
  /**
    * IANA Time Zone Database time zone, e.g. "America/New_York".
    */
  @JSName("interval.endTime.timeZone.id")
  var intervalDotendTimeDottimeZoneDotid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. IANA Time Zone Database version number, e.g. "2019a".
    */
  @JSName("interval.endTime.timeZone.version")
  var intervalDotendTimeDottimeZoneDotversion: js.UndefOr[String] = js.undefined
  
  /**
    * UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 \}.
    */
  @JSName("interval.endTime.utcOffset")
  var intervalDotendTimeDotutcOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year.
    */
  @JSName("interval.endTime.year")
  var intervalDotendTimeDotyear: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a datetime without a day.
    */
  @JSName("interval.startTime.day")
  var intervalDotstartTimeDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Hours of day in 24 hour format. Should be from 0 to 23, defaults to 0 (midnight). An API may choose to allow the value "24:00:00" for scenarios like business closing time.
    */
  @JSName("interval.startTime.hours")
  var intervalDotstartTimeDothours: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Minutes of hour of day. Must be from 0 to 59, defaults to 0.
    */
  @JSName("interval.startTime.minutes")
  var intervalDotstartTimeDotminutes: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Month of year. Must be from 1 to 12, or 0 if specifying a datetime without a month.
    */
  @JSName("interval.startTime.month")
  var intervalDotstartTimeDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999, defaults to 0.
    */
  @JSName("interval.startTime.nanos")
  var intervalDotstartTimeDotnanos: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Seconds of minutes of the time. Must normally be from 0 to 59, defaults to 0. An API may allow the value 60 if it allows leap-seconds.
    */
  @JSName("interval.startTime.seconds")
  var intervalDotstartTimeDotseconds: js.UndefOr[Double] = js.undefined
  
  /**
    * IANA Time Zone Database time zone, e.g. "America/New_York".
    */
  @JSName("interval.startTime.timeZone.id")
  var intervalDotstartTimeDottimeZoneDotid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. IANA Time Zone Database version number, e.g. "2019a".
    */
  @JSName("interval.startTime.timeZone.version")
  var intervalDotstartTimeDottimeZoneDotversion: js.UndefOr[String] = js.undefined
  
  /**
    * UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 \}.
    */
  @JSName("interval.startTime.utcOffset")
  var intervalDotstartTimeDotutcOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year.
    */
  @JSName("interval.startTime.year")
  var intervalDotstartTimeDotyear: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of error issues to return. The service may return fewer than this value. If unspecified, at most 50 error issues will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to the request must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the error issues, indicating the application for which they were received. Format: apps/{app\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceVitalsErrorsIssuesSearch {
  
  inline def apply(): ParamsResourceVitalsErrorsIssuesSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVitalsErrorsIssuesSearch]
  }
  
  extension [Self <: ParamsResourceVitalsErrorsIssuesSearch](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIntervalDotendTimeDotday(value: Double): Self = StObject.set(x, "interval.endTime.day", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotdayUndefined: Self = StObject.set(x, "interval.endTime.day", js.undefined)
    
    inline def setIntervalDotendTimeDothours(value: Double): Self = StObject.set(x, "interval.endTime.hours", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDothoursUndefined: Self = StObject.set(x, "interval.endTime.hours", js.undefined)
    
    inline def setIntervalDotendTimeDotminutes(value: Double): Self = StObject.set(x, "interval.endTime.minutes", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotminutesUndefined: Self = StObject.set(x, "interval.endTime.minutes", js.undefined)
    
    inline def setIntervalDotendTimeDotmonth(value: Double): Self = StObject.set(x, "interval.endTime.month", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotmonthUndefined: Self = StObject.set(x, "interval.endTime.month", js.undefined)
    
    inline def setIntervalDotendTimeDotnanos(value: Double): Self = StObject.set(x, "interval.endTime.nanos", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotnanosUndefined: Self = StObject.set(x, "interval.endTime.nanos", js.undefined)
    
    inline def setIntervalDotendTimeDotseconds(value: Double): Self = StObject.set(x, "interval.endTime.seconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotsecondsUndefined: Self = StObject.set(x, "interval.endTime.seconds", js.undefined)
    
    inline def setIntervalDotendTimeDottimeZoneDotid(value: String): Self = StObject.set(x, "interval.endTime.timeZone.id", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDottimeZoneDotidUndefined: Self = StObject.set(x, "interval.endTime.timeZone.id", js.undefined)
    
    inline def setIntervalDotendTimeDottimeZoneDotversion(value: String): Self = StObject.set(x, "interval.endTime.timeZone.version", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDottimeZoneDotversionUndefined: Self = StObject.set(x, "interval.endTime.timeZone.version", js.undefined)
    
    inline def setIntervalDotendTimeDotutcOffset(value: String): Self = StObject.set(x, "interval.endTime.utcOffset", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotutcOffsetUndefined: Self = StObject.set(x, "interval.endTime.utcOffset", js.undefined)
    
    inline def setIntervalDotendTimeDotyear(value: Double): Self = StObject.set(x, "interval.endTime.year", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeDotyearUndefined: Self = StObject.set(x, "interval.endTime.year", js.undefined)
    
    inline def setIntervalDotstartTimeDotday(value: Double): Self = StObject.set(x, "interval.startTime.day", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotdayUndefined: Self = StObject.set(x, "interval.startTime.day", js.undefined)
    
    inline def setIntervalDotstartTimeDothours(value: Double): Self = StObject.set(x, "interval.startTime.hours", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDothoursUndefined: Self = StObject.set(x, "interval.startTime.hours", js.undefined)
    
    inline def setIntervalDotstartTimeDotminutes(value: Double): Self = StObject.set(x, "interval.startTime.minutes", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotminutesUndefined: Self = StObject.set(x, "interval.startTime.minutes", js.undefined)
    
    inline def setIntervalDotstartTimeDotmonth(value: Double): Self = StObject.set(x, "interval.startTime.month", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotmonthUndefined: Self = StObject.set(x, "interval.startTime.month", js.undefined)
    
    inline def setIntervalDotstartTimeDotnanos(value: Double): Self = StObject.set(x, "interval.startTime.nanos", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotnanosUndefined: Self = StObject.set(x, "interval.startTime.nanos", js.undefined)
    
    inline def setIntervalDotstartTimeDotseconds(value: Double): Self = StObject.set(x, "interval.startTime.seconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotsecondsUndefined: Self = StObject.set(x, "interval.startTime.seconds", js.undefined)
    
    inline def setIntervalDotstartTimeDottimeZoneDotid(value: String): Self = StObject.set(x, "interval.startTime.timeZone.id", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDottimeZoneDotidUndefined: Self = StObject.set(x, "interval.startTime.timeZone.id", js.undefined)
    
    inline def setIntervalDotstartTimeDottimeZoneDotversion(value: String): Self = StObject.set(x, "interval.startTime.timeZone.version", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDottimeZoneDotversionUndefined: Self = StObject.set(x, "interval.startTime.timeZone.version", js.undefined)
    
    inline def setIntervalDotstartTimeDotutcOffset(value: String): Self = StObject.set(x, "interval.startTime.utcOffset", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotutcOffsetUndefined: Self = StObject.set(x, "interval.startTime.utcOffset", js.undefined)
    
    inline def setIntervalDotstartTimeDotyear(value: Double): Self = StObject.set(x, "interval.startTime.year", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeDotyearUndefined: Self = StObject.set(x, "interval.startTime.year", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
