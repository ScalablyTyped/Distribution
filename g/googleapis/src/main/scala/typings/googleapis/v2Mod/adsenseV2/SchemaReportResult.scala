package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportResult extends StObject {
  
  /**
    * The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty.
    */
  var averages: js.UndefOr[SchemaRow] = js.undefined
  
  /**
    * Required. End date of the range (inclusive).
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The header information; one for each dimension in the request, followed by one for each metric in the request.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
  
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
  
  /**
    * Required. Start date of the range (inclusive).
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The total number of rows matched by the report request.
    */
  var totalMatchedRows: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty.
    */
  var totals: js.UndefOr[SchemaRow] = js.undefined
  
  /**
    * Any warnings associated with generation of the report. These warnings are always returned in English.
    */
  var warnings: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaReportResult {
  
  inline def apply(): SchemaReportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportResult]
  }
  
  extension [Self <: SchemaReportResult](x: Self) {
    
    inline def setAverages(value: SchemaRow): Self = StObject.set(x, "averages", value.asInstanceOf[js.Any])
    
    inline def setAveragesUndefined: Self = StObject.set(x, "averages", js.undefined)
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTotalMatchedRows(value: String): Self = StObject.set(x, "totalMatchedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalMatchedRowsNull: Self = StObject.set(x, "totalMatchedRows", null)
    
    inline def setTotalMatchedRowsUndefined: Self = StObject.set(x, "totalMatchedRows", js.undefined)
    
    inline def setTotals(value: SchemaRow): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
