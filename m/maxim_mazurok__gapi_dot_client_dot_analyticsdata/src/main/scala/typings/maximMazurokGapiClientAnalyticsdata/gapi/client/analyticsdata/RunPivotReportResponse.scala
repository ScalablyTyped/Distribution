package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunPivotReportResponse extends js.Object {
  
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
  implicit class RunPivotReportResponseOps[Self <: RunPivotReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatesVarargs(value: Row*): Self = this.set("aggregates", js.Array(value :_*))
    
    @scala.inline
    def setAggregates(value: js.Array[Row]): Self = this.set("aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregates: Self = this.set("aggregates", js.undefined)
    
    @scala.inline
    def setDimensionHeadersVarargs(value: DimensionHeader*): Self = this.set("dimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setDimensionHeaders(value: js.Array[DimensionHeader]): Self = this.set("dimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionHeaders: Self = this.set("dimensionHeaders", js.undefined)
    
    @scala.inline
    def setMetadata(value: ResponseMetaData): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetricHeadersVarargs(value: MetricHeader*): Self = this.set("metricHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMetricHeaders(value: js.Array[MetricHeader]): Self = this.set("metricHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricHeaders: Self = this.set("metricHeaders", js.undefined)
    
    @scala.inline
    def setPivotHeadersVarargs(value: PivotHeader*): Self = this.set("pivotHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaders(value: js.Array[PivotHeader]): Self = this.set("pivotHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotHeaders: Self = this.set("pivotHeaders", js.undefined)
    
    @scala.inline
    def setPropertyQuota(value: PropertyQuota): Self = this.set("propertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyQuota: Self = this.set("propertyQuota", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
