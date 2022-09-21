package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaRunAccessReportResponse extends StObject {
  
  /**
    * The header for a column in the report that corresponds to a specific dimension. The number of DimensionHeaders and ordering of DimensionHeaders matches the dimensions present in
    * rows.
    */
  var dimensionHeaders: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessDimensionHeader]] = js.undefined
  
  /** The header for a column in the report that corresponds to a specific metric. The number of MetricHeaders and ordering of MetricHeaders matches the metrics present in rows. */
  var metricHeaders: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessMetricHeader]] = js.undefined
  
  /** The quota state for this Analytics property including this request. */
  var quota: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessQuota] = js.undefined
  
  /**
    * The total number of rows in the query result. `rowCount` is independent of the number of rows returned in the response, the `limit` request parameter, and the `offset` request
    * parameter. For example if a query returns 175 rows and includes `limit` of 50 in the API request, the response will contain `rowCount` of 175 but only 50 rows. To learn more about
    * this pagination parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /** Rows of dimension value combinations and metric values in the report. */
  var rows: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessRow]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaRunAccessReportResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaRunAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaRunAccessReportResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaRunAccessReportResponse](x: Self) {
    
    inline def setDimensionHeaders(value: js.Array[GoogleAnalyticsAdminV1alphaAccessDimensionHeader]): Self = StObject.set(x, "dimensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setDimensionHeadersUndefined: Self = StObject.set(x, "dimensionHeaders", js.undefined)
    
    inline def setDimensionHeadersVarargs(value: GoogleAnalyticsAdminV1alphaAccessDimensionHeader*): Self = StObject.set(x, "dimensionHeaders", js.Array(value*))
    
    inline def setMetricHeaders(value: js.Array[GoogleAnalyticsAdminV1alphaAccessMetricHeader]): Self = StObject.set(x, "metricHeaders", value.asInstanceOf[js.Any])
    
    inline def setMetricHeadersUndefined: Self = StObject.set(x, "metricHeaders", js.undefined)
    
    inline def setMetricHeadersVarargs(value: GoogleAnalyticsAdminV1alphaAccessMetricHeader*): Self = StObject.set(x, "metricHeaders", js.Array(value*))
    
    inline def setQuota(value: GoogleAnalyticsAdminV1alphaAccessQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[GoogleAnalyticsAdminV1alphaAccessRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: GoogleAnalyticsAdminV1alphaAccessRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
