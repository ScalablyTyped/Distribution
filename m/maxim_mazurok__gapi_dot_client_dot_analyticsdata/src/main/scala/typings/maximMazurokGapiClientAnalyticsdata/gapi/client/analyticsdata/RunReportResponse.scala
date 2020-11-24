package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunReportResponse extends js.Object {
  
  /** Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in rows. */
  var dimensionHeaders: js.UndefOr[js.Array[DimensionHeader]] = js.native
  
  /** If requested, the maximum values of metrics. */
  var maximums: js.UndefOr[js.Array[Row]] = js.native
  
  /** Metadata for the report. */
  var metadata: js.UndefOr[ResponseMetaData] = js.native
  
  /** Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows. */
  var metricHeaders: js.UndefOr[js.Array[MetricHeader]] = js.native
  
  /** If requested, the minimum values of metrics. */
  var minimums: js.UndefOr[js.Array[Row]] = js.native
  
  /** This Analytics Property's quota state including this request. */
  var propertyQuota: js.UndefOr[PropertyQuota] = js.native
  
  /**
    * The total number of rows in the query result, regardless of the number of rows returned in the response. For example if a query returns 175 rows and includes limit = 50 in the API
    * request, the response will contain row_count = 175 but only 50 rows. To learn more about this pagination parameter, see
    * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /** Rows of dimension value combinations and metric values in the report. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
  
  /** If requested, the totaled values of metrics. */
  var totals: js.UndefOr[js.Array[Row]] = js.native
}
object RunReportResponse {
  
  @scala.inline
  def apply(): RunReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunReportResponse]
  }
  
  @scala.inline
  implicit class RunReportResponseOps[Self <: RunReportResponse] (val x: Self) extends AnyVal {
    
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
    def setDimensionHeadersVarargs(value: DimensionHeader*): Self = this.set("dimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setDimensionHeaders(value: js.Array[DimensionHeader]): Self = this.set("dimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionHeaders: Self = this.set("dimensionHeaders", js.undefined)
    
    @scala.inline
    def setMaximumsVarargs(value: Row*): Self = this.set("maximums", js.Array(value :_*))
    
    @scala.inline
    def setMaximums(value: js.Array[Row]): Self = this.set("maximums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximums: Self = this.set("maximums", js.undefined)
    
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
    def setMinimumsVarargs(value: Row*): Self = this.set("minimums", js.Array(value :_*))
    
    @scala.inline
    def setMinimums(value: js.Array[Row]): Self = this.set("minimums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimums: Self = this.set("minimums", js.undefined)
    
    @scala.inline
    def setPropertyQuota(value: PropertyQuota): Self = this.set("propertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyQuota: Self = this.set("propertyQuota", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTotalsVarargs(value: Row*): Self = this.set("totals", js.Array(value :_*))
    
    @scala.inline
    def setTotals(value: js.Array[Row]): Self = this.set("totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotals: Self = this.set("totals", js.undefined)
  }
}
