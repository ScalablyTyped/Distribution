package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest extends StObject {
  
  /**
    * Date ranges of access records to read. If multiple date ranges are requested, each response row will contain a zero based date range index. If two date ranges overlap, the access records for the overlapping days is included in the response rows for both date ranges. Requests are allowed up to 2 date ranges.
    */
  var dateRanges: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDateRange]] = js.undefined
  
  /**
    * Dimension filters allow you to restrict report response to specific dimension values which match the filter. For example, filtering on access records of a single user. To learn more, see [Fundamentals of Dimension Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters) for examples. Metrics cannot be used in this filter.
    */
  var dimensionFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression] = js.undefined
  
  /**
    * The dimensions requested and displayed in the response. Requests are allowed up to 9 dimensions.
    */
  var dimensions: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDimension]] = js.undefined
  
  /**
    * The number of rows to return. If unspecified, 10,000 rows are returned. The API returns a maximum of 100,000 rows per request, no matter how many you ask for. `limit` must be positive. The API may return fewer rows than the requested `limit`, if there aren't as many remaining rows as the `limit`. For instance, there are fewer than 300 possible values for the dimension `country`, so when reporting on only `country`, you can't get more than 300 rows, even if you set `limit` to a higher value. To learn more about this pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var limit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metric filters allow you to restrict report response to specific metric values which match the filter. Metric filters are applied after aggregating the report's rows, similar to SQL having-clause. Dimensions cannot be used in this filter.
    */
  var metricFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression] = js.undefined
  
  /**
    * The metrics requested and displayed in the response. Requests are allowed up to 10 metrics.
    */
  var metrics: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessMetric]] = js.undefined
  
  /**
    * The row count of the start row. The first row is counted as row 0. If offset is unspecified, it is treated as 0. If offset is zero, then this method will return the first page of results with `limit` entries. To learn more about this pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var offset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies how rows are ordered in the response.
    */
  var orderBys: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy]] = js.undefined
  
  /**
    * Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [AccessQuota](#AccessQuota).
    */
  var returnEntityQuota: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This request's time zone if specified. If unspecified, the property's time zone is used. The request's time zone is used to interpret the start & end dates of the report. Formatted as strings from the IANA Time Zone database (https://www.iana.org/time-zones); for example "America/New_York" or "Asia/Tokyo".
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest](x: Self) {
    
    inline def setDateRanges(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
    
    inline def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
    
    inline def setDateRangesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessDateRange*): Self = StObject.set(x, "dateRanges", js.Array(value*))
    
    inline def setDimensionFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setDimensions(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetricFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessFilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBys(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
    
    inline def setReturnEntityQuota(value: Boolean): Self = StObject.set(x, "returnEntityQuota", value.asInstanceOf[js.Any])
    
    inline def setReturnEntityQuotaNull: Self = StObject.set(x, "returnEntityQuota", null)
    
    inline def setReturnEntityQuotaUndefined: Self = StObject.set(x, "returnEntityQuota", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
