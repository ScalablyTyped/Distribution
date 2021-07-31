package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunRealtimeReportResponse extends StObject {
  
  /** Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in rows. */
  var dimensionHeaders: js.UndefOr[js.Array[DimensionHeader]] = js.undefined
  
  /** If requested, the maximum values of metrics. */
  var maximums: js.UndefOr[js.Array[Row]] = js.undefined
  
  /** Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows. */
  var metricHeaders: js.UndefOr[js.Array[MetricHeader]] = js.undefined
  
  /** If requested, the minimum values of metrics. */
  var minimums: js.UndefOr[js.Array[Row]] = js.undefined
  
  /** This Analytics Property's Realtime quota state including this request. */
  var propertyQuota: js.UndefOr[PropertyQuota] = js.undefined
  
  /**
    * The total number of rows in the query result, regardless of the number of rows returned in the response. For example if a query returns 175 rows and includes limit = 50 in the API
    * request, the response will contain row_count = 175 but only 50 rows.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /** Rows of dimension value combinations and metric values in the report. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
  
  /** If requested, the totaled values of metrics. */
  var totals: js.UndefOr[js.Array[Row]] = js.undefined
}
object RunRealtimeReportResponse {
  
  @scala.inline
  def apply(): RunRealtimeReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunRealtimeReportResponse]
  }
  
  @scala.inline
  implicit class RunRealtimeReportResponseMutableBuilder[Self <: RunRealtimeReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionHeaders(value: js.Array[DimensionHeader]): Self = StObject.set(x, "dimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionHeadersUndefined: Self = StObject.set(x, "dimensionHeaders", js.undefined)
    
    @scala.inline
    def setDimensionHeadersVarargs(value: DimensionHeader*): Self = StObject.set(x, "dimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaximums(value: js.Array[Row]): Self = StObject.set(x, "maximums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumsUndefined: Self = StObject.set(x, "maximums", js.undefined)
    
    @scala.inline
    def setMaximumsVarargs(value: Row*): Self = StObject.set(x, "maximums", js.Array(value :_*))
    
    @scala.inline
    def setMetricHeaders(value: js.Array[MetricHeader]): Self = StObject.set(x, "metricHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeadersUndefined: Self = StObject.set(x, "metricHeaders", js.undefined)
    
    @scala.inline
    def setMetricHeadersVarargs(value: MetricHeader*): Self = StObject.set(x, "metricHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMinimums(value: js.Array[Row]): Self = StObject.set(x, "minimums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumsUndefined: Self = StObject.set(x, "minimums", js.undefined)
    
    @scala.inline
    def setMinimumsVarargs(value: Row*): Self = StObject.set(x, "minimums", js.Array(value :_*))
    
    @scala.inline
    def setPropertyQuota(value: PropertyQuota): Self = StObject.set(x, "propertyQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyQuotaUndefined: Self = StObject.set(x, "propertyQuota", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotals(value: js.Array[Row]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    @scala.inline
    def setTotalsVarargs(value: Row*): Self = StObject.set(x, "totals", js.Array(value :_*))
  }
}
