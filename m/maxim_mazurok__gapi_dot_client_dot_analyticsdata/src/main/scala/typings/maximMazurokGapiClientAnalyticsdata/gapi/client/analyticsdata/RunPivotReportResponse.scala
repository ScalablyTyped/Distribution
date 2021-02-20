package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunPivotReportResponse extends StObject {
  
  /**
    * Aggregation of metric values. Can be totals, minimums, or maximums. The returned aggregations are controlled by the metric_aggregations in the pivot. The type of aggregation
    * returned in each row is shown by the dimension_values which are set to "RESERVED_".
    */
  var aggregates: js.UndefOr[js.Array[Row]] = js.native
  
  /** Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in rows. */
  var dimensionHeaders: js.UndefOr[js.Array[DimensionHeader]] = js.native
  
  /** Metadata for the report. */
  var metadata: js.UndefOr[ResponseMetaData] = js.native
  
  /** Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows. */
  var metricHeaders: js.UndefOr[js.Array[MetricHeader]] = js.native
  
  /**
    * Summarizes the columns and rows created by a pivot. Each pivot in the request produces one header in the response. If we have a request like this: "pivots": [{ "fieldNames":
    * ["country", "city"] }, { "fieldNames": "eventName" }] We will have the following `pivotHeaders` in the response: "pivotHeaders" : [{ "dimensionHeaders": [{ "dimensionValues": [ {
    * "value": "United Kingdom" }, { "value": "London" } ] }, { "dimensionValues": [ { "value": "Japan" }, { "value": "Osaka" } ] }] }, { "dimensionHeaders": [{ "dimensionValues": [{
    * "value": "session_start" }] }, { "dimensionValues": [{ "value": "scroll" }] }] }]
    */
  var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.native
  
  /** This Analytics Property's quota state including this request. */
  var propertyQuota: js.UndefOr[PropertyQuota] = js.native
  
  /** Rows of dimension value combinations and metric values in the report. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
}
object RunPivotReportResponse {
  
  @scala.inline
  def apply(): RunPivotReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPivotReportResponse]
  }
  
  @scala.inline
  implicit class RunPivotReportResponseMutableBuilder[Self <: RunPivotReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregates(value: js.Array[Row]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    @scala.inline
    def setAggregatesVarargs(value: Row*): Self = StObject.set(x, "aggregates", js.Array(value :_*))
    
    @scala.inline
    def setDimensionHeaders(value: js.Array[DimensionHeader]): Self = StObject.set(x, "dimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionHeadersUndefined: Self = StObject.set(x, "dimensionHeaders", js.undefined)
    
    @scala.inline
    def setDimensionHeadersVarargs(value: DimensionHeader*): Self = StObject.set(x, "dimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: ResponseMetaData): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetricHeaders(value: js.Array[MetricHeader]): Self = StObject.set(x, "metricHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeadersUndefined: Self = StObject.set(x, "metricHeaders", js.undefined)
    
    @scala.inline
    def setMetricHeadersVarargs(value: MetricHeader*): Self = StObject.set(x, "metricHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaders(value: js.Array[PivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
    
    @scala.inline
    def setPivotHeadersVarargs(value: PivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPropertyQuota(value: PropertyQuota): Self = StObject.set(x, "propertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyQuotaUndefined: Self = StObject.set(x, "propertyQuota", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
