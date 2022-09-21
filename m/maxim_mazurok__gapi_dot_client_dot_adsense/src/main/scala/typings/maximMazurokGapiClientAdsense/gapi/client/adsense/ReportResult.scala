package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportResult extends StObject {
  
  /** The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var averages: js.UndefOr[Row] = js.undefined
  
  /** Required. End date of the range (inclusive). */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** The header information; one for each dimension in the request, followed by one for each metric in the request. */
  var headers: js.UndefOr[js.Array[Header]] = js.undefined
  
  /** The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
  
  /** Required. Start date of the range (inclusive). */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /** The total number of rows matched by the report request. */
  var totalMatchedRows: js.UndefOr[String] = js.undefined
  
  /** The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var totals: js.UndefOr[Row] = js.undefined
  
  /** Any warnings associated with generation of the report. These warnings are always returned in English. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object ReportResult {
  
  inline def apply(): ReportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportResult]
  }
  
  extension [Self <: ReportResult](x: Self) {
    
    inline def setAverages(value: Row): Self = StObject.set(x, "averages", value.asInstanceOf[js.Any])
    
    inline def setAveragesUndefined: Self = StObject.set(x, "averages", js.undefined)
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTotalMatchedRows(value: String): Self = StObject.set(x, "totalMatchedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalMatchedRowsUndefined: Self = StObject.set(x, "totalMatchedRows", js.undefined)
    
    inline def setTotals(value: Row): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
