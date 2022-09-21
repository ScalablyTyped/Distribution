package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunReportRequest extends StObject {
  
  /** Cohort group associated with this request. If there is a cohort group in the request the 'cohort' dimension must be present. */
  var cohortSpec: js.UndefOr[CohortSpec] = js.undefined
  
  /** A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the report uses the property's default currency. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Date ranges of data to read. If multiple date ranges are requested, each response row will contain a zero based date range index. If two date ranges overlap, the event data for the
    * overlapping days is included in the response rows for both date ranges. In a cohort request, this `dateRanges` must be unspecified.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.undefined
  
  /**
    * Dimension filters allow you to ask for only specific dimension values in the report. To learn more, see [Fundamentals of Dimension
    * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters) for examples. Metrics cannot be used in this filter.
    */
  var dimensionFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The dimensions requested and displayed. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** If false or unspecified, each row with all metrics equal to 0 will not be returned. If true, these rows will be returned if they are not separately removed by a filter. */
  var keepEmptyRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of rows to return. If unspecified, 10,000 rows are returned. The API returns a maximum of 100,000 rows per request, no matter how many you ask for. `limit` must be
    * positive. The API can also return fewer rows than the requested `limit`, if there aren't as many dimension values as the `limit`. For instance, there are fewer than 300 possible
    * values for the dimension `country`, so when reporting on only `country`, you can't get more than 300 rows, even if you set `limit` to a higher value. To learn more about this
    * pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /** Aggregation of metrics. Aggregated metric values will be shown in rows where the dimension_values are set to "RESERVED_(MetricAggregation)". */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The filter clause of metrics. Applied after aggregating the report's rows, similar to SQL having-clause. Dimensions cannot be used in this filter. */
  var metricFilter: js.UndefOr[FilterExpression] = js.undefined
  
  /** The metrics requested and displayed. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /**
    * The row count of the start row. The first row is counted as row 0. When paging, the first request does not specify offset; or equivalently, sets offset to 0; the first request
    * returns the first `limit` of rows. The second request sets offset to the `limit` of the first request; the second request returns the second `limit` of rows. To learn more about
    * this pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /** Specifies how rows are ordered in the response. */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.undefined
  
  /**
    * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path and not the body. To learn more, see [where to find your Property
    * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a batch request, this property should either be unspecified or consistent with the
    * batch-level property. Example: properties/1234
    */
  var property: js.UndefOr[String] = js.undefined
  
  /** Toggles whether to return the current state of this Analytics Property's quota. Quota is returned in [PropertyQuota](#PropertyQuota). */
  var returnPropertyQuota: js.UndefOr[Boolean] = js.undefined
}
object RunReportRequest {
  
  inline def apply(): RunReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunReportRequest]
  }
  
  extension [Self <: RunReportRequest](x: Self) {
    
    inline def setCohortSpec(value: CohortSpec): Self = StObject.set(x, "cohortSpec", value.asInstanceOf[js.Any])
    
    inline def setCohortSpecUndefined: Self = StObject.set(x, "cohortSpec", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDateRanges(value: js.Array[DateRange]): Self = StObject.set(x, "dateRanges", value.asInstanceOf[js.Any])
    
    inline def setDateRangesUndefined: Self = StObject.set(x, "dateRanges", js.undefined)
    
    inline def setDateRangesVarargs(value: DateRange*): Self = StObject.set(x, "dateRanges", js.Array(value*))
    
    inline def setDimensionFilter(value: FilterExpression): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setKeepEmptyRows(value: Boolean): Self = StObject.set(x, "keepEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyRowsUndefined: Self = StObject.set(x, "keepEmptyRows", js.undefined)
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetricAggregations(value: js.Array[String]): Self = StObject.set(x, "metricAggregations", value.asInstanceOf[js.Any])
    
    inline def setMetricAggregationsUndefined: Self = StObject.set(x, "metricAggregations", js.undefined)
    
    inline def setMetricAggregationsVarargs(value: String*): Self = StObject.set(x, "metricAggregations", js.Array(value*))
    
    inline def setMetricFilter(value: FilterExpression): Self = StObject.set(x, "metricFilter", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterUndefined: Self = StObject.set(x, "metricFilter", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setReturnPropertyQuota(value: Boolean): Self = StObject.set(x, "returnPropertyQuota", value.asInstanceOf[js.Any])
    
    inline def setReturnPropertyQuotaUndefined: Self = StObject.set(x, "returnPropertyQuota", js.undefined)
  }
}
