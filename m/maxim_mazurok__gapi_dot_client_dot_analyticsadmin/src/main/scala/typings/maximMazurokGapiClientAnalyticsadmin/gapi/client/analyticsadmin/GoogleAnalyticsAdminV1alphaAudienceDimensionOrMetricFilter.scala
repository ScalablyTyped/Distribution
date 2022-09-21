package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter extends StObject {
  
  /**
    * Optional. Indicates whether this filter needs dynamic evaluation or not. If set to true, users join the Audience if they ever met the condition (static evaluation). If unset or set
    * to false, user evaluation for an Audience is dynamic; users are added to an Audience when they meet the conditions and then removed when they no longer meet them. This can only be
    * set when Audience scope is ACROSS_ALL_SESSIONS.
    */
  var atAnyPointInTime: js.UndefOr[Boolean] = js.undefined
  
  /** A filter for numeric or date values between certain values on a dimension or metric. */
  var betweenFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter] = js.undefined
  
  /** Required. Immutable. The dimension name or metric name to filter. */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If set, specifies the time window for which to evaluate data in number of days. If not set, then audience data is evaluated against lifetime data (i.e., infinite time
    * window). For example, if set to 1 day, only the current day's data is evaluated. The reference point is the current day when at_any_point_in_time is unset or false. It can only be
    * set when Audience scope is ACROSS_ALL_SESSIONS and cannot be greater than 60 days.
    */
  var inAnyNDayPeriod: js.UndefOr[Double] = js.undefined
  
  /** A filter for a string dimension that matches a particular list of options. */
  var inListFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter] = js.undefined
  
  /** A filter for numeric or date values on a dimension or metric. */
  var numericFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter] = js.undefined
  
  /** A filter for a string-type dimension that matches a particular pattern. */
  var stringFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter](x: Self) {
    
    inline def setAtAnyPointInTime(value: Boolean): Self = StObject.set(x, "atAnyPointInTime", value.asInstanceOf[js.Any])
    
    inline def setAtAnyPointInTimeUndefined: Self = StObject.set(x, "atAnyPointInTime", js.undefined)
    
    inline def setBetweenFilter(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterBetweenFilter): Self = StObject.set(x, "betweenFilter", value.asInstanceOf[js.Any])
    
    inline def setBetweenFilterUndefined: Self = StObject.set(x, "betweenFilter", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setInAnyNDayPeriod(value: Double): Self = StObject.set(x, "inAnyNDayPeriod", value.asInstanceOf[js.Any])
    
    inline def setInAnyNDayPeriodUndefined: Self = StObject.set(x, "inAnyNDayPeriod", js.undefined)
    
    inline def setInListFilter(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter): Self = StObject.set(x, "inListFilter", value.asInstanceOf[js.Any])
    
    inline def setInListFilterUndefined: Self = StObject.set(x, "inListFilter", js.undefined)
    
    inline def setNumericFilter(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterNumericFilter): Self = StObject.set(x, "numericFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericFilterUndefined: Self = StObject.set(x, "numericFilter", js.undefined)
    
    inline def setStringFilter(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterStringFilter): Self = StObject.set(x, "stringFilter", value.asInstanceOf[js.Any])
    
    inline def setStringFilterUndefined: Self = StObject.set(x, "stringFilter", js.undefined)
  }
}
